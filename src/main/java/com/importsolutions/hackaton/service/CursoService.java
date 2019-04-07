package com.importsolutions.hackaton.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.importsolutions.hackaton.model.Curso;
import com.importsolutions.hackaton.repository.CursoRepository;

@Service
public class CursoService {
	
	@Autowired
	private CursoRepository repository;
	
	public Curso create(Curso c) {
		return repository.save(c);
	}
	
	public Curso update(Curso c) {
		return repository.save(c);
	}
	
	public Curso findById(String id) {
		return repository.findById(id).get();
	}
	
	public List<Curso> getAll() {
		return repository.findAll();
	}
	
	public void  delete(Curso c) {
		 repository.delete(c);
	}

}
