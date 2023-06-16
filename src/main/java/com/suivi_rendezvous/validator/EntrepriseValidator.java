package com.suivi_rendezvous.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.suivi_rendezvous.dto.EntrepriseDto;

public class EntrepriseValidator {
	
	public static List<String> valide(EntrepriseDto dto){
		List<String> errors =new ArrayList<>();
		if(dto==null) {
			errors.add("Veuillez renseigner le nom de l'entreprise");
			errors.add("Veuillez renseigner le nom de l'entreprise");
			errors.add("Veuillez renseigner le code fiscal de l'entreprise");
			errors.add("Veuillez renseigner l'email de l'entreprise");
			errors.add("Veuillez renseigner le numero de telephone de l'entreprise");
			errors.addAll(AdresseValidator.valide(null));
			return errors;
		}
		if(!StringUtils.hasLength(dto.getNom())) {
			errors.add("Veuillez renseigner le nom de l'entreprise");
		}
		if(!StringUtils.hasLength(dto.getDescription())) {
			errors.add("Veuillez renseigner la description de l'entreprise");
		}
		if(!StringUtils.hasLength(dto.getCodeFiscal())) {
			errors.add("Veuillez renseigner le code fiscal de l'entreprise");
		}
		if(!StringUtils.hasLength(dto.getEmail())) {
			errors.add("Veuillez renseigner l'email de l'entreprise");
		}
		if(!StringUtils.hasLength(dto.getNumTel())) {
			errors.add("Veuillez renseigner le numero de telephone de l'entreprise");
		}
		errors.addAll(AdresseValidator.valide(dto.getAdresseDto()));
		return errors;
	}

}
