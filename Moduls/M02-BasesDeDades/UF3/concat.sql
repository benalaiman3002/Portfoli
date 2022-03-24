drop database exemple_disparador2;
CREATE DATABASE exemple_disparador2;
use exemple_disparador2;
CREATE TABLE prova (codi INT);
CREATE TABLE suma(suma INT);
CREATE TABLE sumatxt(suma VARCHAR(200));
insert into sumatxt values (0);
DELIMITER //
CREATE TRIGGER exer_53 AFTER INSERT ON prova FOR EACH ROW
BEGIN
	UPDATE sumatxt SET suma=concat(suma,'+',new.codi);
END //
DELIMITER ;
INSERT INTO prova VALUES (4);
INSERT INTO prova VALUES (5);
INSERT INTO prova VALUES (6);
select suma from sumatxt;