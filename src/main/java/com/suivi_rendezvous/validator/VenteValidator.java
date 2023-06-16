package com.suivi_rendezvous.validator;

import java.util.ArrayList;
import java.util.List;

import com.suivi_rendezvous.dto.VentesDto;

public class VenteValidator {
	
	public static List<String> validate(VentesDto dto){
		
		List<String> errors=new ArrayList<>();
		if(dto==null) {
			errors.add("Le code est obligatoire");
			errors.add("Veuillez renseigner la datd de la vente" );
			return errors;
		}
		if(dto.getCode()==null) {
			errors.add("Le code est obligatoire");
		}
		if(dto.getDateVente()==null) {
			errors.add("Veuillez renseigner la datd de la vente" );
		}
		return errors;
	}

}
