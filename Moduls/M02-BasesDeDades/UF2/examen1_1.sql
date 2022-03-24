USE hospital;
SELECT a.numArea, COUNT(m.nom), COUNT(i.nom) FROM infermer i, metge m, area a
WHERE a.numArea = i.numArea AND a.numArea = m.numArea
GROUP BY a.numArea;
/*CONSULTA 2
Mostra quin ha sigut el diagnòstic més freqüent durant el mes de març.
*/
SELECT max(v.diagnostic) FROM visita v
WHERE (v.data between '2014-03-02' AND '2014-03-22') AND v.diagnostic = (SELECT diagnostic FROM visita having COUNT(*));

/*CONSULTA 3
Mostra el pacient i el número de proves que s'ha fet, el pacient que més visities ha tingut.
*/

SELECT p.dni ,p.nom, p.cognoms, COUNT(v.dniPac) FROM pacient p, prova a, realitzacio r, visita v
WHERE r.codProv = a.codProv AND p.dni = r.dniPac AND v.dniPac = p.dni
group by p.dni
having count(v.dniPac)
order by count(*) DESC LIMIT 1; 

/*
CONSULTA 4
Mostra el nom de les àrees on hi ha algun metge que cobra un sou per baix de la mitjana de tots els metges.
*/

SELECT m.nom, a.nomArea FROM area a, metge m
WHERE a.numArea = m.numArea AND m.sou < (SELECT AVG(sou) FROM metge);

/*CONSULTA 5
Digues la diferència de llits que hi ha entre la planta que més llits té i la planta que menys llits té.
*/
SELECT
(SELECT max(l.numLlit) FROM llit l, planta p
WHERE l.numPl = '2')
-
(SELECT max(l.numLlit) FROM llit l
WHERE numPl = '1');

/*CONSULTA 6
Mostra quants llits no han estat assignats.
*/
SELECT ABS(MAX(l.numLlit) - max(p.numL)) FROM llit l, pacient p WHERE numPl = '1'
UNION 
SELECT ABS(MAX(l.numLlit) - max(p.numL)) FROM llit l, pacient p WHERE numPl= '2';

/*CONSULTA 7
Mostra el nom i els cognoms dels pacients que se'ls ha fet més d'una prova i també més d'una visita.
*/
SELECT 