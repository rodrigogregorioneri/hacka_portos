package com.importsolutions.hackaton.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "curso")
@Data
public class Curso {
	
	@Id
	private String id;
	
	private String nome_curso;
	
	private String descricao_curso;
	
	private String usuario_responsavel;
	
	private List<Modulo> modulo;
	


}
