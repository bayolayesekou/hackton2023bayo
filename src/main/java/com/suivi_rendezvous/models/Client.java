package com.suivi_rendezvous.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
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
@Table(name = "client")
public class Client extends AbstractEntity{
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "prenom")
	private String prenom;
	
	@Embedded
	private Adresse adresse;
	
	@Column(name = "photo")
	private String photo;
	
	@Column(name = "mail")
	private String mail;
	
	@Column(name = "numTel")
	private String numTel;
	@Column(name = "id_entreprise")
	private Integer idEntreprise;
	
	@OneToMany(mappedBy = "client")
	private List<CommandeClient> lisetecommandeClients;
	
	//****************Getter and Setter*********************************//
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom=prenom;
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail=mail;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTelt(String numTel) {
		this.numTel=numTel;
	}
	public Integer getIdEntreprise() {
		return idEntreprise;
	}
	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise=idEntreprise;
	}
	public List<CommandeClient> getListeCommandeClient(){
		return lisetecommandeClients;
	}
	public void setListeCommandeClient(List<CommandeClient> listeCommandeClient) {
		this.lisetecommandeClients=listeCommandeClient;
	}

}
