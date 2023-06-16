package com.suivi_rendezvous.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.suivi_rendezvous.dto.CommandeClientDto;

public class CommandeClientVelidator {
	
	public static List<String> valide(CommandeClientDto dto){
		List<String> errors=new ArrayList<>();
		if(dto==null) {
			errors.add("Veuillez selectionner le client");
			errors.add("le code est obligatoire");
			errors.add("Veuillez renseigner la date de la commande");
			return errors;
		}
		if(dto.getClientDto()==null || dto.getClientDto().getId()==null) {
			errors.add("Veuillez selectionner le client");
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
