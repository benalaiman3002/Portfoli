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
CREATE TRIGGER ex_56 AFTER INSERT ON prueba FOR EACH ROW
BEGIN
    UPDATE suma_valors SET vegades=(SELECT COUNT(*) FROM prueba WHERE codi=NEW.codi) WHERE codi = NEW.codi;
END //
CREATE TRIGGER ex_56_1 AFTER DELETE ON prueba FOR EACH ROW
BEGIN
    UPDATE suma_valors SET vegades=(SELECT COUNT(*) FROM prueba WHERE codi=OLD.codi) WHERE codi = OLD.codi;
END //
CREATE TRIGGER ex_56_2 AFTER INSERT ON prueba FOR EACH ROW
    IF((SELECT COUNT() FROM suma_valors WHERE codi=NEW.codi) = 0) THEN 
    INSERT INTO suma_valors VALUES(NEW.codi, 1);
    ELSE 
    UPDATE suma_valors SET vegades = ( SELECT COUNT() FROM prueba WHERE codi=NEW.codi) WHERE codi=NEW.codi;
    END IF;
CREATE TRIGGER ex_56_3 AFTER DELETE ON prueba FOR EACH ROW
    IF((SELECT COUNT() FROM suma_valors WHERE codi=OLD.codi) = 0) THEN 
    DELETE INTO suma_valors VALUES(OLD.codi, 1);
    ELSE 
    UPDATE suma_valors SET vegades = ( SELECT COUNT() FROM prueba WHERE codi=OLD.codi) WHERE codi=OLD.codi;
    END IF;
DELIMITER ;
INSERT INTO prova VALUES (4);
INSERT INTO prova VALUES (5);
INSERT INTO prova VALUES (6);