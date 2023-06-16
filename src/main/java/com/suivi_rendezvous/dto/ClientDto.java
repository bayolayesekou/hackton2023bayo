package com.suivi_rendezvous.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.suivi_rendezvous.models.Client;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientDto {
	
	private Integer id;
	private Integer idEntreprise;
	private String nom;
	private String prenom;
	private AdresseDto adresseDto;
	private String photo;
	private String mail;
	private String numTel;
	
	@JsonIgnore
	private List<CommandeClientDto> listeCommandeClients;
	
	public ClientDto() {}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id=id;
	}
	public Integer getIdEntreprise() {
		return idEntreprise;
	}
	public void setIdEntreprise(Integer idEntreprise){
		this.idEntreprise=idEntreprise;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public void setPrenom(String nom) {
		this.nom=nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenoom(String prenom) {
		this.prenom=prenom;
	}
	public AdresseDto getAdresseDto() {
		return adresseDto;
	}
	public void setAdresseDto(AdresseDto adresseDto) {
		this.adresseDto=adresseDto;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo=photo;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail=mail;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel=numTel;
	}
	public List<CommandeClientDto> getListeCommandeClient(){
		return listeCommandeClients;
	}
	public void setListeCommandeClient(List<CommandeClientDto> listeCommandeClient) {
		this.listeCommandeClients=listeCommandeClient;
	}
	//***********************Les methodes mapping*****************//
	public static ClientDto fromEntity(Client c) {
		if(c==null) {
			return null;
		}
		ClientDto dto=new ClientDto();
		dto.setId(c.getId());
		dto.setIdEntreprise(c.getIdEntreprise());
		dto.setNom(c.getNom());
		dto.setPrenom(c.getPrenom());
		dto.setAdresseDto(AdresseDto.fromEntity(c.getAdresse()));
		dto.setPhoto(c.getPhoto());
		dto.setMail(c.getMail());
		dto.setNumTel(c.getNumTel());
		return dto;
	}
	public static Client toEntity(ClientDto dto) {
		if(dto==null) {
			return null;
		}
		Client c=new Client();
		c.setId(dto.getId());
		c.setIdEntreprise(dto.getIdEntreprise());
		c.setNom(dto.getNom());
		c.setPrenom(dto.getPrenom());
		c.setAdresse(AdresseDto.toEntity(dto.getAdresseDto()));
		c.setPhoto(dto.getPhoto());
		c.setMail(dto.getMail());
		c.setNumTelt(dto.getNumTel());
		return c;
	}

	

}
