package com.suivi_rendezvous.models;

import java.time.Instant;
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
@Table(name = "vente")
public class Ventes extends AbstractEntity{

	@Column(name = "code")
	private String code;
	@Column(name = "datevente")
	private Instant dateVente;
	
	@Column(name = "commentaire")
	private String commentaire;
	@Column(name = "id_entreprise")
	private Integer idEntreprise;
	
	@OneToMany(mappedBy = "vente")
	private List<LigneVente> ligneVentes;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code=code;
	}
	public Instant getDateVente() {
		return dateVente;
	}
	public void setDateVente(Instant dateVente) {
		this.dateVente=dateVente;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire=commentaire;
	}
	public Integer getIdEntreprise() {
		return idEntreprise;
	}
	public void setIdEntreprise(Integer idEntreprsise) {
		this.idEntreprise=idEntreprsise;
	}
	public List<LigneVente> getLigneVentes(){
		return ligneVentes;
	}
	public void setLigneVentes(List<LigneVente> ligneVentes) {
		this.ligneVentes=ligneVentes;
	}
}
