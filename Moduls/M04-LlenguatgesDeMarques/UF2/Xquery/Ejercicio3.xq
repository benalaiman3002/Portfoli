for $nomBotiga in doc("parc.xml")/parc/botigues/zona/botiga
for $nomRest in doc ("parc.xml")/parc/restaurants/zona/restaurant
where $nomBotiga/../@nom = $nomRest/../@nom

return concat($nomBotiga," esta en la misma zona que ",$nomRest)