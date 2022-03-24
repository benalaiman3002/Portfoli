use motoGP;
/*1A*/
select distinct p.nombre from pilotos p, resultados r
where r.codpiloto = p.codigo AND r.distanciaganador != 'Abandono'
group by r.anyo, r.nombregp;

/*2A*/

select p.nombre, r.nombregp, r.anyo from resultados r, pilotos p
where puesto = (select max(puesto) from resultados where nombregp = r.nombregp and anyo = r.anyo ) and p.codigo = r.codpiloto
group by r.nombregp, r.anyo;

/*3A*/
select disenyador from circuitos
where disenyador is not null
order by longitud limit 1;

/*4A*/
select p.nombre, p.nombreescuderia from resultados r, pilotos p
where p.codigo = r.codpiloto AND r.puesto =1
group by p.nombre
having count(r.puesto) > 1;

/*5A*/
select p.nombre, p.nombreescuderia from resultados r, pilotos p
where p.codigo = r.codpiloto AND (year(p.fechanacimiento) - year(NOW())) > 30 AND r.anyo = 2011 AND r.puesto != 1;

/*6A*/
select c.nombrecircuito from carreras c, pilotos p, resultados r
where c.nombregp = r.nombregp AND c.año = r.anyo AND p.codigo = r.codpiloto AND r.puesto = 1 and p.nacionalidad !='Alemana'
group by c.nombrecircuito;

/*7A*/
select distinct p.nombre, p.codigo, count(r.puesto) from resultados r, pilotos p
where r.codpiloto = p.codigo AND r.anyo = 2010 AND r.puesto = '3'
group by p.nombre;

/*1B*/
select distinct p.nombre from pilotos p, resultados r
where r.codpiloto = p.codigo and r.puesto not in(1,2,3)
group by r.anyo, r.nombregp;

/*2B*/
select p.nombre, r.nombregp, r.anyo from resultados r, pilotos p
where puesto = (select max(puesto) from resultados where nombregp = r.nombregp and anyo = r.anyo and distanciaganador != "Abandono" ) and p.codigo = r.codpiloto
group by r.nombregp, r.anyo;

/*3B*/
select disenyador from circuitos
where disenyador is not null
order by longitud desc limit 1;

/*4B*/
select p.nombre, p.nombreescuderia from resultados r, pilotos p
where p.codigo = r.codpiloto AND r.puesto =1
group by p.nombre
having count(r.puesto) > 1;

/*5B*/
select distinct p.nombre, p.nombreescuderia from resultados r, pilotos p
where p.codigo = r.codpiloto AND (year(p.fechanacimiento) - year(NOW())) < 30 AND r.anyo = 2011 AND r.puesto != 1;

/*6B*/
select c.nombrecircuito from carreras c, pilotos p, resultados r
where c.nombregp = r.nombregp AND c.año = r.anyo AND p.codigo = r.codpiloto AND r.puesto = 1 and p.nacionalidad !='Española'
group by c.nombrecircuito;

/*7B*/
select distinct p.nombre, p.codigo, count(r.puesto) from resultados r, pilotos p
where r.codpiloto = p.codigo AND r.anyo = 2010 AND r.puesto = '1'
group by p.nombre;