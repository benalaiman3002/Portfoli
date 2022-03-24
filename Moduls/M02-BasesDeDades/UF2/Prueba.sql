DROP DATABASE prueba;
CREATE DATABASE prueba;
USE prueba;
CREATE TABLE Titol(
codi INTEGER primary key,
nom VARCHAR(20) NOT NULL
);
CREATE TABLE Categoria(
codi INTEGER primary key,
nom VARCHAR(20) NOT NULL,
cognom VARCHAR(20) NOT NULL,
sou_base decimal (5,2) NOT NULL,
hores TIME NOT NULL
);
CREATE TABLE Central_Sindical(
codi INTEGER primary key,
nom VARCHAR(20) NOT NULL,
quota DECIMAL NOT NULL
);
CREATE TABLE Ciutat(
codi INTEGER primary key,
nom VARCHAR(20) NOT NULL
);
CREATE TABLE Agencia(
codi INTEGER primary key,
nom VARCHAR(20) NOT NULL,
adreça VARCHAR(20) NOT NULL,
telefon VARCHAR(9) NOT NULL,
codi_ciutat INTEGER,
FOREIGN KEY(codi_ciutat) references Ciutat(codi)
);
CREATE TABLE Empleat(
codi INTEGER primary key,
dni VARCHAR(9) NOT NULL,
nom VARCHAR(20) NOT NULL,
cognom VARCHAR(20) NOT NULL,
codi_categoria INTEGER,
codi_agencia INTEGER,
codi_ciutat INTEGER,
codi_central_sindical INTEGER,
FOREIGN KEY(codi_central_sindical) references Central_Sindical(codi),
FOREIGN KEY(codi_ciutat) references Ciutat(codi),
FOREIGN KEY(codi_agencia) references Agencia(codi),
FOREIGN KEY(codi_categoria) references Categoria(codi)
);
CREATE TABLE Titulacions(
codi_titol INTEGER,
codi_empleat INTEGER,
data_obtencio DATE,
primary key(codi_titol, codi_empleat),
FOREIGN KEY(codi_titol) references Titol(codi),
FOREIGN KEY(codi_empleat) references Empleat(codi)
);
ALTER TABLE Titulacions ADD columna_prueba VARCHAR(20) NOT NULL;
ALTER TABLE Titulacions CHANGE columna_prueba columna_prueb VARCHAR(20) NOT NULL;
ALTER TABLE Titulacions MODIFY columna_prueb INTEGER NOT NULL;
ALTER TABLE Titulacions RENAME nombre_nuevo_tabla;