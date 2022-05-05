for $cosa1 in /parc/botigues
  for $cosa2 in /parc/botigues
    where $cosa1/producte = $cosa2/producte and $cosa1/nom != $cosa2/nom
      return concat($cosa1," i ",$cosa2, " tenen el producte ", $cosa1/producte)