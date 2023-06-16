package com.suivi_rendezvous.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.suivi_rendezvous.dto.AdresseDto;

public class AdresseValidator {
	
	public static List<String> valide(AdresseDto adresseDto){
		List<String> errors =new ArrayList<>();
		if(adresseDto==null) {
			errors.add("Veuillez renseigner l'adresse 1");
			errors.add("Veuillez renseigner la ville");
			errors.add("Veuillez renseigner le pays");
			errors.add("Veuillez renseigner le code postal");
			return errors;
		}
		if(!StringUtils.hasLength(adresseDto.getAdresse1())) {
			errors.add("Veuillez renseigner l'adresse 1");
		}
		if(!StringUtils.hasLength(adresseDto.getVille())) {
			errors.add("Veuillez renseigner la ville");
		}
		if(!StringUtils.hasLength(adresseDto.getPays())) {
			errors.add("Veuillez renseigner le pays");
		}
		if(!StringUtils.hasLength(adresseDto.getCodePostal())) {
			errors.add("Veuillez renseigner le code postal");
		}
		return errors;
	}

}
