package com.suivi_rendezvous.validator;

import java.util.ArrayList;
import java.util.List;

import com.suivi_rendezvous.dto.LigneCommandeFournisseurDto;

public class LigneCommandeFournisseurValidator {
	
	public static List<String> valide(LigneCommandeFournisseurDto dto){
		List<String> errors =new ArrayList<>();
		if(dto==null) {
			errors.add("Veuillez ajouter un article");
			errors.add("Veuillez selectioner un client");
			return errors;
		}
		if(dto.getArticleDto()==null) {
			errors.add("Veuillez ajouter un article");
		}
		if(dto.getCommandeFournisseurDto()==null) {
			errors.add("Veuillez selectioner un fournisseur");
		}
		return errors;
	}

}
