CREATE DATABASE aiman_bd;
USE aiman_bd;
CREATE TABLE AssignaturA(
codi INTEGER(3) primary key,
nom VARCHAR(20) NOT NULL,
cicle VARCHAR(20) NOT NULL,
curs VARCHAR(20) NOT NULL
);
CREATE TABLE Profesores(
codi INTEGER primary key,
nom VARCHAR(20) NOT NULL,
cognoms VARCHAR(20) NOT NULL,
data_naixament DATE NOT NULL,
telefon INTEGER(9) NOT NULL
);
CREATE TABLE Alumne(
codi INTEGER primary key,
nom VARCHAR(20) NOT NULL,
cognom VARCHAR(20) NOT NULL,
data_naixament DATE NOT NULL,
adreça VARCHAR(20) NOT NULL,
telefon INTEGER(9) NOT NULL
);
CREATE TABLE a3(
codi_assignatura INTEGER(3),
codi_profesor INTEGER,
codi_alumne INTEGER,
primary key(codi_assignatura, codi_profesor,codi_alumne),
foreign key(codi_assignatura) references AssignaturA(codi),
foreign key(codi_profesor) references Profesores(codi),
foreign key(codi_alumne) references Alumne(codi)
);