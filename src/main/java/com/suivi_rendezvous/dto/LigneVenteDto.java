package com.suivi_rendezvous.dto;

import java.math.BigDecimal;

import com.suivi_rendezvous.models.LigneVente;

import lombok.Builder;
import lombok.Data;

/**
 * @author BLAYE_PYTHA
 *
 */
@Data
@Builder
public class LigneVenteDto {
	
	private Integer id;
	private Integer idEntreprise;
	private BigDecimal quantite;
	private BigDecimal prixUnitatire;
	private VentesDto venteDto;
	private ArticleDto articleDto;
	
	public LigneVenteDto() {}
	
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
	public VentesDto getVenteDto() {
		return venteDto;
	}
	public void setVenteDto(VentesDto ventesDto) {
		this.venteDto=ventesDto;
	}
	public ArticleDto getArticleDto() {
		return articleDto;
	}
	public void setArticleDto(ArticleDto articleDto) {
		this.articleDto=articleDto;
	}
	
	//******************Les methodes mapping*******************************//
	public static LigneVenteDto fromEntity(LigneVente lv) {
		if(lv==null) {
			return null;
		}
		LigneVenteDto dto=new LigneVenteDto();
		dto.setId(lv.getId());
		dto.setIdEntreprise(lv.getIdEntreprise());
		dto.setQuantite(lv.getQuantite());
		dto.setPrixUnitaire(lv.getPrixUnitaire());
		dto.setVenteDto(VentesDto.fromEntity(lv.getVente()));
		dto.setArticleDto(ArticleDto.fromEntity(lv.getArticle()));
		return dto;
	}
	public static LigneVente toEntity(LigneVenteDto dto) {
		if(dto==null) {
			return null;
		}
		LigneVente lv=new LigneVente();
		lv.setId(dto.getId());
		lv.setIdEntreprise(dto.getIdEntreprise());
		lv.setQuantite(dto.getQuantite());
		lv.setPrixUnitaire(dto.getPrixUnitaire());
		lv.setVente(VentesDto.toEntity(dto.getVenteDto()));
		lv.setArticle(ArticleDto.toEntity(dto.getArticleDto()));
		return lv;
	}
	
	

}
