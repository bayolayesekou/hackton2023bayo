package com.suivi_rendezvous.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.suivi_rendezvous.models.Category;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryDto {
	
	private Integer id;
	private Integer idEntreprise;
	private String code;
	private String designation;
	@JsonIgnore
	private List<ArticleDto> listeArticles;
	
	public CategoryDto() {}
	
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	public List<ArticleDto> getListeArticles(){
		return listeArticles;
	}
	public void setListeArticles(List<ArticleDto> listeArticles) {
		this.listeArticles=listeArticles;
	}
	
	// ****************************Les methodes mapping***********************//
	public static CategoryDto fromEntity(Category cat) {
		if(cat==null) {
			return null;
		}
		CategoryDto dto=new CategoryDto();
		dto.setIdEntreprise(cat.getIdEntreprise());
		dto.setId(cat.getId());
		dto.setCode(cat.getCode());
		dto.setDesignation(cat.getDesignation());
		return dto;
	}
	public static Category toEntity(CategoryDto dto) {
		if(dto==null) {
			return null;
		}
		Category cat=new Category();
		cat.setId(dto.getId());
		cat.setIdEntreprise(dto.getIdEntreprise());
		cat.setCode(dto.getCode());
		cat.setDesignation(dto.getDesignation());
		return cat;
	}
}

