package com.suivi_rendezvous.dto;

import java.time.Instant;
import java.util.List;

import com.suivi_rendezvous.models.Ventes;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VentesDto {

	private Integer id;
	private Integer idEntreprise;
	private String code;
	private Instant dateVente;
	private String commentaire;
	private List<LigneVenteDto> ligneVentes;
	
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
	public List<LigneVenteDto> getLigneVentes(){
		return ligneVentes;
	}
	public void setLigneVentes(List<LigneVenteDto> ligneVentes) {
		this.ligneVentes=ligneVentes;
	}
	
	//**********************Les methodes mapping********************//
	public static VentesDto fromEntity(Ventes v) {
		if(v==null) {
			return null;
		}
		VentesDto dto=new VentesDto();
		dto.setId(v.getId());
		dto.setId(v.getIdEntreprise());
		dto.setCode(v.getCode());
		dto.setDateVente(v.getDateVente());
		dto.setCommentaire(v.getCommentaire());
		return dto;
	}
	public static Ventes toEntity(VentesDto dto) {
		if(dto==null) {
			return null;
		}
		Ventes v=new Ventes();
		v.setId(dto.getId());
		v.setIdEntreprise(dto.getIdEntreprise());
		v.setCode(dto.getCode());
		v.setDateVente(dto.getDateVente());
		v.setCommentaire(dto.getCommentaire());
		return v;
	}

}
