package com.suivi_rendezvous.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.suivi_rendezvous.dto.FournisseurDto;

public class FournisseurValidator {
	
	public static List<String> valide(FournisseurDto fournisseurDto){
		List<String> errors=new ArrayList<>();
		if(fournisseurDto==null) {
			errors.add("Veuillez renseigner le nom du fournisseur");
			errors.add("Veuillez renseigner le prenom du fournisseur");
			errors.add("Veuillez renseigner le mail du fournisseur");
			errors.add("Veuillez renseigner le numero de telephone du fournisseur");
			errors.addAll(AdresseValidator.valide(null));
			return errors;
		}
		if(!StringUtils.hasLength(fournisseurDto.getNom())) {
			errors.add("Veuillez renseigner le nom du fournisseur");
		}
		if(!StringUtils.hasLength(fournisseurDto.getPrenom())) {
			errors.add("Veuillez renseigner le prenom du fournisseur");
		}
		if(!StringUtils.hasLength(fournisseurDto.getMail())) {
			errors.add("Veuillez renseigner le mail du fournisseur");
		}
		if(!StringUtils.hasLength(fournisseurDto.getNumTel())) {
			errors.add("Veuillez renseigner le numero de telephone du fournisseur");
		}
		errors.addAll(AdresseValidator.valide(fournisseurDto.getAdresseDto()));
		return errors;
	}

}
