DROP DATABASE entitatbancaria;
CREATE DATABASE IF NOT EXISTS entitatbancaria;

CREATE TABLE IF NOT EXISTS entitatbancaria.centralsindical 
   ( codCen  TINYINT(2) PRIMARY KEY,
     nomCen VARCHAR(45) NOT NULL UNIQUE,
     quota DECIMAL(8,2)
   ) engine=InnoDB;

CREATE TABLE IF NOT EXISTS entitatbancaria.categoria
   ( codCat TINYINT(2) PRIMARY KEY,
     nomCat VARCHAR(45),
     souBase DECIMAL(8,2) NOT NULL,
     horaExtra DECIMAL(8,2)
   ) engine=InnoDB;

CREATE TABLE IF NOT EXISTS entitatbancaria.ciutat
   ( codCiu TINYINT(2) PRIMARY KEY,
     nomCiu VARCHAR(30) NOT NULL
   ) engine=InnoDB;

CREATE TABLE IF NOT EXISTS entitatbancaria.agencia
   ( codAg TINYINT(2) PRIMARY KEY,
     nom VARCHAR(45) NOT NULL,
     adreca VARCHAR(30),
     telefon CHAR(9),
     codCiu TINYINT(2),
     FOREIGN KEY (codCiu) REFERENCES entitatbancaria.ciutat (codCiu) ON DELETE SET NULL ON UPDATE CASCADE
   ) engine=InnoDB;


CREATE TABLE IF NOT EXISTS entitatbancaria.empleat
   ( codemp SMALLINT(3) PRIMARY KEY, 
     dni CHAR(9) UNIQUE NOT NULL,
     nom VARCHAR(45) NOT NULL,
     cognom VARCHAR(45) NOT NULL,
     codCiu TINYINT(2),
     codCen TINYINT(2),
     codCat TINYINT(2),
     codAg TINYINT(2),
     FOREIGN KEY (codCiu) REFERENCES entitatbancaria.ciutat (codCiu) ON DELETE SET NULL ON UPDATE CASCADE,
     FOREIGN KEY (codCen) REFERENCES entitatbancaria.centralsindical (codCen) ON DELETE SET NULL ON UPDATE CASCADE,
     FOREIGN KEY (codCat) REFERENCES entitatbancaria.categoria (codCat) ON DELETE SET NULL ON UPDATE CASCADE,
     FOREIGN KEY (codAg) REFERENCES entitatbancaria.agencia (codAg) ON DELETE SET NULL ON UPDATE CASCADE
   ) engine=InnoDB;


CREATE TABLE IF NOT EXISTS entitatbancaria.titol
   ( codTit TINYINT(2) PRIMARY KEY,
     nomTit CHAR(45) NOT NULL
   ) engine=InnoDB;


CREATE TABLE IF NOT EXISTS entitatbancaria.titulacions
   (  codEmp SMALLINT(3),
      codTit TINYINT(2), 
      dataObt DATE,
      PRIMARY KEY (codEmp, codTit),
      FOREIGN KEY (codEmp) REFERENCES entitatbancaria.empleat (codEmp) ON DELETE CASCADE ON UPDATE CASCADE,
      FOREIGN KEY (codTit) REFERENCES entitatbancaria.titol (codTit) ON DELETE CASCADE ON UPDATE CASCADE
    ) engine=InnoDB;


INSERT INTO entitatbancaria.centralsindical VALUES (1, 'Comissions Obreres (CCOO)', 12.65),
                                                   (2, 'Unio General de Treballadors (UGT)', 13), 
                                                   (3, 'Confederacio General del Treball', 16.40);

INSERT INTO entitatbancaria.categoria VALUES (1, 'director', 2000, 50),
                                             (2, 'sotsdirector', 1700, 30),
                                             (3, 'caixer', 1100, 12);

INSERT INTO entitatbancaria.ciutat VALUES ( 1, 'Barcelona'), ( 2, 'Tarragona'), ( 3, 'Lleida'), ( 4, 'Girona');

INSERT INTO entitatbancaria.agencia VALUES (1, 'Pi i Margall', 'C/ Pi i Margall 23', '932848888', 1),
                                           (2, 'Fluvia', 'C/ Fluvia 123', '931112233', 1),
                                           (3, 'Balmes', 'C/ Balmes 145', '977112233', 2),
                                           (4, 'La Garriga', 'C/ La Garriga 12', '971223344', 3),
                                           (5, 'Banyoles', 'C/ Banoyoles 67', '972998877', 4);

INSERT INTO entitatbancaria.empleat VALUES (1, '12345678A', 'Francisco', 'Aranda', 1, NULL,1, 1),
                                           (2, '23456789B', 'David', 'Garcia', 1,  2, 2 ,1),
                                           (3, '34567899C', 'Issac', 'Aymerich ',  1,  2, 3, 1),
                                           (4, '45678111D', 'David', 'Almodovar', 1 ,  NULL, 3, 1),
                                           (5, '11111111E', 'Hector', 'Escriche', 2 ,  NULL, 1, 2),
                                           (6, '22223333F', 'David', 'Balasch', 2 ,  1, 2, 2),
                                           (7, '44444444G', 'Daniel', 'Calvo', 2 ,  2, 3, 2),
                                           (8, '55555555H', 'Marc', 'Cama', 3,  NULL,  1, 2),
                                           (9, '12312345I', 'Marc', 'Casas', 3 ,  3,  3, 3),
                                           (10, '98765432J', 'Yerai', 'Corrochano',  4,  NULL, 1, 3),
                                           (11, '98769876K', 'Jonathan', 'Rodriguez',  4,  3, 3, 3);
                                           

INSERT INTO entitatbancaria.titol VALUES (1, 'Llicenciat en Economiques'), 
                                         (2, 'Llicenciat en Empresarials'), 
                                         (3, 'Batxillerat'), 
                                         (4, 'Administratiu'), 
                                         (5, 'Master ESADE');

INSERT INTO entitatbancaria.titulacions VALUES (1,1,'1992-07-01'), (1,2,'1997-07-01'), (2,3,'2005-07-01'), (3,3,'1991-07-01'), (4,4,'1988-07-01'),
                                               (5,1,'1980-07-01'), (5,2,'1985-07-01'), (5,5,'1991-07-01'), (6,4,'1993-07-01'), (7,4,'1991-07-01'),
                                               (8,1,'1972-07-01'), (8,2,'1977-07-01'), (8,5,'1982-07-01'), (9,2,'1980-07-01'), (10,1,'1994-07-01'), 
                                               (10,5,'1990-07-01');
INSERT INTO entitatbancaria.empleat VALUES (12,'22222222A','Marta','Casillas',1,NULL,3,1);
UPDATE entitatbancaria.empleat SET codCen=1 WHERE codemp=2;
UPDATE entitatbancaria.categoria SET souBase = souBase * 1.03, horaExtra = horaExtra * 1.05 WHERE codCat = 1;
UPDATE entitatbancaria.categoria SET souBase = souBase * 1.03, horaExtra = horaExtra * 1.05 WHERE codCat = 2;
UPDATE entitatbancaria.categoria SET souBase = souBase * 1.03, horaExtra = horaExtra * 1.05 WHERE codCat = 3;
SELECT UPPER(nomTit) FROM entitatbancaria.titol;
DELETE FROM entitatbancaria.titulacions;
DELETE FROM entitatbancaria.ciutat WHERE nomCiu = 'Barcelona';
UPDATE entitatbancaria.titol SET codTit=6 WHERE codTit= 1;
DROP TABLE entitatbancaria.titulacions;
ALTER TABLE entitatbancaria.empleat ADD souanual DECIMAL(8,2) DEFAULT(0)
CHECK(souanual > 0);
ALTER TABLE entitatbancaria.empleat DROP souanual;
ALTER TABLE entitatbancaria.centralsindical ADD empleats INT DEFAULT (0) AFTER nomCen;
ALTER TABLE entitatbancaria.categoria MODIFY nomCat VARCHAR(45) UNIQUE NOT NULL;
ALTER TABLE entitatbancaria.categoria MODIFY horaExtra DECIMAL DEFAULT (30.00);

