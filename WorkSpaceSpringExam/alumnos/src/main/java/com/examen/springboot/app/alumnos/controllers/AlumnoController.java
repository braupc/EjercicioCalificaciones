package com.examen.springboot.app.alumnos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.examen.springboot.app.alumnos.models.entity.Alumno;
import com.examen.springboot.app.alumnos.models.service.IAlumnoService;

@RestController
public class AlumnoController {
	
	@Autowired
	private IAlumnoService alumnoService;
	
	@GetMapping("/listar")
	public List<Alumno> listar(){
		
		return alumnoService.findAll();
		
	}
	
	@GetMapping("/detalle/{id}")
	public Alumno detalle(@PathVariable Long id){
		
		return alumnoService.findById(id);
		
	}

}
