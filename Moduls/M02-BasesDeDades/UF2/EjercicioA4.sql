
CREATE DATABASE CHEN;
USE CHEN;
/*Creamos primero la tabla de Categoria*/
CREATE TABLE Categoria(
codCat INTEGER primary key,
nomCat VARCHAR(20),
souBase VARCHAR(20),
HoraExtra time
);
/*Creamos la tabla de Titol*/
CREATE TABLE Titol(
codTit INTEGER primary key,
nomTit VARCHAR(20)
);
/*Creamos la tabla de la Central Sindical*/
CREATE TABLE Central_Sindical(
codCen INTEGER primary key,
nomCen VARCHAR(20),
quota DECIMAL(5,2)
);
/*Creamos la tabla Agencia*/
CREATE TABLE Agencia(
codAg INTEGER primary key,
nom VARCHAR(20),
adreça VARCHAR(30),
telefon VARCHAR(9),
codCiu INTEGER,
FOREIGN KEY (codCiu) references Ciutat(codCiu) 
);
/*Creamo la tabla de Ciutat*/
CREATE TABLE Ciutat(
codCiu INTEGER primary key,
nomCiu VARCHAR(25)
);
/*Creamos la tabla A4 de empleat*/
CREATE TABLE Empleat(
codEmp INTEGER primary key,
nom VARCHAR(20),
cognom VARCHAR(30),
dni VARCHAR(9),
codCat INTEGER,
codAgencia INTEGER,
codCen INTEGER,
codCiu INTEGER,
FOREIGN KEY (codCat) references Categoria(codCat),
FOREIGN KEY (codAgencia) references Agencia(codAg),
FOREIGN KEY (codCen) references Central_Sindical(codCen),
FOREIGN KEY (codCiu) references Ciutat(codCiu)
);
/*Creamos la tabla de titulacions que es de relacion de muchos a muchos*/
CREATE TABLE Titulacions(
data0bt VARCHAR(30),
codiTit INTEGER,
codiEmp INTEGER,
FOREIGN KEY (codiTit) references Titol(codTit),
FOREIGN KEY (codiEmp) references Empleat(codEmp)
);
ALTER TABLE Central_Sindical DROP quota;
INSERT INTO Central_Sindical (codCen) VALUE (4,'Associacio Internacional dels Treballadors')
/**/

