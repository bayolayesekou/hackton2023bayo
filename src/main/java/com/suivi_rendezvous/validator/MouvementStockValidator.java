package com.suivi_rendezvous.validator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.suivi_rendezvous.dto.MouvementStocksDto;

public class MouvementStockValidator {
	
	public static List<String> validate(MouvementStocksDto dto){
		List<String> errors=new ArrayList<>();
		if(dto==null) {
			errors.add("Veuillez renseigne la date");
			errors.add("Veuillez renseigner la quantite");
			errors.add("Veuillez renseigner l'article");
			return errors;
		}
		if(dto.getDateMvt()==null) {
			errors.add("Veuillez renseigne la date");
		}
		if(dto.getQuantite()==null || dto.getQuantite().compareTo(BigDecimal.ZERO)==0) {
			errors.add("Veuillez renseigner la quantite");
		}
		if(dto.getArticleDto()==null) {
			errors.add("Veuillez renseigner l'article");
		}
		return errors;
	}

}
