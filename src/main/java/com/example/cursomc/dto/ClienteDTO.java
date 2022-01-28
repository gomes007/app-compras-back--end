package com.example.cursomc.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;

import com.example.cursomc.domain.Cliente;
import com.example.cursomc.services.validation.ClienteUpdate;


@ClienteUpdate
public class ClienteDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	private String nome;
	
	@Email
	private String email;
	
	
	
	
	public ClienteDTO() {
		super();
	}




	public ClienteDTO(Cliente obj) {
		
		id = obj.getId();
		nome = obj.getNome();
		email = obj.getEmail();
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




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	
	
	
	
	
	

}
