DROP DATABASE ej_57;
CREATE DATABASE ej_57;
USE ej_57;
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
CREATE TRIGGER ex57_4 AFTER INSERT ON prova for each row
	begin
	insert into suma values(new.codi);
	if((select count(codi) from prova) > 9) then
		delete from suma limit 1;
	end if;
end //
DELIMITER ;

INSERT INTO prova VALUES (1);
INSERT INTO prova VALUES (2);
INSERT INTO prova VALUES (3);
INSERT INTO prova VALUES (4);
INSERT INTO prova VALUES (5);
INSERT INTO prova VALUES (6);
INSERT INTO prova VALUES (7);
INSERT INTO prova VALUES (8);
INSERT INTO prova VALUES (9);
INSERT INTO prova VALUES (10);
INSERT INTO prova VALUES (11);
INSERT INTO prova VALUES (12);
INSERT INTO prova VALUES (13);
INSERT INTO prova VALUES (14);
select suma from suma;
select codi from prova;
