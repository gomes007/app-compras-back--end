package com.example.cursomc.dto;

import java.io.Serializable;

import com.example.cursomc.domain.Categoria;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;


public class CategoriaDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@NotEmpty(message = "campo obrigatorio")
	@Length(min=2, max=80, message = "minimo 2 maximo 80")
	private String nome;
	
	
	public CategoriaDTO() {
		
	}
	
	
	public CategoriaDTO(Categoria obj) {
		
		id = obj.getId();
		nome = obj.getNome();
		
	}
	
	
	
	
	
	
	
	
	


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
	
	

}
