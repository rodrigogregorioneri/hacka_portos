package com.importsolutions.hackaton.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ValueOption {

	private String parent;

	private String value;

	public ValueOption(String parent, String value) {
		this.parent = parent;
		this.value = value;
	}

	public ValueOption(String value) {
		super();
		this.value = value;
	}

}
