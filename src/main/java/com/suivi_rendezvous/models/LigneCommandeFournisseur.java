package com.suivi_rendezvous.models;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "lignecommandefournisseur")
public class LigneCommandeFournisseur extends AbstractEntity{
	
	@Column(name = "id_entreprise")
	private Integer idEntreprise;
	@ManyToOne
	@JoinColumn(name = "idarticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name = "idcommandefournisseur")
	private CommandeFournisseur commandeFournisseur;
	
	@Column(name = "quantite")
	private BigDecimal quantite;
	
	@Column(name = "prixunitaire")
	private BigDecimal prixUnitaire;
	
	public BigDecimal getQuantite() {
		return quantite;
	}
	public void setQuantite(BigDecimal quantite) {
		this.quantite=quantite;
	}
	public BigDecimal getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(BigDecimal prixUnitaire) {
		this.prixUnitaire=prixUnitaire;
	}
	public Integer getIdEntreprise() {
		return idEntreprise;
	}
	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise=idEntreprise;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article=article;
	}
	public CommandeFournisseur getCommandeFournisseur() {
		return commandeFournisseur;
	}
	public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
		this.commandeFournisseur=commandeFournisseur;
	}

}
