package com.suivi_rendezvous.dto;

import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.suivi_rendezvous.models.CommandeFournisseur;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class CommandeFournisseurDto {
	
	private Integer id;
	private String code;
	private Instant dateCommande;
	private FournisseurDto fournisseurDto;
	@JsonIgnore
	private List<LigneCommandeFournisseurDto> listeCommandeFournisseurs;
	private Integer idEntreprise;
	
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
	public Instant getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(Instant dateCommande) {
		this.dateCommande=dateCommande;
	}
	public FournisseurDto getFournisseurDto() {
		return fournisseurDto;
	}
	public void setFournisseurDto(FournisseurDto fournisseurDto) {
		this.fournisseurDto=fournisseurDto;
	}
	public List<LigneCommandeFournisseurDto> getListeCommandeFournisseurs(){
		return listeCommandeFournisseurs;
	}
	public void setListeCommandeFournisseurs(List<LigneCommandeFournisseurDto> listeCommandeFournisseurs) {
		this.listeCommandeFournisseurs=listeCommandeFournisseurs;
	}
	
	//*********************Les methodes mapping********************//
	public static CommandeFournisseurDto fromEntity(CommandeFournisseur cf) {
		if(cf==null) {
			return null;
		}
		CommandeFournisseurDto dto=new CommandeFournisseurDto();
		dto.setId(cf.getId());
		dto.setIdEntreprise(cf.getIdEntreprise());
		dto.setCode(cf.getCode());
		dto.setDateCommande(cf.getDateCommande());
		dto.setFournisseurDto(FournisseurDto.fromEntity(cf.getFournisseur()));
		return dto;
	}
	public static CommandeFournisseur toEntity(CommandeFournisseurDto dto) {
		if(dto==null) {
			return null;
		}
		CommandeFournisseur cf=new CommandeFournisseur();
		cf.setId(dto.getId());
		cf.setIdEntreprise(cf.getIdEntreprise());
		cf.setCode(dto.getCode());
		cf.setDateCommande(dto.getDateCommande());
		cf.setFournisseur(FournisseurDto.toEntity(dto.getFournisseurDto()));
		return cf;
	}
	
	


}
