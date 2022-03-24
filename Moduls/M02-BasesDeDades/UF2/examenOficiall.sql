drop database motoGP;
create database motoGP;
use motoGP;

create table escuderias (
nombre varchar(30) primary key,
manager varchar(30),
fabricantemotor varchar(30),
sede varchar(30)
);

create table pilotos (
codigo varchar(4) primary key,
nombre varchar(30),
nacionalidad varchar(30),
fechanacimiento date,
carreradebut varchar(30),
nombreescuderia varchar(30),
foreign key (nombreescuderia) references escuderias(nombre)
);

create table circuitos (
nombre varchar(30) primary key,
pais varchar(30),
tipo varchar(30),
longitud numeric(5,1),
disenyador varchar(30)
);

create table carreras (
nombregp varchar(30),
año varchar(4),
fechahorarioinicio datetime,
numvueltas int(2),
nombrecircuito varchar(30),
primary key (nombregp, año),
foreign key (nombrecircuito) references circuitos(nombre)
);

create table resultados (
nombregp varchar(30),
anyo varchar(4),
codpiloto varchar(4),
puesto integer(2),
distanciaganador varchar(8),
Primary key (nombregp,anyo,codpiloto),
foreign key (codpiloto) references pilotos(codigo),
foreign key (nombregp, anyo) references carreras(nombregp,año)
);
/*Mi tabla creada*/
create table clima (
tiempo varchar(30),
año varchar(4),
foreign key (año) references resultados(anyo)
);


insert into escuderias(nombre, manager, fabricantemotor, sede) values('Ferrari','Luca di Montezemolo','Ferrari','Maranello (Italia)');

insert into escuderias(nombre, manager, fabricantemotor, sede) values('Red Bull', 'Dietrich Mateschitz','Red Bull','Milton Keynes (Inglaterra)');

insert into escuderias(nombre, manager, fabricantemotor, sede) values('Mercedes','Mercedes Benz','Mercedes','Stuttgart (Alemania)');

insert into escuderias(nombre, manager, fabricantemotor, sede) values('McLaren','Bruce McLaren','Mercedes','Woking (Inglaterra)');

insert into escuderias(nombre, manager, fabricantemotor, sede) values('Toro Rosso','Dietrich Mateschitz','Red Bull','Faenza (Italia)');

insert into circuitos(nombre, pais, tipo, longitud) values('Albert Park','Australia','Urbano',5300);

insert into circuitos(nombre, pais, longitud, disenyador) values('Spa','Belgica',7004,'Jules de Their');

insert into circuitos(nombre, pais, longitud) values('Indianapolis','Estados Unidos',4168);

insert into circuitos(nombre, pais, longitud, disenyador) values('Sepang','Malasia',5540,'Hermann Tilke');

insert into circuitos(nombre, pais, tipo, longitud) values('Montecarlo','Monaco','Urbano',3340);

insert into circuitos(nombre, pais, longitud) values('Interlagos','Brasil',4309);

  

insert into pilotos values('1','Fernando Alonso','Española','1981/07/29','Australia 2001','Ferrari');

insert into pilotos values('2','Sebastian Vettel','Alemana','1987/07/03','Estados Unidos 2007','Red Bull');

insert into pilotos values('3','Mark Webber','Inglesa','1976/08/27','Australia 2002','Red Bull');

insert into pilotos values('4','Felipe Massa','Brasileña','1981/04/25','Australia 2002','Ferrari');

insert into pilotos values('5','Michael Schumacher','Alemana','1969/01/03','Belgica 1991','Mercedes');

insert into pilotos values('6','Lewis Hamilton','Inglesa','1985/01/07','Australia 2007','McLaren');

  

insert into carreras values('GP de Australia','2010','2010/03/15 19:00',68,'Albert Park');

insert into carreras values('GP de Europa','2010','2010/03/22 14:00',46,'Spa');

insert into carreras values('GP Estados Unidos','2010','2010/03/29 19:00',70,'Indianapolis');

insert into carreras values('GP de Malasia','2010','2010/04/05 13:00',53,'Sepang');

insert into carreras values('GP de Brasil','2010','2010/04/12 20:00',64,'Interlagos');

insert into carreras values('GP de Australia','2011','2011/03/14 19:00',69,'Albert Park');

insert into carreras values('GP de Europa','2011','2011/03/11 14:00',63,'Montecarlo');

insert into carreras values('GP Estados Unidos','2011','2011/03/28 19:00',72,'Indianapolis');

insert into carreras values('GP de Malasia','2011','2011/04/04 13:00',54,'Sepang');

insert into carreras values('GP de Brasil','2011','2011/04/11 20:45',66,'Interlagos');

 

insert into resultados(nombregp, anyo, codpiloto, puesto) values('GP de Australia','2010','2',1);

insert into resultados(nombregp, anyo, codpiloto, puesto, distanciaganador) values('GP de Australia','2010','3',2, '00:12.33');

insert into resultados(nombregp, anyo, codpiloto, puesto, distanciaganador) values('GP de Australia','2010','1',3, '00:23.52');

insert into resultados(nombregp, anyo, codpiloto, puesto, distanciaganador) values('GP de Australia','2010','4',4, '01:02.05');

insert into resultados(nombregp, anyo, codpiloto, puesto, distanciaganador) values('GP de Australia','2010','5',5, 'Abandono');

 

insert into resultados(nombregp, anyo, codpiloto, puesto) values('GP de Europa','2010','1',1);

insert into resultados(nombregp, anyo, codpiloto, puesto, distanciaganador) values('GP de Europa','2010','2',2, '00:22.12');

insert into resultados(nombregp, anyo, codpiloto, puesto, distanciaganador) values('GP de Europa','2010','3',3, '00:42.23');

insert into resultados(nombregp, anyo, codpiloto, puesto, distanciaganador) values('GP de Europa','2010','4',4, 'Abandono');

 

insert into resultados(nombregp, anyo, codpiloto, puesto) values('GP Estados Unidos','2010','1',1);

insert into resultados(nombregp, anyo, codpiloto, puesto, distanciaganador) values('GP Estados Unidos','2010','3',2, '00:03.31');

insert into resultados(nombregp, anyo, codpiloto, puesto, distanciaganador) values('GP Estados Unidos','2010','5',3, '02:12.33');

 

insert into resultados(nombregp, anyo, codpiloto, puesto) values('GP de Malasia','2010','2',1);

insert into resultados(nombregp, anyo, codpiloto, puesto, distanciaganador) values('GP de Malasia','2010','3',2, '01:12.12');

insert into resultados(nombregp, anyo, codpiloto, puesto, distanciaganador) values('GP de Malasia','2010','1',3, '01:14.39');

insert into resultados(nombregp, anyo, codpiloto, puesto, distanciaganador) values('GP de Malasia','2010','4',4, 'Abandono');

insert into resultados(nombregp, anyo, codpiloto, puesto, distanciaganador) values('GP de Malasia','2010','5',5, 'Abandono');

 

insert into resultados(nombregp, anyo, codpiloto, puesto) values('GP de Brasil','2011','2',1);

insert into resultados(nombregp, anyo, codpiloto, puesto, distanciaganador) values('GP de Brasil','2011','1',2, '00:02.12');

insert into resultados(nombregp, anyo, codpiloto, puesto, distanciaganador) values('GP de Brasil','2011','3',3, '00:12.23');

 

insert into resultados(nombregp, anyo, codpiloto, puesto) values('GP de Australia','2011','3',1);

insert into resultados(nombregp, anyo, codpiloto, puesto, distanciaganador) values('GP de Australia','2011','2',2, '00:01.23');

insert into resultados(nombregp, anyo, codpiloto, puesto, distanciaganador) values('GP de Australia','2011','4',3, '01:01.22');

insert into resultados(nombregp, anyo, codpiloto, puesto, distanciaganador) values('GP de Australia','2011','5',4, 'Abandono');

 

insert into resultados(nombregp, anyo, codpiloto, puesto) values('GP de Europa','2011','2',1);

insert into resultados(nombregp, anyo, codpiloto, puesto, distanciaganador) values('GP de Europa','2011','1',2, '00:06.12');

insert into resultados(nombregp, anyo, codpiloto, puesto, distanciaganador) values('GP de Europa','2011','3',3, '00:09.20');

insert into resultados(nombregp, anyo, codpiloto, puesto, distanciaganador) values('GP de Europa','2011','6',4, 'Abandono');