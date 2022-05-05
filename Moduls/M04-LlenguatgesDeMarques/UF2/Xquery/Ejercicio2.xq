for $intensitat in doc("parc.xml")/parc/atraccions/zona/atraccio
where $intensitat/intensitat = "Forta" and $intensitat/edatMinima > 12
return concat("La atraccio es: ",$intensitat/@nom) 