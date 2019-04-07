package com.importsolutions.hackaton.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "questoes")
@Data
public class Questoes {
	
	@Id
	private String id;

}
