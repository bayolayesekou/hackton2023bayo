package com.suivi_rendezvous.models;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable{
	
	@Id
	@GeneratedValue
	private Integer id;

	@CreatedDate
	@Column(name = "creationDate",nullable = false)
	@JsonIgnore
	private Instant creationDate;
	
	@LastModifiedDate
	@Column(name = "lastModifiedDate",nullable = false)
	@JsonIgnore
	private Instant lastModifiedDate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id=id;
	}
	public Instant getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Instant creationDate) {
		this.creationDate=creationDate;
	}
	public Instant getLastMoidfiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Instant lastModifiedDate) {
		this.lastModifiedDate=lastModifiedDate;
	}
}
