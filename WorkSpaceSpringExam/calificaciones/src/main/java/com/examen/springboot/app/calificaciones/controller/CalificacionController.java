package com.examen.springboot.app.calificaciones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examen.springboot.app.calificaciones.models.Calificacion;
import com.examen.springboot.app.calificaciones.models.CalificacionAlumno;
import com.examen.springboot.app.calificaciones.service.CalificacionService;

@RestController
public class CalificacionController {
	
	@Autowired
	private CalificacionService calificacionService;
	
	@GetMapping("/listar")
	public List<CalificacionAlumno> listar(){
		return calificacionService.findAll();
	}
	
	@PostMapping("/registrarCalificacion")
	public void registrarCalificacion(@RequestParam Long matricula, @RequestParam Double calificacion){
		
	Calificacion calif = new Calificacion(matricula, calificacion);
	 calificacionService.registrarCalificacion(calif);
	 
	}
	
	@PutMapping("/editarCalificacion")
	public void actualizararCalificacion(@RequestParam Long matricula, @RequestParam Double calificacion){
		
	Calificacion calif = new Calificacion(matricula, calificacion);
	 calificacionService.registrarCalificacion(calif);
	 
	}

	@DeleteMapping("/eliminarCalificacion/{matricula}")
	public String eliminarCalificacion(@PathVariable("matricula") Long matricula){
		
	
	 calificacionService.eliminarCalificacion(matricula);
	 
	 return "eliminado!";
	 
	}
}
