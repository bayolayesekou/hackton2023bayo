package com.suivi_rendezvous.dto;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.suivi_rendezvous.models.Article;
import com.suivi_rendezvous.models.LigneCommandeClient;
import com.suivi_rendezvous.models.LigneCommandeFournisseur;
import com.suivi_rendezvous.models.LigneVente;
import com.suivi_rendezvous.models.MouvementStocks;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ArticleDto {
	
	private Integer id;
	private String codeArticle;
	private String designation;
	private BigDecimal prixUnitaireHt;
	private BigDecimal tauxTva;
	private BigDecimal prixUnitaireTtc;
	private String photo;
	private Integer idEntreprise;
	private CategoryDto categoryDto;
	@JsonIgnore
	private List<LigneCommandeClient> ligneCommandeClients;
	@JsonIgnore
	private List<LigneCommandeFournisseur> ligneCommandeFournisseurs; 
	@JsonIgnore
	private List<MouvementStocks> mouvementStocks;
	@JsonIgnore
	private List<LigneVente> ligneVentes;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id=id;
	}
	public Integer getIdEntreprise() {
		return idEntreprise;
	}
	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise=idEntreprise;
	}
	public String getCodeArticle() {
		return codeArticle;
	}
	public void setCodeArticle(String codeArticle) {
		this.codeArticle=codeArticle;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	public BigDecimal getPrixUnitaireHt() {
		return prixUnitaireHt;
	}
	public void setPrixUnitaireHt(BigDecimal prixUnitaireHt) {
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
	public CategoryDto getCategoryDto() {
		return categoryDto;
	}
	public void setCategoryDto(CategoryDto categoryDto) {
		this.categoryDto=categoryDto;
	}
	public List<LigneCommandeClient> getCommandeClients(){
		return ligneCommandeClients;
	}
	public void setCommandeClients(List<LigneCommandeClient> ligneCommandeClients) {
		this.ligneCommandeClients=ligneCommandeClients;
	}
	public List<LigneCommandeFournisseur> getCommandeFournisseurs(){
		return ligneCommandeFournisseurs;
	}
	public void setCommandeFournisseurs(List<LigneCommandeFournisseur> ligneCommandeFournisseurs) {
		this.ligneCommandeFournisseurs=ligneCommandeFournisseurs;
	}
	public List<LigneVente> getLigneVentes(){
		return ligneVentes;
	}
	public void setLigneVentes(List<LigneVente> ligneVentes) {
		this.ligneVentes=ligneVentes;
	}
	//*****************************Les methodes mapping********************************************//
	public static ArticleDto fromEntity(Article a) {
		if(a==null) {
			return null;
		}
		ArticleDto dto=new ArticleDto();
		dto.setId(a.getId());
		dto.setCodeArticle(a.getCodeArticle());
		dto.setDesignation(a.getDesignation());
		dto.setIdEntreprise(a.getIdEntreprise());
		dto.setPrixUnitaireHt(a.getPrixUnitaireHT());
		dto.setPrixUnitaireTtc(a.getPrixUnitaireTtc());
		dto.setTauxTva(a.getTauxTva());
		dto.setCategoryDto(CategoryDto.fromEntity(a.getCategory()));
		dto.setPhoto(a.getPhoto());
		return dto;
		
	}
	public static Article toEntity(ArticleDto dto) {
		if(dto==null) {
			return null;
		}
		Article a=new Article();
		a.setId(dto.getId());
		a.setCodeArticle(dto.getCodeArticle());
		a.setDesignation(dto.getDesignation());
		a.setIdEntreprise(dto.getIdEntreprise());
		a.setPrixUnitaireHT((dto.getPrixUnitaireHt()));
		a.setPrixUnitaireTtc(dto.getPrixUnitaireTtc());
		a.setTauxTva(dto.getTauxTva());
		a.setCategory(CategoryDto.toEntity(dto.getCategoryDto()));
		a.setPhoto(dto.getPhoto());
		return a;
		
	}


}
