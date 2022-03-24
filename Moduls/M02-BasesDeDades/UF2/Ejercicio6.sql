USE aiman_bd;
CREATE TABLE Producte(
codi INTEGER primary key,
nom CHAR NOT NULL,
Descripcio TEXT(20) NOT NULL,
categoria TEXT(20) NOT NULL,
preu DOUBLE NOT NULL, 
codigo_fabricante integer,
foreign key(codigo_fabricante) references Fabricant(codigo)
);
CREATE TABLE Fabricant(
codigo INTEGER,
nom CHAR NOT NULL,
adreça_web VARCHAR(50) NOT NULL,
telefon_contacte INTEGER(9) NOT NULL,
primary key(codigo)
);