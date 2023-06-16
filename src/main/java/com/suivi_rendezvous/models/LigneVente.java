package com.suivi_rendezvous.models;

import java.math.BigDecimal;

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
@Table(name = "lignevente")
public class LigneVente extends AbstractEntity{
	
	@Column(name = "quantite")
	private BigDecimal quantite;
	@Column(name = "prixunitaire")
	private BigDecimal prixUnitatire;
	@Column(name = "id_entreprise")
	
	private Integer idEntreprise;
	@Column(name = "id_article")
	private Article article;
	@ManyToOne
	@JoinColumn(name = "idvente")
	private Ventes vente;
	
	public BigDecimal getQuantite() {
		return quantite;
	}
	public void setQuantite(BigDecimal quantite) {
		this.quantite=quantite;
	}
	public BigDecimal getPrixUnitaire() {
		return prixUnitatire;
	}
	public void setPrixUnitaire(BigDecimal prixUnitaire) {
		this.prixUnitatire=prixUnitaire;
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
	public Ventes getVente() {
		return vente;
	}
	public void setVente(Ventes vente) {
		this.vente=vente;
	}
	
	
	
	
	
}
