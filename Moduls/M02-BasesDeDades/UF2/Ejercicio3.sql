USE aiman_bd;
CREATE TABLE Cliente(
idclient INTEGER AUTO_INCREMENT primary key,
nom CHAR(20) UNIQUE,
cognom CHAR(20) UNIQUE,
tipus VARCHAR(25) DEFAULT(Habitual),
data_naixament date NOT NULL
);
