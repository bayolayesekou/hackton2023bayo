package com.suivi_rendezvous.models;

import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "commandefournisseur")
public class CommandeFournisseur extends AbstractEntity{
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "datecommande")
	private Instant dateCommande;
	
	@ManyToOne
	@JoinColumn(name = "idfournisseur")
	private Fournisseur fournisseur;
	@Column(name = "id_entreprise")
	private Integer idEntreprise;
	
	@OneToMany(mappedBy = "commandeFournisseur")
	private List<LigneCommandeFournisseur> listeCommandeFournisseurs;
	//*****************Getter and Setter******************************//
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code=code;
	}
	public Instant getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(Instant dateCommande) {
		this.dateCommande=dateCommande;
	}
	public Integer getIdEntreprise() {
		return idEntreprise;
	}
	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise=idEntreprise;
	}
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur=fournisseur;
	}
	public List<LigneCommandeFournisseur> getListeCommandefFournisseurs(){
		return listeCommandeFournisseurs;
	}
	public void setListeCommandeFournisseur(List<LigneCommandeFournisseur> listeCommandeFournisseurs) {
		this.listeCommandeFournisseurs=listeCommandeFournisseurs;
	}


}
