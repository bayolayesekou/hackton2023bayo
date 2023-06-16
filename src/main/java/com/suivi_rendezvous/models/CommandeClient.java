package com.suivi_rendezvous.models;

import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "commandeclient")
public class CommandeClient extends AbstractEntity{
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "datecommande")
	private Instant dateCommande;
	@Column(name = "id_entreprise")
	private Integer idEntreprise;
	
	@ManyToOne
	@JoinColumn(name = "idclient")
	private Client client;
	
	@OneToMany(mappedBy = "commandeClient")
	private List<LigneCommandeClient> listeLigneCommandeClients;
	
	//*****************Getter and Setter******************************//
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
	public Integer getIdEntreprise() {
		return idEntreprise;
	}
	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise=idEntreprise;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client=client;
	}
	public List<LigneCommandeClient> getListeLigneCommandeClient(){
		return listeLigneCommandeClients;
	}
	public void setListeLigneCommandeClient(List<LigneCommandeClient> listeLigneCommande) {
		this.listeLigneCommandeClients=listeLigneCommande;
	}

}
