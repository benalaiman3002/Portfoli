drop database ej60;
create database ej60;
use ej60;
CREATE TABLE moviment
(compte VARCHAR(10) NOT NULL,
data TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP(),
descripcio VARCHAR(30) NOT NULL,
tipus ENUM('H','D') NOT NULL,
valor DECIMAL(7,2) NOT NULL
);

CREATE TABLE saldo
(compte VARCHAR(10) PRIMARY KEY,
saldo DECIMAL(7,2) NOT NULL
);

CREATE TABLE saldo_diari
(data  DATE PRIMARY KEY,
saldo DECIMAL(7,2) NOT NULL
);

CREATE TABLE seguretat
(compte VARCHAR(10) NOT NULL,
data TIMESTAMP NOT NULL,
usuari VARCHAR(20) NOT NULL,
descripcio_valor VARCHAR(30) NOT NULL
);

DELIMITER //
create trigger ej_60_1 after insert on moviment for each row
BEGIN
declare acum DECIMAL(7,2);
if((select count(*) from saldo where compte = new.compte)=0)  then
insert into saldo value (new.compte,0); 
end if;
if((select count(*) from saldo_diari where data = date(new.data))=0)  then
insert into saldo_diari value (date(new.data),0);  
end if;
if((select * from saldo where compte LIKE new.compte) IS NULL) then
	if(new.tipus = 'H') then
		insert into saldo values (new.compte, new.saldo);
	else
		insert into saldo values (new.compte, - new.saldo);
    end if;
if(new.tipus = 'H') then
insert into seguretat values(new.compte,now(),current_user(),concat("Ingreso ", new.valor));
update saldo set saldo = saldo + new.valor where compte = new.compte;
update saldo_diari set saldo = saldo  + new.valor where data = date(new.data);
elseif(new.tipus = 'D') then
insert into seguretat values(new.compte,now(),current_user(),concat("Reintegrament - ", new.valor));
update saldo set saldo = saldo - new.valor where compte = new.compte;
update saldo_diari set saldo = saldo - new.valor where data = date(new.data);
end if;
end if;
end
//
DELIMITER ;

insert into moviment values("1125",now(),"ingreso de dinero",'H',200);
insert into moviment values("1125",now(),"reintegrament de diner",'D',100);
insert into moviment values("1125",'2022-03-22',"ingreso de dinero",'H',400);
insert into moviment values("1124",now(),"reintegrament de diner",'D',600);

select * from seguretat;
select * from saldo;
select * from saldo_diari;