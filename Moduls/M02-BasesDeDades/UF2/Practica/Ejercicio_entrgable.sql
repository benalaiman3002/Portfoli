
CREATE DATABASE EjercicioHotel;
USE EjercicioHotel;
CREATE TABLE IF NOT EXISTS RESERVA(
FechaEntrada DATE,
FechaSalida DATE,
Precio Decimal(5,2),
NºdeReserva INTEGER primary key
);
CREATE TABLE IF NOT EXISTS Cliente(
DNI VARCHAR(9) primary key,
Direccion VARCHAR(30),
Nom VARCHAR(30),
Apellidos VARCHAR(30),
Telefono INTEGER(9),
codReserv INTEGER,
foreign key (codReserv) references RESERVA(NºdeReserva)
);
CREATE TABLE IF NOT EXISTS Ubicacion(
Direccion VARCHAR(30),
Pais VARCHAR(30),
Nom VARCHAR(30) PRIMARY KEY,
Ciudad VARCHAR(30),
codClient VARCHAR(9),
foreign key (codClient) references Cliente(DNI)
);
CREATE TABLE IF NOT EXISTS Temporada(
Nom VARCHAR(30),
FechaFinal DATE,
FechaIncio DATE,
Codigo INTEGER primary key
);
CREATE TABLE IF NOT EXISTS Habitacion(
Planta INTEGER,
Nº_Habitacion INTEGER,
Codigo INTEGER primary key
); 
CREATE TABLE IF NOT EXISTS Servicio(
Nom VARCHAR(20),
Codigo INTEGER primary key
);
CREATE TABLE IF NOT EXISTS MantenimientoElec(
Horario TIME,
codServ INTEGER,
FOREIGN KEY (codServ) references Servicio(Codigo)
);
CREATE TABLE IF NOT EXISTS Aparcamiento(
NºdePlaza INTEGER,
codServ INTEGER,
FOREIGN KEY (codServ) references Servicio(Codigo)
);
CREATE TABLE IF NOT EXISTS WiFi(
IP VARCHAR(32),
codServ INTEGER,
FOREIGN KEY (codServ) references Servicio(Codigo)
);
CREATE TABLE IF NOT EXISTS Limpieza(
Nom VARCHAR(30),
DNI VARCHAR(9),
codServ INTEGER,
FOREIGN KEY (codServ) references Servicio(Codigo)
);
CREATE TABLE IF NOT EXISTS ServicioDeDesayuno(
codServ INTEGER,
FOREIGN KEY (codServ) references Servicio(Codigo)
);
CREATE TABLE IF NOT EXISTS Ubicacion_Reserva(
codReserv INTEGER,
codUbic VARCHAR(30),
foreign key (codReserv) references RESERVA(NºdeReserva),
foreign key (codUbic) references Ubicacion(Nom)
);
CREATE TABLE IF NOT EXISTS Reserv_Temp(
codReserv INTEGER,
codTemp INTEGER,
foreign key (codReserv) references RESERVA(NºdeReserva),
foreign key (codTemp) references Temporada(Codigo)
);
CREATE TABLE IF NOT EXISTS Reserv_Serv(
codReserv INTEGER,
codServ INTEGER,
foreign key (codReserv) references RESERVA(NºdeReserva),
foreign key (codServ) references Servicio(Codigo)
);
CREATE TABLE IF NOT EXISTS Hab_Serv(
codServ INTEGER,
codHab INTEGER,
foreign key (codServ) references Servicio(Codigo),
foreign key (codHab) references Habitacion(Codigo)
);
INSERT INTO RESERVA VALUES('2003/01/12','2003/01/21','69.99','1'),
						('2005/05/25','2005/06/05','79.99','2'),
                        ('2010/04/06','2010/04/16','49.99','3'),
                        ('2011/01/08','2011/01/17','39.99','4'),
                        ('2012/11/12','2012/11/21','89.99','5');
INSERT INTO Cliente VALUES('12345678F','Av. Parlament numº36','Aiman','Benali Kharkhour','608818568','1'),
						('87654321A','Carrer Francesc Macia','Laura','Roldan Garcia','622064833','2'),
                        ('54321256D','Plaça Catalunya numº17','Ouassima','Kharkhour ElIdrissi','123456789','3'),
                        ('98765123S','Carrer Antoninus Pius','Adria','Ferrer Sanz','987654321','4'),
                        ('76801248X','Carrer Pitagores','Ruben','Burgues','123654891','5');
INSERT INTO Ubicacion VALUES('Av. Parlament numº36','España','Aiman','Terrassa','12345678F'),
							('Av. Parlament numº36','España','Laura','Roldan Garcia','87654321A'),
                            ('Plaça Catalunya numº17','España','Ouassima','Barcelona','54321256D'),
                            ('Carrer Antoninus Pius','Mexico','Adria','Ciudad de Mexico','98765123S'),
                            ('Carrer Pitagores','Marruecos','Ruben','Tetouan','76801248X');
INSERT INTO Temporada VALUES('Invierno','2003/12/30','2003/01/01','1'),
							('Verano','2005/12/30','2005/01/01','2'),
							('Primavera','2010/12/30','2010/01/01','3'),
							('Otoño','2011/12/30','2011/01/01','4'),
                            ('No identificado','2012/12/30','2012/01/01','5');
INSERT INTO Habitacion VALUES('7','2','1'),
							('5','3','2'),
                            ('2','2','3'),
                            ('10','5','4'),
                            ('8','10','5');
INSERT INTO Servicio VALUES('Limpieza','111'),
						('Wi-Fi','222'),
						('Mant, Electrico','333'),
						('Aparcamiento','444'),
						('Desayuno','555');
INSERT INTO MantenimientoElec VALUES ('10:00:00','333'),
									('17:00:00','333'),
									('20:00:00','333'),
									('07:00:00','333'),
									('22:00:00','333');
INSERT INTO Aparcamiento VALUES('1','444'),
							('2','444'),
                            ('3','444'),
                            ('4','444'),
                            ('5', '444');
INSERT INTO WiFi VALUES('192.168.1.2','222'),
					('192.168.1.3','222'),
                    ('192.168.1.4','222'),
                    ('192.168.1.5','222'),
                    ('192.168.1.6','222');
INSERT INTO Limpieza VALUES('Jose','25372779F','111'),
						('Maria','87642938A','111'),
						('Antonio','09876543S','111'),
						('Marta','12345987Q','111'),
						('Alfredo','76983217P','111');
INSERT INTO ServicioDeDesayuno VALUES('555'),
									('555'),
									('555'),
									('555'),
									('555');
INSERT INTO Ubicacion_Reserva VALUES('1', 'Aiman'),
									('2','Laura'),
									('3', 'Ouassima'),
									('4','Adria'),
									('5','Ruben');
INSERT INTO Reserv_Temp VALUES('1','1'),
							('2','2'),
							('3','3'),
							('4','4'),
							('5','5');
INSERT INTO Reserv_Serv VALUES('1','111'),
							('2','111'),
							('3','111'),
							('4','111'),
							('5','111'),
                            ('1','222'),
							('2','222'),
							('3','222'),
							('4','222'),
							('5','222'),
                            ('1','333'),
							('2','333'),
							('3','333'),
							('4','333'),
							('5','333'),
                            ('1','444'),
							('2','444'),
							('3','444'),
							('4','444'),
							('5','444'),
                            ('1','555'),
							('2','555'),
							('3','555'),
							('4','555'),
							('5','555');
INSERT INTO Hab_Serv VALUE('111','1'),
						('222','1'),
						('333','1'),
						('444','1'),
						('555','1'),
                        ('111','2'),
						('222','2'),
						('333','2'),
						('444','2'),
						('555','2'),
                        ('111','3'),
						('222','3'),
						('333','3'),
						('444','3'),
						('555','3'),
                        ('111','4'),
						('222','4'),
						('333','4'),
						('444','4'),
						('555','4'),
                        ('111','5'),
						('222','5'),
						('333','5'),
						('444','5'),
						('555','5');
ALTER TABLE Ubicacion MODIFY Pais VARCHAR(25);
ALTER TABLE RESERVA MODIFY Precio DECIMAL(6,2);
ALTER TABLE WiFi MODIFY IP VARCHAR(24); 
ALTER TABLE Habitacion MODIFY Planta VARCHAR(30);
ALTER TABLE Ubicacion MODIFY Ciudad VARCHAR(20);

/*Hay disponible Aparcamiento en la reserva?*/
SELECT Nom FROM Servicio WHERE Nom = 'Aparcamiento';

/*Muestrame los clientes con sus datos, donde su numero de reserva es menor que 3 (incluyendo)*/
SELECT  Nom, DNI, Apellidos, Direccion, Telefono FROM Cliente
WHERE CodReserv <= 3;

/*Muestrame los clientes que viven unicamente en España*/

SELECT Nom, Direccion FROM Ubicacion
WHERE Pais = 'España';

/*Muestrame los routers que tienen IP acabada entre 1 y 5*/
SELECT IP FROM WiFi
WHERE IP between '192.168.1.1' AND '192.168.1.5';


SELECT DISTINCT r.NºdeReserva FROM RESERVA r, Cliente c
WHERE r.FechaEntrada = '2011/01/08' AND r.FechaSalida = '2011/01/17';

/*Ejercicios con restricciones minimas*/

/*Poner nombre de la temporada, y fecha de entrada si es la misma que la fecha de inicio de temporada. Ademas poner nombre de la temporada y fecha de salida si es la misma que la fecha final de la temporada*/

SELECT b.Nom, a.FechaEntrada FROM reserva a, temporada b, reserv_temp c
WHERE a.NºdeReserva = c.codReserv AND b.codigo = c.codTemp AND a.FechaEntrada = b.FechaIncio
UNION
SELECT b.Nom, a.FechaSalida FROM reserva a, temporada b, reserv_temp c
WHERE a.NºdeReserva = c.codReserv AND b.codigo = c.codTemp AND a.FechaSalida = b.FechaFinal;


/**/
SELECT b.Nom, a.Precio FROM RESERVA a, Ubicacion b, Ubicacion_Reserva c
WHERE a.NºdeReserva = c.codReserv AND b.Nom = c.codUbic
GROUP BY b.Direccion
;

/*...*/
SELECT b.Nom, b.Pais FROM RESERVA a, Ubicacion b, Ubicacion_Reserva c
WHERE a.NºdeReserva = c.codReserv AND b.Pais = 'España'
GROUP BY b.Pais;

/*...*/

SELECT a.Nom, b.Precio FROM Cliente a, RESERVA b
WHERE b.Precio > (SELECT AVG(Precio) FROM RESERVA) AND a.codReserv = b.NºdeReserva;

/*...*/

SELECT a.Nom, b.Precio FROM Cliente a, RESERVA b
WHERE b.Precio > (SELECT AVG(Precio) FROM RESERVA) AND a.codReserv = b.NºdeReserva;

							

