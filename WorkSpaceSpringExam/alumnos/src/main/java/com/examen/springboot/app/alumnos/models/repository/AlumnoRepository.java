package com.examen.springboot.app.alumnos.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.examen.springboot.app.alumnos.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long>{

}
