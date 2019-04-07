package com.importsolutions.hackaton.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "conteudo")
@Data
public class Modulo {
	
	@Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", columnDefinition = "BINARY(16)")
	
	private String nome_modulo;
	
	private String conteudo;
	
	private String titulo;
	
	private Form formulario;

}
