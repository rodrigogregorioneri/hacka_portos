package com.importsolutions.hackaton.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FieldOptions {

	private String label;

	private Boolean required;

	private Boolean highlighted;

	private Boolean editable;

	private Boolean defaultValue;

	private List<ValueOption> valueOptions;

	private String parent;

	public void addValueOption(ValueOption valueOption) {
		if (valueOptions == null) {
			valueOptions = new ArrayList<>();
		}

		valueOptions.add(valueOption);
	}

}