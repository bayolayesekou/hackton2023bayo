package com.suivi_rendezvous.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.suivi_rendezvous.dto.CommandeFournisseurDto;

public class CommandeForunisseurValidator {
	
	public static List<String> valide(CommandeFournisseurDto dto){
		List<String> errors=new ArrayList<>();
		if(dto==null) {
			errors.add("Veuillez selectionner le fournisseur");
			errors.add("le code est obligatoire");
			errors.add("Veuillez renseigner la date de la commande");
			return errors;
		}
		if(dto.getFournisseurDto()==null || dto.getFournisseurDto().getId()==null) {
			errors.add("Veuillez selectionner le fournisseur");
		}
		if(!StringUtils.hasLength(dto.getCode())) {
			errors.add("le code est obligatoire");
		}
		if(dto.getDateCommande()==null) {
			errors.add("Veuillez renseigner la date de la commande");
		}
		return errors;
	}

}
