DROP DATABASE ejercicio8;
CREATE DATABASE ejercicio8;
USE ejercicio8;
CREATE TABLE Usuaris(
codi_usuari INTEGER auto_increment primary key,
dni VARCHAR(9) NOT NULL UNIQUE,
nom VARCHAR(20) NOT NULL,
cognom VARCHAR(20) NOT NULL,
Adreça VARCHAR(30) NOT NULL,
Ciutat VARCHAR(20) DEFAULT 'Terrassa' NOT NULL,
Sexe VARCHAR(15) NOT NULL,
Telefon VARCHAR(9),
Mobil VARCHAR(9) UNIQUE,
Correu_electronic VARCHAR(25) UNIQUE,
Data_naixament DATE NOT NULL CHECK (data_naixament > '1900/1/1')
);
CREATE TABLE categoria(
codi_categoria INTEGER auto_increment primary key,
categoria VARCHAR(30) NOT NULL UNIQUE
);
CREATE TABLE Pelicules(
Titol VARCHAR(30) NOT NULL UNIQUE,
Director VARCHAR(30) NOT NULL,
Actors VARCHAR(50) NOT NULL,
Companyi_productora VARCHAR(30) NOT NULL,
Any_rodacio INTEGER(4) CHECK(any_rodacio > 1900) NOT NULL,
Argument TEXT,
Durada_min INTEGER(3) NOT NULL CHECK(Durada_min BETWEEN 1 AND 300),
data_alta DATE CHECK(data_alta > '2001/1/1') DEFAULT '2021/11/04' NOT NULL,
Nacionalitat VARCHAR(30) NOT NULL,
Data_baixa_basededades ENUM("S","N") DEFAULT 'N' NOT NULL,
codi_categoria INTEGER NOT NULL,
Codi_pelicula INTEGER auto_increment primary key,
FOREIGN KEY(codi_categoria) references categoria(codi_categoria)
);
CREATE TABLE Copia(
codi_copia INTEGER NOT NULL primary key,
codi_pelicula INTEGER NOT NULL,
FOREIGN KEY (codi_pelicula) references Pelicules(Codi_pelicula)
);
CREATE TABLE lloga(
codi_usuari INTEGER,
codi_copia INTEGER,
codi_pelicula INTEGER,
data_lloguer DATE DEFAULT '2021/11/04' NOT NULL,
data_retorn DATE,
primary key(codi_usuari, codi_copia, codi_pelicula),
FOREIGN KEY(codi_copia) references Copia(codi_copia),
FOREIGN KEY(codi_pelicula) references Pelicules(Codi_pelicula),
FOREIGN KEY(codi_usuari) references Usuaris(codi_usuari)
);




