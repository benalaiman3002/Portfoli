let $passis := count(/parc/espectacles/zona/espectacle/horari/passi [horaInici = "16:00"])
return concat("Total passis que comencen a les 16:00: ", $passis)