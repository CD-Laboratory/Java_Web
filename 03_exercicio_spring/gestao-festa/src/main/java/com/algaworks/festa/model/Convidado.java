package com.algaworks.festa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Convidado implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	private Integer quantidadeAcompanhante;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQuantidadeAcompanhante() {
		return quantidadeAcompanhante;
	}
	public void setQuantidadeAcompanhante(Integer quantidadeAcompanhante) {
		this.quantidadeAcompanhante = quantidadeAcompanhante;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
