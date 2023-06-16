package com.suivi_rendezvous.dto;

import java.time.Instant;
import java.util.List;

import com.suivi_rendezvous.models.CommandeClient;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeClientDto {
	
	private Integer id;
	private String code;
	private Instant dateCommande;
	private ClientDto clientDto;
	private List<LigneCommandeClientDto> listeCommandeClients;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id=id;
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
	public ClientDto getClientDto() {
		return clientDto;
	}
	public void setClientDto(ClientDto clientDto) {
		this.clientDto=clientDto;
	}
	public List<LigneCommandeClientDto> getListeLigneCommandeClient(){
		return listeCommandeClients;
	}
	public void setListeLigneCommande(List<LigneCommandeClientDto> listeCommandeClients) {
		this.listeCommandeClients=listeCommandeClients;
	}
	//**************************Les methodes mapping*****************//
	public static CommandeClientDto fromEntity(CommandeClient cmdClt) {
		if(cmdClt==null) {
			return null;
		}
		CommandeClientDto dto=new CommandeClientDto();
		dto.setId(cmdClt.getId());
		dto.setCode(cmdClt.getCode());
		dto.setDateCommande(cmdClt.getDateCommande());
		dto.setClientDto(ClientDto.fromEntity(cmdClt.getClient()));
		return dto;
	}
	
	public static CommandeClient toEntity(CommandeClientDto dto) {
		if(dto==null) {
			return null;
		}
		CommandeClient cmdClt=new CommandeClient();
		cmdClt.setId(dto.getId());
		cmdClt.setCode(dto.getCode());
		cmdClt.setDateCommande(dto.getDateCommande());
		cmdClt.setClient(ClientDto.toEntity(dto.getClientDto()));
		return cmdClt;
	}

}
