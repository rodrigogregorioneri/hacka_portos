package com.importsolutions.hackaton.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "prova")
@Data
public class Form {
	
	private List<Field> fields;

	public void addField(Field field) {
		if (fields == null) {
			fields = new ArrayList<>();
		}

		fields.add(field);
	}

}
