package com.suivi_rendezvous.dto;

import java.util.List;

import com.suivi_rendezvous.models.Fournisseur;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FournisseurDto {
	
	private Integer id;
	private Integer idEntreprise;
	private String nom;
	private String prenom;
	private AdresseDto adresseDto;
	private String photo;
	private String mail;
	private String numTel;
	
	private List<CommandeFournisseurDto> listeCommandeFournisseurs;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id=id;
	}
	public Integer getIdEntreprise() {
		return idEntreprise;
	}
	public void setIdEntreprise(Integer idEntreprise){
		this.idEntreprise=idEntreprise;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public void setPrenom(String nom) {
		this.nom=nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenoom(String prenom) {
		this.prenom=prenom;
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail=mail;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel=numTel;
	}
	public List<CommandeFournisseurDto> getListeCommandeFournisseur(){
		return listeCommandeFournisseurs;
	}
	public void setListeCommandeClient(List<CommandeFournisseurDto> listeCommandeFournisseurs) {
		this.listeCommandeFournisseurs=listeCommandeFournisseurs;
	}
	
	//***********************Les methodes mapping*****************//
		public static FournisseurDto fromEntity(Fournisseur f) {
			if(f==null) {
				return null;
			}
			FournisseurDto dto=new FournisseurDto();
			dto.setId(f.getId());
			dto.setIdEntreprise(f.getIdEntreprise());
			dto.setNom(f.getNom());
			dto.setPrenom(f.getPrenom());
			dto.setAdresseDto(AdresseDto.fromEntity(f.getAdresse()));
			dto.setPhoto(f.getPhoto());
			dto.setMail(f.getMail());
			dto.setNumTel(f.getNumTel());
			return dto;
		}
		public static Fournisseur toEntity(FournisseurDto dto) {
			if(dto==null) {
				return null;
			}
			Fournisseur f=new Fournisseur();
			f.setId(dto.getId());
			f.setIdEntreprise(dto.getIdEntreprise());
			f.setNom(dto.getNom());
			f.setPrenom(dto.getPrenom());
			f.setAdresse(AdresseDto.toEntity(dto.getAdresseDto()));
			f.setPhoto(dto.getPhoto());
			f.setMail(dto.getMail());
			f.setNumTelt(dto.getNumTel());
			return f;
		}

}
