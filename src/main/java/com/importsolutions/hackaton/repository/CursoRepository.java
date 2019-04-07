package com.importsolutions.hackaton.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.importsolutions.hackaton.model.Curso;

public interface CursoRepository extends MongoRepository<Curso, String> {

}
