package com.suivi_rendezvous.dto;

import java.math.BigDecimal;

import com.suivi_rendezvous.models.LigneCommandeFournisseur;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneCommandeFournisseurDto {
	
	private Integer id;
	private Integer idEntreprise;
	private ArticleDto articleDto;
	private CommandeFournisseurDto commandeFournisseurDto;
	private BigDecimal quantite;
	private BigDecimal prixUnitaire;
	
	
	public LigneCommandeFournisseurDto() {}
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
	public ArticleDto getArticleDto() {
		return articleDto;
	}
	public void setArticleDto(ArticleDto articleDto) {
		this.articleDto=articleDto;
	}
	public CommandeFournisseurDto getCommandeFournisseurDto() {
		return commandeFournisseurDto;
	}
	public void setCommandeFournisseurDto(CommandeFournisseurDto commandeFournisseurDto) {
		this.commandeFournisseurDto=commandeFournisseurDto;
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
	
	//********************Les methode mapping********************//
	public static LigneCommandeFournisseurDto fromEntity(LigneCommandeFournisseur lcf) {
		if(lcf==null) {
			return null;
		}
		LigneCommandeFournisseurDto dto=new LigneCommandeFournisseurDto();
		dto.setId(lcf.getId());
		dto.setIdEntreprise(lcf.getIdEntreprise());
		dto.setArticleDto(ArticleDto.fromEntity(lcf.getArticle()));
		dto.setCommandeFournisseurDto(CommandeFournisseurDto.fromEntity(lcf.getCommandeFournisseur()));
		return dto;
	}
	public static LigneCommandeFournisseur toEntity(LigneCommandeFournisseurDto dto) {
		if(dto==null) {
			return null;
		}
		LigneCommandeFournisseur lcf=new LigneCommandeFournisseur();
		lcf.setId(dto.getId());
		lcf.setIdEntreprise(dto.getIdEntreprise());
		lcf.setArticle(ArticleDto.toEntity(dto.getArticleDto()));
		lcf.setCommandeFournisseur(CommandeFournisseurDto.toEntity(dto.getCommandeFournisseurDto()));
		return lcf;
	}
	

}
