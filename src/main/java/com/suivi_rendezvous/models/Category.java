package com.suivi_rendezvous.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "category")
public class Category extends AbstractEntity{
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "designation")
	private String designation;
	private Integer idEntreprise;
	
	@OneToMany(mappedBy = "category")
	private List<Article> lisetArticles;
	
	//************************Getter and Setter***********************//
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code=code;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	public Integer getIdEntreprise() {
		return idEntreprise;
	}
	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise=idEntreprise;
	}
	public List<Article> getListeArticles(){
		return lisetArticles;
	}
	public void setListeArticles(List<Article> listeArticle) {
		this.lisetArticles=listeArticle;
	}
	
	

}
