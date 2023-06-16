package com.suivi_rendezvous.dto;

import java.time.Instant;
import java.util.List;

import com.suivi_rendezvous.models.Utilisateur;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UtilisateurDto {
	
	private Integer id;
	private String nom;
	private String prenom;
	private String email;
	private Instant dateDeNaissance;
	private String motDePasse;
	private AdresseDto adresseDto;
	private String photo;
	private EntrepriseDto entrepriseDto;
	private List<RolesDto> listeRoles;
	
	public UtilisateurDto() {}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Instant getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(Instant dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public AdresseDto getAdresseDto() {
		return adresseDto;
	}
	public void setAdresseDto(AdresseDto adresseDto) {
		this.adresseDto = adresseDto;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public EntrepriseDto getEntrepriseDto() {
		return entrepriseDto;
	}
	public void setEntrepriseDto(EntrepriseDto entrepriseDto) {
		this.entrepriseDto = entrepriseDto;
	}
	public List<RolesDto> getRoles() {
		return listeRoles;
	}
	public void setRoles(List<RolesDto> listeRoles) {
		this.listeRoles = listeRoles;
	}
	
	//*****************************Les methodes mappings***********************//
	public static UtilisateurDto fromEntity(Utilisateur u) {
		if(u==null) {
			return null;
		}
		UtilisateurDto dto=new UtilisateurDto();
		dto.setId(u.getId());
		dto.setNom(dto.getNom());
		dto.setPrenom(u.getPrenom());
		dto.setEmail(u.getEmail());
		dto.setDateDeNaissance(u.getDateNaissance());
		dto.setPhoto(u.getPhoto());
		dto.setAdresseDto(AdresseDto.fromEntity(u.getAdresse()));
		dto.setEntrepriseDto(EntrepriseDto.fromEntity(u.getEntriprise()));
		return dto;
	}
	public static Utilisateur toEntity(UtilisateurDto dto) {
		if(dto==null) {
			return null;
		}
		Utilisateur u=new Utilisateur();
		u.setId(dto.getId());
		u.setNom(dto.getNom());
		u.setPrenom(dto.getPrenom());
		u.setEmail(dto.getEmail());
		u.setDateNaissance(dto.getDateDeNaissance());
		u.setPhoto(dto.getPhoto());
		u.setAdresse(AdresseDto.toEntity(dto.getAdresseDto()));
		u.setEntreprise(EntrepriseDto.toEntity(dto.getEntrepriseDto()));
		return u;
	}
	
	
}
