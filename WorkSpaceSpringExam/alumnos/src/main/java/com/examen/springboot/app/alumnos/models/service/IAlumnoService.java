package com.examen.springboot.app.alumnos.models.service;

import java.util.List;

import com.examen.springboot.app.alumnos.models.entity.Alumno;

public interface IAlumnoService {
	
	public List<Alumno> findAll();
	public Alumno findById(Long id);

}
