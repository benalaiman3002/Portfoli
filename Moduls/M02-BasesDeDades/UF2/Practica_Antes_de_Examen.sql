USE ACB;
/*Exercici 90:
Mostra el nom de l’equip, el pavelló i el seu president dels equips que tenen un aforament per sota la mitjana.
*/
SELECT e.nom, e.estadi, d.nom FROM equip e, membre_equip me, directiu d, estadi a
WHERE a.aforament < (SELECT AVG(aforament) FROM estadi) AND d.carrec = 'President' AND a.nom = e.estadi AND e.nom = me.equip AND me.nom = d.nom ;

/* Exercici 91:
Mostra el nom dels àrbitres que han arbitrat més d’un partit que ha guanyat l’equip de casa.
*/
SELECT ra.arbitre FROM arbitra ra, partit pt
WHERE pt.punts_local > pt.punts_visitant AND pt.equip_local = ra.equip_local AND pt.jornada = ra.jornada
GROUP BY ra.arbitre
HAVING COUNT(*) > 1;

/* Exercici 92:
Trobar el nom de l’equip, el nom dels jugadors i el nom de l’entrenador dels equips que han guanyat com a
mínim dos partits fora de casa
*/
SELECT e.nom, me.nom, en.nom  FROM equip e, membre_equip me, entrenador en, partit pt
WHERE pt.punts_visitant > pt.punts_local AND me.nom = e.nom AND en.nom = me.nom
GROUP BY pt.equip_visitant
HAVING COUNT(*) >= 2;

/*Exercici 93:
Mostra el nom i el president dels equips que han aconseguit una puntuació com a visitants superior a la mitjana
dels equips que han jugat fora.
*/
SELECT e.nom, d.nom, pt.equip_visitant FROM equip e, directiu d, partit pt, membre_equip mep
WHERE e.nom = mep.nom AND mep.nom = d.nom AND e.nom = pt.equip_visitant AND pt.punts_visitant > (SELECT AVG(punts_visitant) FROM partit pt) AND d.carrec = 'President';

/*Exercici 94:
Mostra el nom i la posició on juga dels jugadors que són entrenadors a la vegada. Mostra també l’equip on juga i
ordena-ho tot per l’equip i pel nom del jugador
*/
SELECT j.nom, j.posicio, me.equip FROM membre_equip me, jugador j, entrenador e
WHERE j.nom = me.nom AND me.nom = e.nom
ORDER BY me.equip, j.nom;

/*Exercici 95:
Mostra el nom i l’equip de tots els membres d’algun equip que el seu cognom és Brunet.
*/
SELECT me.nom, me.equip FROM membre_equip me
WHERE nom = 'Brunet';
/*Exercici 96:
Mostra el nom i l’equip al que pertanyen de les persones que són directius però no són presidents.
*/
SELECT  d.nom, me.equip FROM directiu d, membre_equip me
WHERE d.nom = me.nom AND d.carrec != 'President';
/* Exercici 97:
Mostra la quantitat de fitxes que tenim de cada equip.
*/
SELECT SUM(j.fitxa), e.nom FROM jugador j, membre_equip me, equip e
WHERE me.equip = e.nom AND j.nom = me.nom
GROUP BY e.nom;

/*Exercici 98:
Mostrar dels equips que han guanyat alguna vegada fora de casa el total de punts que tenen com a visitants
*/
SELECT pt.punts_visitant, e.nom FROM equip e, partit pt
WHERE pt.equip_visitant = e.nom AND pt.punts_visitant > pt.punts_local
GROUP BY e.nom;

/*Exercici 99:
Mostra la quantitat de punts obtinguts per cada equip jugant com a local.
*/
SELECT sum(pt.punts_local), e.nom FROM partit pt, equip  e
WHERE pt.equip_local = e.nom
GROUP BY e.nom;

/*Exercici 100:
Digues el nom i l’equip on juguen dels jugadors que tenen una fitxa superior al número 400
*/
SELECT j.nom, me.equip FROM jugador j, membre_equip me
WHERE j.fitxa > '400' AND e.nom = me.nom;

/* Exercici 101:
De l’exercici anterior ordena els equips en ordre ascendent i digues quantes fitxes té cada equip.
*/
SELECT j.nom, me.equip FROM jugador j, membre_equip me
WHERE j.fitxa > '400' AND e.nom = me.nom
ORDER BY me.equip;

/*Exercici 102:
Mostra el nom dels equips que tenen el pressupost més alt
*/
SELECT e.nom FROM equip e
WHERE e.pressupost = (SELECT max(pressupost) FROM equip);

/*Exercici 103:
Digues el nom dels àrbitres que han nascut a Olot i també els que porten més de 5 anys arbitrant.
*/
SELECT ar.nom FROM arbitre ar
WHERE ciutat_naixement = 'Olot'
UNION 
SELECT ar.nom FROM arbitre ar
WHERE 5 > (year(now()) - antiguitat);

/*Exercici 104:
Mostra la màxima diferència que s’ha produït en un partit.
*/
SELECT max(abs(pt.punts_visitant - pt.punts_local)), e.nom FROM equip e, partit pt;

/*Exercici 105:
Mostra el nom i el pressupost dels equips que són filials d’un altre. Mostra també a la mateixa línia el nom i el
pressupost del seu equip “pare”
*/

SELECT e.nom, e.pressupost FROM equip e, membre_equip me
WHERE e.nom = me.nom AND filial_de is NOT NULL;

/*Exercici 106:
Mostra la mitjana d’anys que porten els àrbitres arbitrant.
*/
SELECT AVG(ABS(2022 - antiguitat)) FROM arbitre;