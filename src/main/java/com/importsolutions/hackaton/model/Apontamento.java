package com.importsolutions.hackaton.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "apontamento")
@Data
public class Apontamento {
	
	@Id
	private String id;
	
	private String nome_funcionario;
	
	private String matricula;
	
	private String cargo;
	
	private LocalDateTime horario_entrada;
	
	private LocalDateTime horario_saida;
	
}
