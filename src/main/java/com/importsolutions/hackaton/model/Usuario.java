package com.importsolutions.hackaton.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "usuario")
@Data
public class Usuario {
	
	@Id
	private String id;
	
	private String nome_funcionario;
	
	private String matricula;
	
	private String cargo;
	
	private String perfil;
	
	
}
