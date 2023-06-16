package com.suivi_rendezvous.dto;

import java.math.BigDecimal;
import java.time.Instant;

import com.suivi_rendezvous.models.MouvementStocks;
import com.suivi_rendezvous.models.TypeMouvementStocks;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MouvementStocksDto {
	
	private Integer id;
	private Integer idEntreprise;
	private Instant dateMvt;
	private BigDecimal quantite;
	private ArticleDto articleDto;
	private TypeMouvementStocks typeMvtDto;
	
	public MouvementStocksDto() {}
	
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
	public Instant getDateMvt() {
		return dateMvt;
	}
	public void setDateMvt(Instant dateMvt) {
		this.dateMvt=dateMvt;
	}
	public BigDecimal getQuantite() {
		return quantite;
	}
	public void setQuantite(BigDecimal quantite) {
		this.quantite=quantite;
	}
	public ArticleDto getArticleDto() {
		return articleDto;
	}
	public void setArticleDto(ArticleDto articleDto) {
		this.articleDto=articleDto;
	}
	public TypeMouvementStocks getTypeMouvementStocksDto() {
		return typeMvtDto;
	}
	public void setTypeMouvementStocks(TypeMouvementStocks typeMvtDto) {
		this.typeMvtDto=typeMvtDto;
	}
	//*************************Les methode mapping***********************//
	public static MouvementStocksDto fromEntity(MouvementStocks mvt) {
		if(mvt==null) {
			return null;
		}
		MouvementStocksDto dto=new MouvementStocksDto();
		dto.setId(mvt.getId());
		dto.setIdEntreprise(mvt.getIdEntreprise());
		dto.setDateMvt(mvt.getDateMvt());
		dto.setQuantite(mvt.getQuantite());
		dto.setArticleDto(ArticleDto.fromEntity(mvt.getArticle()));
		dto.setTypeMouvementStocks(mvt.getTypeMouvementStocks());
		return dto;
	}
	public static MouvementStocks toEntity(MouvementStocksDto dto) {
		if(dto==null) {
			return null;
		}
		MouvementStocks mvt=new MouvementStocks();
		mvt.setId(dto.getId());
		mvt.setIdEntreprise(dto.getIdEntreprise());
		mvt.setDateMvt(dto.getDateMvt());
		mvt.setQuantite(dto.getQuantite());
		mvt.setArticle(ArticleDto.toEntity(dto.getArticleDto()));
		mvt.setTypeMouvementStocks(dto.getTypeMouvementStocksDto());
		return mvt;
	}
	

}
