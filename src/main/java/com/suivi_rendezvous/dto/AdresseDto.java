package com.suivi_rendezvous.dto;


import com.suivi_rendezvous.models.Adresse;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdresseDto {

	private String adresse1;
	private String adresse2;
	private String ville;
	private String codePostal;
	private String pays;
	public AdresseDto() {}
	public String getAdresse1() {
		return adresse1;
	}
	public void setAdresse1(String adresse1) {
		this.adresse1=adresse1;
	}
	public String getAdresse2() {
		return adresse2;
	}
	public void setAdresse2(String adresse2) {
		this.adresse2=adresse2;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville=ville;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal=codePostal;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays=pays;
	}
	
	// **************************Les methodes***********************//
	
	public static AdresseDto fromEntity(Adresse a) {
		if(a==null) {
			return null;
		}
		AdresseDto dto=new AdresseDto();
		dto.setAdresse1(a.getAdresse1());
		dto.setAdresse2(a.getAdresse2());
		dto.setVille(a.getVille());
		dto.setCodePostal(a.getCodePostal());
		dto.setPays(a.getPays());
		return dto;
	}
	public static Adresse toEntity(AdresseDto dto) {
		if(dto==null) {
			return null;
		}
		Adresse a=new Adresse();
		a.setAdresse1(dto.getAdresse1());
		a.setAdresse2(dto.getAdresse2());
		a.setVille(dto.getVille());
		a.setCodePostal(dto.getCodePostal());
		a.setPays(dto.getPays());
		return a;
	}
	

}
