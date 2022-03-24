USE plantes;
SELECT p.nom_popular FROM planta p,exemplar_planta ep
WHERE (p.floracio='Estiu') AND (p.nom_cientific=ep.nom_planta);

SELECT k.nom_planta, k.tipus_planta FROM planta_exterior k, planta p
WHERE (p.floracio='Primavera') AND (p.nom_cientific = k.nom_planta);

SELECT pe.nom_planta, ad.nom_adob FROM planta_exterior pe, planta p, dosi_adob dad, adob ad
WHERE (ad.nom_firma='CIRSADOB') AND (pe.nom_planta = p.nom_cientific) AND (dad.nom_adob = ad.nom_adob) AND (dad.nom_adob=p.nom_cientific);

SELECT DISTINCT r.metode_reproduccio FROM exemplar_planta ex, reproduccio r, planta p
WHERE (r.nom_planta=p.nom_cientific) AND (p.nom_cientific=ex.nom_planta);

SELECT CONCAT (p.nom_popular,'(', dad.quantitat_adob,')') FROM adob ad, dosi_adob dad, planta p
WHERE (ad.nom_firma='UOCADOB') AND (dad.nom_planta= p.nom_cientific);

SELECT p.nom_popular, rp.metode_reproduccio FROM planta p, reproduccio rp
WHERE (p.floracio='Hivern') AND (p.nom_cientific = rp.nom_planta);

SELECT p.nom_cientific, p.nom_popular, rp.metode_reproduccio, px.nom_planta, pin.nom_planta FROM planta p, reproduccio rp, planta_exterior px, planta_interior pin
WHERE (rp.metode_reproduccio='Esqueix') AND (rp.grau_exit='Baix') AND (p.nom_cientific = pin.nom_planta);

SELECT p.nom_popular, p.floracio FROM planta p, dosi_adob dad
WHERE (dad.quantitat_adob > 40) AND (p.nom_cientific = dad.nom_planta);

SELECT p.nom_popular FROM planta p, planta_interior pin, planta_exterior pex, exemplar_planta px
WHERE (p.num_exemplar='Llum indirecta') AND (p.nom_cientific = pin.planta_interior);

Select a.tipus_adob, a.nom_firma from adob ad, dosi_adob dad
    where(dad.quantitat_adob >= 20) and (dad.quantitat_adob <= 40) and (ad.nom_adob = dad.nom_adob);

Select c.nom_popular from adob ad, dosi_adob dad, planta p
    where(ad.tipus_adob = 'AI') and (ad.nom_adob = dad.nom_adob) and (dad.nom_planta = p.nom_cientific);

Select a.nom_popular, c.ubicacio from planta p, exemplar_planta pex, planta_interior pin
    where(pex.num_exemplar = 1) and (p.nom_cientific = pex.nom_planta) and (p.nom_cientific = pin.nom_planta);
    
Select p.nom_popular, dad.nom_adob, dad.quantitat_adob FROM planta p, dosi_adob dad, adob ad
 where (dad.quantitat_adob + 10) AND (ad.nom_firma='PRISADOB') AND (dad.quantitat_adob <= 30) AND (ad.nom_adob=dad.nom_adob);
 
 Select p.nom_popular, ad.tipus_adob FROM planta p, adob ad, dosi_adob dad
 where (ad.tipus_adob='AI') AND (p.floracio='Primavera') AND (ad.nom_adob=dad.nom_adob);
 
 Select p.nom_cientific, rp.metode_reproduccio FROM planta p, reproduccio rp, dosi_adob dad
 where (dad.nom_adob != 'Casadob') AND (rp.nom_planta = p.nom_cientific) AND (p.nom_cientific = dad.nom_planta);
    
Select p.floracio, ex.nom_planta FROM planta p, exemplar_planta ex
where (ex.nom_planta = p.nom_cientific) AND (ex.num_exemplar = 1);

Select p.nom_popular, rp.metode_reproduccio, LEFT(mrp.nom_metode,1) FROM planta p, reproduccio rp, metode_reproduccio mrp
where (mrp.nom_metode=rp.metode_reproduccio) AND (rp.grau_exit !='Alt') AND (p.nom_cientific = p.nom_popular);

Select p.nom_cientific FROM planta p, dosi_adob dad
where (p.nom_cientific=dad.nom_planta) AND (p.floracio = dad.nom_estacio);

Select LOWER(px.nom_planta), pin.nom_planta FROM planta p, planta_exterior px, planta_interior pin, dosi_adob dad, adob ad, reproduccio rp
where (px.nom_planta=p.nom_cientific) AND (ad.nom_firma='CIRSADOB') AND (dad.nom_adob=ad.nom_adob) AND (p.nom_cientific=dad.nom_planta) or
(p.nom_cientific=pin.nom_planta) AND (rp.metode_reproduccio='Capficats');

Select p.nom_cientific, pin.temperatura FROM planta_interior pin, planta p
WHERE pin.temperatura = (SELECT MAX(pin.temperatura) FROM planta_interior pin) ORDER BY temperatura,nom_planta;

Select p.nom_popular, dad.quantitat_adob FROM planta p, dosi_adob dad
WHERE dad.quantitat_adob != (SELECT MAX(dad.quantitat_adob) FROM dosi_adob dad) AND dad.quantitat_adob != (SELECT MIN(dad.quantitat_adob) FROM dosi_adob dad)  ORDER BY dad.quantitat_adob;

Select p.nom_cientific, p.nom_popular FROM planta p, dosi_adob dad
WHERE (p.nom_popular LIKE 'C%') AND  (dad.nom_estacio = 'Primavera');

Select nom_cientific FROM planta WHERE nom_cientific NOT IN (Select nom_planta FROM dosi_adob WHERE nom_adob='Casadob');

Select ex.nom_planta, dad.quantitat_adob FROM exemplar_planta ex, dosi_adob dad WHERE dad.quantitat_adob IN (Select min(quantitat_adob) FROM dosi_adob) AND (ex.num_exemplar='1');

select a.nom_cientific from planta a, dosi_adob b
where b.quantitat_adob > (select avg(quantitat_adob) from dosi_adob) and b.nom_planta = a.nom_cientific;

select a.nom_popular from planta a, dosi_adob b
where b.quantitat_adob = (select avg(quantitat_adob) from dosi_adob) and b.nom_planta = a.nom_cientific;

select a.nom_popular from planta a, exemplar_planta b
where b.num_exemplar = (select max(num_exemplar) from exemplar_planta) and b.nom_planta = a.nom_cientific;

select SUM(quantitat_adob) FROM dosi_adob
group by nom_planta; 

select count(nom_firma) from adob
group by nom_firma;

select nom_popular, count(*) from dosi_adob, planta
where nom_cientific = nom_planta
group by nom_planta
having count(*) >= 3
order by count(*), nom_popular;

select nom_planta, SUM(quantitat_adob) from dosi_adob
group by nom_planta
having SUM(quantitat_adob) between 60 and 90
order by SUM(quantitat_adob) DESC;

SELECT nom_planta, floracio, SUM(quantitat_adob) FROM dosi_adob, planta
WHERE nom_cientific = nom_planta AND nom_adob = 'Casadob'
GROUP BY nom_planta;

SELECT p.nom_popular, MAX(ep.num_exemplar) FROM planta p, exemplar_planta ep, planta_interior pin
WHERE pin.nom_planta = p.nom_cientific AND temperatura = 17 AND ep.nom_planta = p.nom_cientific
UNION 
SELECT p.nom_popular, ep.num_exemplar FROM planta p,planta_exterior pex, exemplar_planta ep
WHERE pex.nom_planta = p.nom_cientific
GROUP BY pex.nom_planta;

SELECT dad.quantitat_adob, COUNT(dad.nom_estacio), dad.nom_planta FROM dosi_adob dad
GROUP BY dad.nom_estacio;

/*Mostra el nom científic i popular de les plantes, ordenades per nom científic, que utilitzen adob ‘Casadob’ i que
no l’han utilitzat a Primavera.*/
select p.nom_cientific, p.nom_popular FROM planta p, dosi_adob dad
where p.nom_cientific = dad.nom_planta AND dad.nom_adob = 'Casadob' AND dad.nom_estacio != 'Primavera'
order by p.nom_cientific;

/*Mostra el nom popular de les plantes d'interior que necessiten Llum directa i de les plantes d'exterior que són de
temporada.*/
SELECT p.nom_popular FROM planta p, planta_interior pin, planta_exterior pex, exemplar_planta px
WHERE (p.num_exemplar='Llum indirecta') AND (p.nom_cientific = pin.nom_planta) OR (px.tipus_planta = 'T') AND (p.nom_cientific = px.nom_planta);

/*Mostra el nom popular i el nombre d'exemplars que tenim de les plantes que han utilitzat alguna vegada adob de
Casadob o Sanexplant.*/
select p.nom_popular, max(ex.num_exemplar) FROM planta p, exemplar_planta ex, dosi_adob dad
WHERE p.nom_cientific = ex.nom_planta and ex.nom_planta IN (select nom_planta FROM dosi_adob where nom_adob = 'Casadob') OR ex.nom_planta IN (select nom_planta FROM dosi_adob where nom_adob = 'Sanexplant') 
group by ex.nom_planta;

/*De les plantes que tenim més de 3 exemplars, mostra el nom científic i la mitjana d'adob que han utilitzat
cadascuna i ordena-les per la mitjana d'adob utilitzat de major a menor.*/

select ex.nom_planta, p.nom_cientific, AVG(dad.quantitat_adob) FROM exemplar_planta ex, planta p, dosi_adob dad
where p.nom_cientific = ex.nom_planta AND 

/*De les plantes que han utilitzat més de 100 unitats d'adob, mostra el nom de les plantes i els seus mètodes de
reproducció que han utilitzat*/


