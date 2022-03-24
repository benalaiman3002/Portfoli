DROP DATABASE ej_58;
CREATE DATABASE ej_58;
USE ej_58;
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
create table prova_puntuacio(
lletra enum('A','B','C','D','E','F'), 
puntuacio enum('1','2','3','4','5','6')
);
create table prova_puntuacio_seg(
letra enum('A','B','C','D','E','F'),
puntuacion int
);
INSERT INTO prova_puntuacio_seg values('A','1');
INSERT INTO prova_puntuacio_seg values('B','1');
INSERT INTO prova_puntuacio_seg values('C','1');
INSERT INTO prova_puntuacio_seg values('D','1');
INSERT INTO prova_puntuacio_seg values('E','1');
INSERT INTO prova_puntuacio_seg values('F','1');
DELIMITER //
CREATE TRIGGER ex58 AFTER INSERT ON prova_puntuacio for each row
begin
	if(new.lletra = 'A') then
		update prova_puntuacio_seg set puntuacion = new.puntuacio where letra = new.lletra;
    elseif(new.lletra = 'B') then
        update prova_puntuacio_seg set puntuacion = new.puntuacio where letra = new.lletra;
	elseif(new.lletra = 'C') then
        update prova_puntuacio_seg set puntuacion = new.puntuacio where letra = new.lletra;
	elseif(new.lletra = 'D') then
        update prova_puntuacio_seg set puntuacion = new.puntuacio where letra = new.lletra;
	elseif(new.lletra = 'E') then
        update prova_puntuacio_seg set puntuacion = new.puntuacio where letra = new.lletra;
	elseif(new.lletra = 'F') then
        update prova_puntuacio_seg set puntuacion = new.puntuacio where letra = new.lletra;
	end if;
end //
DELIMITER ;

insert into prova_puntuacio values('C','4');
insert into prova_puntuacio values('B','2');
insert into prova_puntuacio values('D','6');
insert into prova_puntuacio values('A','1');
insert into prova_puntuacio values('E','5');
select puntuacion, letra from prova_puntuacio_seg;

