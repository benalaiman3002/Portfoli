for $nomatraccio in doc ("parc.xml")/parc/atraccions/zona/atraccio
where $nomatraccio/edatMinima <= 10
return concat("Nom atraccio:", $nomatraccio/@nom)