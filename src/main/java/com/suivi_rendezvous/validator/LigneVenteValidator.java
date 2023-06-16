package com.suivi_rendezvous.validator;

import java.util.ArrayList;
import java.util.List;

import com.suivi_rendezvous.dto.LigneVenteDto;

public class LigneVenteValidator {
	
	public static List<String> validate(LigneVenteDto dto){
		List<String> errors=new ArrayList<>();
		if(dto==null) {
			errors.add("Veuillez renseigner la quantite");
			errors.add("Veuillez renseigner le prix de unitaire");
			errors.add("Veuillez renseigner la vente");
			return errors;
		}
		if(dto.getQuantite()==null) {
			errors.add("Veuillez renseigner la quantite");
		}
		if(dto.getPrixUnitaire()==null) {
			errors.add("Veuillez renseigner le prix de unitaire");
		}
		if(dto.getVenteDto()==null) {
			errors.add("Veuillez renseigner la vente");
		}
		return errors;
	}

}
