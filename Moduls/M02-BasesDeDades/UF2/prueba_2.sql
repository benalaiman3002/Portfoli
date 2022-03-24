USE plantes;
SELECT nom_popular, floracio FROM planta
WHERE floracio='Estiu';

SELECT nom_planta FROM dosi_adob
WHERE nom_adob='Casadob';

SELECT nom_adob, tipus_adob FROM adob
WHERE nom_firma='PRISADOB' AND tipus_adob;

SELECT nom_planta FROM planta_interior
WHERE temperatura>'16';

SELECT SUM(quantitat_adob) AS total_adob FROM dosi_adob;

SELECT nom_planta FROM dosi_adob
WHERE quantitat_adob BETWEEN 40  AND 50;

SELECT nom_planta FROM dosi_adob
WHERE nom_estacio='Hivern' OR 'Tardor';

SELECT AVG(quantitat_adob) AS mitjana_adob FROM dosi_adob
WHERE nom_adob='Casadob';

SELECT nom_cientific,nom_popular FROM planta
WHERE nom_popular LIKE '%i%';

SELECT AVG(temperatura) AS mitjana_temperatura FROM planta_interior;

SELECT nom_adob FROM adob
WHERE nom_firma='CIRSADOB' AND 'TIRSADOB';

SELECT COUNT(num_exemplar) FROM exemplar_planta;

SELECT MIN(quantitat_adob),MAX(quantitat_adob) FROM dosi_adob;

SELECT MAX(temperatura) FROM planta_interior;

SELECT nom_planta FROM dosi_adob
WHERE nom_adob='Casadob' AND quantitat_adob> 40;

SELECT nom_planta FROM exemplar_planta
WHERE num_exemplar>4;

SELECT COUNT(quantitat_adob) AS cuenta_Euphorbia FROM dosi_adob
WHERE nom_planta='Euphorbia';

SELECT nom_planta FROM dosi_adob
WHERE nom_estacio='Primavera' OR nom_adob='Sanexplant';

SELECT nom_planta FROM reproduccio
WHERE metode_reproduccio='Esqueix' AND grau_exit='Alt';

SELECT COUNT(grau_exit) FROM reproduccio;