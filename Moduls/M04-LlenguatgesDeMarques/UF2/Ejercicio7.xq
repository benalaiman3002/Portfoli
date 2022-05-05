for $pass in doc("parc.xml")/parc/atraccions/zona/atraccio/servei
where $pass/text() = "PassPreferent"
return insert node attribute vip{'1'} into $pass