DROP DATABASE Segunda_Hoja;
CREATE DATABASE Segunda_Hoja;
USE Segunda_Hoja;
CREATE TABLE Empleat(
codi INTEGER(4),
nom VARCHAR(15),
cognoms VARCHAR(30),
treball VARCHAR(10),
codi_carrec INTEGER(4),
data_contracte DATE,
salari INTEGER(7),
comissio INTEGER(7),
departament INTEGER(2),
primary key(codi)
);
ALTER TABLE Empleat MODIFY salari DECIMAL(5,2) NOT NULL;
CREATE TABLE Departament(
numero_dep INTEGER(2),
nom_dep VARCHAR(9),
localitzacio VARCHAR(10),
primary key(numero_dep)
);
CREATE TABLE Departament2(
numero_dep INTEGER(2),
nom_dep VARCHAR(9),
localitzacio VARCHAR(10),
primary key(numero_dep)
);
CREATE TABLE Empleat2(
codi INTEGER(4),
nom VARCHAR(15),
cognoms VARCHAR(30),
treball VARCHAR(10),
codi_carrec INTEGER(4),
data_contracte DATE,
salari INTEGER(7),
comissio INTEGER(7),
departament INTEGER(2),
departament2 INTEGER(2),
primary key(codi),
FOREIGN KEY(departament) references Departament2(numero_dep)
);
ALTER TABLE Empleat2 ADD CONSTRAINT unic_sal_comm UNIQUE(salari,comissio);
INSERT INTO Empleat2 (codi,nom,cognoms) VALUES(5,'Aiman','Benali Kharkhour');



