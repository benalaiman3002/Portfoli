
USE EjercicioHotel;

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

