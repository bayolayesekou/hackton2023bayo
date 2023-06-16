package com.suivi_rendezvous.dto;

import com.suivi_rendezvous.models.Roles;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDto {
	
	private Integer id;
	private Integer idEntreprise;
	private String roleName;
	private UtilisateurDto utilisateurDto;
	
	public RolesDto() {}
	
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
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName=roleName;
	}
	public UtilisateurDto getUtilisateursDto() {
		return utilisateurDto;
	}
	public void setUtiisateursDto(UtilisateurDto utilisateurDto) {
		this.utilisateurDto=utilisateurDto;
	}
	//******************Les methodes mappings*******************//
	public static RolesDto fromEntity(Roles r) {
		if(r==null) {
			return null;
		}
		RolesDto dto=new RolesDto();
		dto.setId(r.getId());
		dto.setIdEntreprise(r.getIdEntreprise());
		dto.setRoleName(r.getRoleName());
		dto.setUtiisateursDto(UtilisateurDto.fromEntity(r.getUtilisateur()));
		return dto;
	}
	public static Roles toEntity(RolesDto dto) {
		if(dto==null) {
			return null;
		}
		Roles r=new Roles();
		r.setId(dto.getId());
		r.setRoleName(dto.getRoleName());
		r.setUtilisateur(UtilisateurDto.toEntity(dto.getUtilisateursDto()));
		return r;
		
	}
}
