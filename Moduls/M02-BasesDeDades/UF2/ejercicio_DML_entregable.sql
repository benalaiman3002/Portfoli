USE plantes;
/*1. Mostra el nom popular de les plantes que solament tenim un exemplar.*/
SELECT p.nom_popular FROM planta p, exemplar_planta el
WHERE el.nom_planta = p.nom_cientific
GROUP BY el.nom_planta 
HAVING COUNT(el.num_exemplar)=1;
/*2. Mostra el nom popular de les plantes les quals no tenim exemplars.*/
SELECT DISTINCT p.nom_popular FROM planta p, exemplar_planta el
WHERE p.nom_cientific NOT IN (SELECT nom_planta FROM exemplar_planta);
/*3. Mostra les vegades que hem d’abonar les plantes en cada estació.*/
SELECT dad.quantitat_adob, COUNT(dad.nom_estacio), dad.nom_planta FROM dosi_adob dad
GROUP BY dad.nom_estacio;
/*4. Mostra el nom popular i el nombre d’exemplars de les plantes d’interior que necessiten 17 graus de temperatura i totes les d’exterior.*/
SELECT el.num_exemplar, p.nom_popular FROM planta p, planta_interior pin, exemplar_planta el
WHERE pin.nom_planta = p.nom_cientific AND pin.temperatura = 17
UNION
SELECT el.num_exemplar, p.nom_popular FROM planta p, planta_exterior pex, exemplar_planta el
WHERE pex.nom_planta = p.nom_cientific;
/*5. Mostra quines plantes no reben adob a la primavera.*/
SELECT dad.nom_planta, dad.nom_estacio FROM dosi_adob dad
GROUP BY dad.nom_planta
HAVING dad.nom_estacio NOT IN ("Primavera");
/*6. Mostra quants mètodes de reproducció té cada planta.*/
SELECT COUNT(rp.metode_reproduccio), p.nom_popular FROM reproduccio rp, planta p
WHERE rp.nom_planta = p.nom_cientific
GROUP BY rp.nom_planta;
/*7. Mostra quants mètodes de reproducció té cada planta amb un grau d'èxit alt*/
SELECT COUNT(rp.metode_reproduccio), p.nom_popular FROM reproduccio rp, planta p
WHERE rp.nom_planta = p.nom_cientific AND rp.grau_exit = "Alt"
GROUP BY rp.nom_planta;
/*8. Mostra quines plantes no es reprodueixen per 'Esqueix'*/
SELECT COUNT(rp.metode_reproduccio), p.nom_popular FROM reproduccio rp, planta p
WHERE rp.nom_planta = p.nom_cientific AND rp.metode_reproduccio != "Esqueix"
GROUP BY rp.nom_planta;
/*9. Mostra quines plantes d'interior floreixen a la 'Primavera'*/
SELECT p.nom_popular FROM planta p, planta_interior pin
WHERE p.floracio = 'Primavera' AND pin.nom_planta = p.nom_cientific;
/*10. Mostra quants adobs té cada firma comercial.*/
SELECT COUNT(dad.quantitat_adob), ad.nom_firma FROM adob ad, dosi_adob dad
WHERE ad.nom_adob = dad.nom_adob
GROUP BY ad.nom_firma;