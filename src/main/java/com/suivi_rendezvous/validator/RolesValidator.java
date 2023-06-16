package com.suivi_rendezvous.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.suivi_rendezvous.dto.RolesDto;

public class RolesValidator {
	
	public static List<String> validate(RolesDto dto){
		List<String> errors =new ArrayList<>();
		if(dto==null) {
			errors.add("Veuillez selectionner un utilisateur");
			errors.add("Veuillez renseigner les roles de l'utilisateur");
			return errors;
		}
		if(dto.getUtilisateursDto()==null) {
			errors.add("Veuillez selectionner un utilisateur");
		}
		if(!StringUtils.hasLength(dto.getRoleName())) {
			errors.add("Veuillez renseigner les roles de l'utilisateur");
		}
		return errors;
	}

}
