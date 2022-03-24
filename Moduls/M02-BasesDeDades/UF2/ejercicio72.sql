drop database if exists DML4;
create database DML4;
use plantes;
select SUM(quantitat_adob) FROM dosi_adob
group by nom_planta; 