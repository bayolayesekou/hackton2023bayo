package com.suivi_rendezvous.dto;



import java.math.BigDecimal;

import com.suivi_rendezvous.models.LigneCommandeClient;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneCommandeClientDto {
	
	private Integer id;
	private Integer idEntreprise;
	private ArticleDto articleDto;
	private CommandeClientDto commandeClientDto;
	private BigDecimal quantite;
	private BigDecimal prixUnitaire;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdEntreprise() {
		return idEntreprise;
	}
	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise = idEntreprise;
	}
	public ArticleDto getArticleDto() {
		return articleDto;
	}
	public void setArticleDto(ArticleDto articleDto) {
		this.articleDto = articleDto;
	}
	public BigDecimal getQuantite() {
		return quantite;
	}
	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}
	public BigDecimal getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(BigDecimal prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public CommandeClientDto getCommandeClientDto() {
		return commandeClientDto;
	}
	public void setCommandeClientDto(CommandeClientDto commandeClientDto) {
		this.commandeClientDto = commandeClientDto;
	}
	//****************Les methodes mapping************************//
	public static LigneCommandeClientDto fromEntity(LigneCommandeClient lcc) {
		if(lcc==null) {
			return null;
		}
		LigneCommandeClientDto dto=new LigneCommandeClientDto();
		dto.setId(lcc.getId());
		dto.setIdEntreprise(lcc.getIdEntreprise());
		dto.setQuantite(lcc.getQuantite());
		dto.setArticleDto(ArticleDto.fromEntity(lcc.getArticle()));
		dto.setCommandeClientDto(CommandeClientDto.fromEntity(lcc.getCommandeClient()));
		return dto;
	}
	public static LigneCommandeClient toEntity(LigneCommandeClientDto dto) {
		if(dto==null) {
			return null;
		}
		LigneCommandeClient lcc=new LigneCommandeClient();
		lcc.setId(dto.getId());
		lcc.setIdEntreprise(dto.getIdEntreprise());
		lcc.setQuantite(dto.getQuantite());
		lcc.setArticle(ArticleDto.toEntity(dto.getArticleDto()));
		lcc.setCommandeClient(CommandeClientDto.toEntity(dto.getCommandeClientDto()));
		return lcc;
	}
	
}
