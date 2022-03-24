/*Ejerccio 55*/
DROP DATABASE ej_55_scl;
create database ej_55_scl;
use ej_55_scl;
CREATE TABLE prova (codi INT);
CREATE TABLE suma(suma INT);
CREATE TABLE sumatxt(suma VARCHAR(200));
insert into sumatxt values (0);
create table prova_log (
dia DATETIME,
usuario VARCHAR(30),
accio VARCHAR(40)
);
DELIMITER //
CREATE TRIGGER exer_55 AFTER INSERT ON prova FOR EACH ROW
BEGIN
		INSERT INTO prova_log VALUES(now(), current_user(), concat("Insercio", new.codi)); 
END //
CREATE TRIGGER exer_55_1 AFTER DELETE ON prova FOR EACH ROW
BEGIN
		INSERT INTO prova_log VALUES(now(), current_user(), concat("Delete",old.codi)); 
END //
CREATE TRIGGER exer55_2 AFTER UPDATE ON prova FOR EACH ROW
BEGIN
		INSERT INTO prova_log VALUES(now(), current_user(), concat("Modificacio ", new.codi, old.codi)); 
END //
DELIMITER ;

INSERT INTO prova VALUES (4);
INSERT INTO prova VALUES (5);
INSERT INTO prova VALUES (6);
select dia,usuario,accio from prova_log;