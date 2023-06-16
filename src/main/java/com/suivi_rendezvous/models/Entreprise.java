package com.suivi_rendezvous.models;

import java.beans.DesignMode;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "entreprise")
public class Entreprise extends AbstractEntity{
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "codefiscal")
	private String codefiscal;
	@Column(name = "nom")
	private Adresse adresse;
	@Column(name = "photo")
	private String photo;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "numTel")
	private String numTel;
	
	@Column(name = "siteweb")
	private String siteweb;

	@Column(name = "description")
	private String description;
	
	@OneToMany(mappedBy = "entreprise")
	private List<Utilisateur> listeUtilisateurs;
	
	//********************Getter and setter******************************//
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
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse=adresse;
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

}
