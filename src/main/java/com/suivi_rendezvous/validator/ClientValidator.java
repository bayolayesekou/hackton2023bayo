package com.suivi_rendezvous.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.suivi_rendezvous.dto.ClientDto;

public class ClientValidator {
	
	public static List<String> valide(ClientDto clientDto){
		List<String> errors=new ArrayList<>();
		if(clientDto==null) {
			errors.add("Veuillez renseigner le nom du client");
			errors.add("Veuillez renseigner le prenom du client");
			errors.add("Veuillez renseigner le mail du client");
			errors.add("Veuillez renseigner le numero de telephone du client");
			errors.addAll(AdresseValidator.valide(null));
			return errors;
		}
		if(!StringUtils.hasLength(clientDto.getNom())) {
			errors.add("Veuillez renseigner le nom du client");
		}
		if(!StringUtils.hasLength(clientDto.getPrenom())) {
			errors.add("Veuillez renseigner le prenom du client");
		}
		if(!StringUtils.hasLength(clientDto.getMail())) {
			errors.add("Veuillez renseigner le mail du client");
		}
		if(!StringUtils.hasLength(clientDto.getNumTel())) {
			errors.add("Veuillez renseigner le numero de telephone du client");
		}
		errors.addAll(AdresseValidator.valide(clientDto.getAdresseDto()));
		return errors;
	}

}
