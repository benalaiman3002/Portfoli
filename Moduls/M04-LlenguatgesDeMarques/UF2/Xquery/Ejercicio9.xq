for $menuEsp in parc/restaurants/zona/restaurant/menuEspecial
where $menuEsp = "Infantil"
return
replace node $menuEsp with <petitMenu>Infantil</petitMenu>