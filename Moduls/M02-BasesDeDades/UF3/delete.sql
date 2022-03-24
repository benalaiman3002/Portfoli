DROP DATABASE ej_56;
CREATE DATABASE ej_56;
USE ej_56;
CREATE TABLE prova (codi INT);
CREATE TABLE suma(suma INT);
CREATE TABLE sumatxt(suma VARCHAR(200));
insert into sumatxt values (0);
create table prova_log (
dia DATETIME,
usuario VARCHAR(30),
accio VARCHAR(40)
);
create table suma_valors (
codi int,
vegades int
);

DELIMITER //
create trigger ex56_insert after insert on prova for each row
 begin
	update suma_valors SET vegades=(select count(*) from prova where codi=new.codi)
    end
create trigger ex56_delete after delete on prova for each row
	update suma_valors set vegades=(select count(*) from prova where codi = old.codi)
end

DELIMITER ;
INSERT INTO prova VALUES (4);
INSERT INTO prova VALUES (5);
INSERT INTO prova VALUES (6);
select codi, vegades from suma_valors s,prova p where s.codi = p.codi ;