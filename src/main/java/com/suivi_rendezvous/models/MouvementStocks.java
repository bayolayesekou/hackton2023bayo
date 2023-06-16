package com.suivi_rendezvous.models;

import java.math.BigDecimal;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "mouvement_stock")
public class MouvementStocks extends AbstractEntity{
	
	@Column(name = "datemvt")
	private Instant dateMvt;
	
	@Column(name = "quantite")
	private BigDecimal quantite;
	@Column(name = "id_entreprise")
	private Integer idEntreprise;
	
	@ManyToOne
	@JoinColumn(name = "idarticle")
	private Article article;
	
	@Column(name = "typemvt")
	private TypeMouvementStocks typeMouvementStocks;
	
	public Instant getDateMvt() {
		return dateMvt;
	}
	public void setDateMvt(Instant datemvt) {
		this.dateMvt=datemvt;
	}
	public BigDecimal getQuantite() {
		return quantite;
	}
	public void setQuantite(BigDecimal quantite) {
		this.quantite=quantite;
	}
	public Integer getIdEntreprise() {
		return idEntreprise;
	}
	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise=idEntreprise;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article=article;
	}
	public TypeMouvementStocks getTypeMouvementStocks() {
		return typeMouvementStocks;
	}
	public void setTypeMouvementStocks(TypeMouvementStocks typeMouvementStocks) {
		this.typeMouvementStocks=typeMouvementStocks;
	}
	
	

}
