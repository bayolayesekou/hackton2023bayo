package com.suivi_rendezvous.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.suivi_rendezvous.dto.UtilisateurDto;

public class UtilisateurValidator {
	
	public static List<String> valide(UtilisateurDto userDto){
		List<String> errors=new ArrayList<>();
		if(userDto==null) {
			errors.add("Veuillez renseigner le nom d'utilisateur");
			errors.add("Veuillez renseigner le prenom d'utilisateur");
			errors.add("Veuillez renseigner l'email d'utilisateur");
			errors.add("Veuillez renseigner la date de naissance d'utilisateur");
			errors.add("Veuillez renseigner le mot de passe d'utilisateur");
			errors.addAll(AdresseValidator.valide(null));
			return errors;
		}
		
		if(!StringUtils.hasLength(userDto.getNom())) {
			errors.add("Veuillez renseigner le nom d'utilisateur");
		}
		if(!StringUtils.hasLength(userDto.getPrenom())) {
			errors.add("Veuillez renseigner le prenom d'utilisateur");
		}
		if(!StringUtils.hasLength(userDto.getEmail())) {
			errors.add("Veuillez renseigner l'email d'utilisateur");
		}
		if(userDto.getDateDeNaissance()==null) {
			errors.add("Veuillez renseigner le nom d'utilisateur");
		}
		if(StringUtils.hasLength(userDto.getMotDePasse())) {
			errors.add("Veuillez renseigner le mot de passe d'utilisateur");
		}
		errors.addAll(AdresseValidator.valide(userDto.getAdresseDto()));
		return errors;
	}

}
