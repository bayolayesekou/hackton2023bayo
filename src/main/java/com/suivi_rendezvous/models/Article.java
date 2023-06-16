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
@Table(name = "article")
public class Article extends AbstractEntity{
	
	@Column(name = "codearticle")
	private String codeArticle;
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "prixunitaireht")
	private BigDecimal prixUnitaireHt;
	
	@Column(name = "tauxtva")
	private BigDecimal tauxTva;
	
	@Column(name = "prixunitairettc")
	private BigDecimal prixUnitaireTtc;
	
	@Column(name = "id_entreprise")
	private Integer idEntreprise;
	
	@Column(name = "photo")
	private String photo;
	
	@ManyToOne
	@JoinColumn(name = "idcategory")
	private Category category;
	
	@OneToMany(mappedBy = "article")
	private List<LigneCommandeClient> ligneCommandeClients;
	@OneToMany(mappedBy = "article")
	private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;
	@OneToMany(mappedBy = "article")
	private List<MouvementStocks> mouvementStocks ;
	@OneToMany(mappedBy = "vente")
	private List<LigneVente> listeLigneVentes;
	
	//*******************************Geetter and Setter***************************************/
	public String getCodeArticle() {
		return codeArticle;
	}
	public void setCodeArticle(String codeArtilce) {
		this.codeArticle=codeArtilce;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	
	public BigDecimal getPrixUnitaireHT() {
		return prixUnitaireHt;
	}
	public void setPrixUnitaireHT(BigDecimal prixUnitaireHt) {
		this.prixUnitaireHt=prixUnitaireHt;
	}
	
	public BigDecimal getTauxTva() {
		return tauxTva;
	}
	public void setTauxTva(BigDecimal tauxTva) {
		this.tauxTva=tauxTva;
	}
	
	public BigDecimal getPrixUnitaireTtc() {
		return prixUnitaireTtc;
	}
	public void setPrixUnitaireTtc(BigDecimal prixUnitaireTtc) {
		this.prixUnitaireTtc=prixUnitaireTtc;
	}
	
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo=photo;
	}
	public Integer getIdEntreprise() {
		return idEntreprise;
	}
	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise=idEntreprise;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category=category;
	}
	public List<LigneCommandeClient> getLigneCommandeClient(){
		return ligneCommandeClients;
	}
	public void setLigneCommande(List<LigneCommandeClient> ligneCommandeClients) {
		this.ligneCommandeClients=ligneCommandeClients;
	}
	public List<LigneCommandeFournisseur> getLigneCommandeFournisseurs(){
		return ligneCommandeFournisseurs;
	}
	public void setLigneCommandeFournisseur(List<LigneCommandeFournisseur> ligneCommandeFournisseurs) {
		this.ligneCommandeFournisseurs=ligneCommandeFournisseurs;
	}
	public List<MouvementStocks> getMouvementStocks(){
		return mouvementStocks;
	}
	public void setMouvementStocks(List<MouvementStocks> mouvementStocks) {
		this.mouvementStocks=mouvementStocks;
	}
	public List<LigneVente> getLigneVentes(){
		return listeLigneVentes;
	}
	public void setLigneVentes(List<LigneVente> ligneVentes) {
		this.listeLigneVentes=ligneVentes;
	}
}
