package com.suivi_rendezvous.models;

import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.metamodel.model.domain.IdentifiableDomainType;

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
@Table(name = "utilisateur")
public class Utilisateur extends AbstractEntity{
	
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;
	@Column(name = "email")
	private String email;
	@Column(name = "datedenaissance")
	private Instant dateDeNaissance;
	@Column(name = "motdepasse")
	private String motDePasse;
	@Embedded
	private Adresse adresse;
	@Column(name = "photo")
	private String photo;
	
	@ManyToOne
	@JoinColumn(name = "identreprise")
	private Entreprise entreprise;
	@OneToMany(mappedBy = "utilisateur")
	private List<Roles> roles;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public Instant getDateNaissance() {
		return dateDeNaissance;
	}
	public void setDateNaissance(Instant dateNaissance) {
		this.dateDeNaissance=dateNaissance;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setModDePasse(String motDePasse) {
		this.motDePasse=motDePasse;
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
	public Entreprise getEntriprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise=entreprise;
	}
	public List<Roles> getRoles() {
		return roles;
	}
	public void setRoles(List<Roles> roles) {
		this.roles=roles;
	}

}
