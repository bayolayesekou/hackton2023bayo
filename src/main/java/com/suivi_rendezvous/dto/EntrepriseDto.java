package com.suivi_rendezvous.dto;

import java.util.List;

import com.suivi_rendezvous.models.Entreprise;
import com.suivi_rendezvous.models.Utilisateur;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EntrepriseDto {
	
	private Integer id;
	private String nom;
	private String description;
	private String codefiscal;
	private AdresseDto adresseDto;
	private String photo;
	private String email;
	private String numTel;
	private String siteweb;
	private List<Utilisateur> listeUtilisateurs;
	
	public EntrepriseDto() {}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id=id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public String getCodeFiscal() {
		return codefiscal;
	}
	public void setCodeFiscal(String codeFiscal) {
		this.codefiscal=codeFiscal;
	}
	public AdresseDto getAdresseDto() {
		return adresseDto;
	}
	public void setAdresseDto(AdresseDto adresseDto) {
		this.adresseDto=adresseDto;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo=photo;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel=numTel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getSiteWeb() {
		return siteweb;
	}
	public void setSiteWeb(String siteweb) {
		this.siteweb=siteweb;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description=description;
	}
	public List<Utilisateur> getListeUtilisateurs(){
		return listeUtilisateurs;
	}
	public void setListeUtilisateurs(List<Utilisateur> listeUtilisateurs) {
		this.listeUtilisateurs=listeUtilisateurs;
	}
	//********************Les methodes mapping**************************************//
	public static EntrepriseDto fromEntity(Entreprise e) {
		if(e==null) {
			return null;
		}
		EntrepriseDto dto=new EntrepriseDto();
		dto.setId(e.getId());
		dto.setNom(e.getNom());
		dto.setDescription(e.getDescription());
		dto.setCodeFiscal(e.getCodeFiscal());
		dto.setAdresseDto(AdresseDto.fromEntity(e.getAdresse()));
		dto.setPhoto(e.getPhoto());
		dto.setNumTel(e.getNumTel());
		dto.setEmail(e.getEmail());
		dto.setSiteWeb(e.getSiteWeb());
		return dto;
	}
	public static Entreprise toEntity(EntrepriseDto dto) {
		if(dto==null) {
			return null;
		}
		Entreprise e=new Entreprise();
		e.setId(dto.getId());
		e.setNom(dto.getNom());
		e.setDescription(dto.getDescription());
		e.setCodeFiscal(dto.getCodeFiscal());
		e.setAdresse(AdresseDto.toEntity(dto.getAdresseDto()));
		e.setPhoto(dto.getPhoto());
		e.setNumTel(dto.getNumTel());
		e.setEmail(dto.getEmail());
		e.setSiteWeb(dto.getSiteWeb());
		return e;
	}

}
