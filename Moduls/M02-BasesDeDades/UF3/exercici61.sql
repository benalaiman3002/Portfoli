use ACB;

DELIMITER //
CREATE TRIGGER ex_61_2 AFTER INSERT on partit for each row
begin
if((select count(*) from classificacioo where new.equip_local=equip)=0)  then
insert into classificacioo value (new.equip_local,0,0,0,0,0);  
end if;

if ((select count(*) from classificacioo where new.equip_visitant=equip)=0) then
insert into classificacioo value (new.equip_visitant,0,0,0,0,0);  
end if;

	if(NEW.punts_local < new.punts_visitant) then 
		update classificacioo set  partits_guanyats = partits_guanyats +1,gols_favor = gols_favor + new.punts_local, gols_contra = gols_contra + new.punts_visitant where equip = new.equip_local;
		update classificacioo set  partits_perduts = partits_perduts,gols_favor = gols_favor + new.punts_visitant, gols_contra = gols_contra + new.punts_local where equip = new.equip_visitant;
	elseif(new.punts_visitant < new.punts_local) then
		update classificacioo set  partits_guanyats = partits_guanyats,gols_favor = gols_favor + new.punts_local, gols_contra = gols_contra + new.punts_visitant where equip = new.equip_visitant;
		update classificacioo set  partits_perduts = partits_perduts +1,gols_favor = gols_favor + new.punts_local, gols_contra = gols_contra + new.punts_visitant where equip = new.equip_local;
	elseif(new.punts_visitant = new.punts_local) then
		update classificacioo set  partits_empatats = partits_empatats +1,gols_favor = gols_favor + new.punts_local, gols_contra = gols_contra + new.punts_visitant where equip = new.equip_local;
		update classificacioo set  partits_empatats = partits_empatats,gols_favor = gols_favor + new.punts_local, gols_contra = gols_contra + new.punts_visitant where equip = new.equip_visitant;
	end if;
end //
CREATE TRIGGER ex_61 AFTER DELETE on partit  for each row
begin
	if(old.punts_local < old.punts_visitant) then 
		update classificacioo set  partits_guanyats = partits_guanyats -1,gols_favor = gols_favor + old.punts_local, gols_contra = gols_contra + old.punts_visitant where equip = old.equip_local;
		update classificacioo set  partits_perduts = partits_perduts ,gols_favor = gols_favor + old.punts_local, gols_contra = gols_contra + old.punts_visitant where equip = old.equip_local;
	elseif(old.punts_visitant < old.punts_local) then
		update classificacioo set  partits_guanyats = partits_guanyats -1,gols_favor = gols_favor + old.punts_local, gols_contra = gols_contra + old.punts_visitant where equip = old.equip_visitant;
		update classificacioo set  partits_perduts = partits_perduts,gols_favor = gols_favor + old.punts_local, gols_contra = gols_contra + old.punts_visitant where equip = old.equip_visitant;
	elseif(old.punts_visitant = old.punts_local) then
		update classificacioo set  partits_empatats = partits_empatats -1,gols_favor = gols_favor + old.punts_local, gols_contra = gols_contra + old.punts_visitant where equip = old.equip_local;
		update classificacioo set  partits_empatats = partits_empatats,gols_favor = gols_favor + old.punts_local, gols_contra = gols_contra + old.punts_visitant where equip = old.equip_visitant;
	end if;
end //
CREATE TRIGGER ex61_2 AFTER UPDATE on partit for each row
begin
	if(old.punts_local < old.punts_visitant) then
		update classificacioo set  partits_guanyats = partits_guanyats -1,gols_favor = gols_favor + old.punts_local, gols_contra = gols_contra + old.punts_visitant where equip = old.equip_local;
		update classificacioo set  partits_perduts = partits_perduts -1,gols_favor = gols_favor + old.punts_local, gols_contra = gols_contra + old.punts_visitant where equip = old.equip_local;
	elseif(old.punts_visitant < old.punts_local) then
		update classificacioo set  partits_guanyats = partits_guanyats -1,gols_favor = gols_favor + old.punts_local, gols_contra = gols_contra + old.punts_visitant where equip = old.equip_visitant;
		update classificacioo set  partits_perduts = partits_perduts -1,gols_favor = gols_favor + old.punts_local, gols_contra = gols_contra + old.punts_visitant where equip = old.equip_visitant;
	elseif(old.punts_visitant = old.punts_local) then
		update classificacioo set  partits_empatats = partits_empatats -1,gols_favor = gols_favor + old.punts_local, gols_contra = gols_contra + old.punts_visitant where equip = old.equip_local;
		update classificacioo set  partits_empatats = partits_empatats -1,gols_favor = gols_favor + old.punts_local, gols_contra = gols_contra + old.punts_visitant where equip = old.equip_visitant;
	end if;
	if(new.punts_local < new.punts_visitant) then
		update classificacioo set  partits_guanyats = partits_guanyats +1,gols_favor = gols_favor + new.punts_local, gols_contra = gols_contra + new.punts_visitant where equip = new.equip_local;
		update classificacioo set  partits_perduts = partits_perduts +1,gols_favor = gols_favor + new.punts_local, gols_contra = gols_contra + new.punts_visitant where equip = new.equip_local;
	elseif(new.punts_visitant < new.punts_local) then
		update classificacioo set  partits_guanyats = partits_guanyats +1,gols_favor = gols_favor + new.punts_local, gols_contra = gols_contra + new.punts_visitant where equip = new.equip_visitant;
		update classificacioo set  partits_perduts = partits_perduts +1,gols_favor = gols_favor + new.punts_local, gols_contra = gols_contra + new.punts_visitant where equip = new.equip_local;
	elseif(new.punts_visitant = new.punts_local) then
		update classificacioo set  partits_empatats = partits_empatats +1,gols_favor = gols_favor + new.punts_local, gols_contra = gols_contra + new.punts_visitant where equip = new.equip_local;
		update classificacioo set  partits_empatats = partits_empatats +1,gols_favor = gols_favor + new.punts_local, gols_contra = gols_contra + new.punts_visitant where equip = new.equip_visitant;
	end if;
end //
DELIMITER ;


select * from classificacioo;