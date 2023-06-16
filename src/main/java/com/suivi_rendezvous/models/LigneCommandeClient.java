package com.suivi_rendezvous.models;

import java.math.BigDecimal;
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
@Table(name = "lignecommandeclient")
public class LigneCommandeClient extends AbstractEntity{
	
	@Column(name = "quantite")
	private BigDecimal quantite;
	
	@Column(name = "prixunitaire")
	private BigDecimal prixUnitaire;
	
	@Column(name = "id_entreprise")
	private Integer idEntreprise;
	@ManyToOne
	@JoinColumn(name = "idarticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name = "idcommandeclient")
	private CommandeClient commandeClient;
	
	public LigneCommandeClient() {
		// TODO Auto-generated constructor stub
	}
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
	public CommandeClient getCommandeClient() {
		return commandeClient;
	}
	public void setCommandeClient(CommandeClient commandeClient) {
		this.commandeClient=commandeClient;
	}
	
		
	

}
