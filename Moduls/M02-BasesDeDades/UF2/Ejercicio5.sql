USE aiman_bd;
CREATE TABLE Departament(
numero SMALLINT(2) NOT NULL primary key,
nom CHAR(9) UNIQUE,
localitzacio CHAR(10) NOT NULL );
