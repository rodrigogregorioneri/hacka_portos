package com.importsolutions.hackaton.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.importsolutions.hackaton.model.Curso;
import com.importsolutions.hackaton.service.CursoService;

@RestController
@RequestMapping("/v1/curso")
public class CursoController {
	
	@Autowired
	private CursoService service;
	
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Curso create(@RequestBody   Curso curso) {
		return service.create(curso);
	}
	
	
	@GetMapping
	public List<Curso> getAll(){
		return service.getAll();
	}
	
	@PutMapping
	public Curso update(@RequestBody   Curso curso){
		return service.update(curso);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable(name = "begindate", required = false) String id){
		Curso c = service.findById(id);
	    service.delete(c);
	}

}
