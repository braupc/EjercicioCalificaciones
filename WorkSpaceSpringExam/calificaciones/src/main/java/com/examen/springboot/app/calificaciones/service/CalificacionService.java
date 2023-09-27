package com.examen.springboot.app.calificaciones.service;

import java.util.List;

import com.examen.springboot.app.calificaciones.models.Calificacion;
import com.examen.springboot.app.calificaciones.models.CalificacionAlumno;

public interface CalificacionService {

	public List<CalificacionAlumno> findAll();
	public void registrarCalificacion(Calificacion calificacion);
	public void eliminarCalificacion(Long idAlumno);
	public Calificacion traeCalificacion(Long idAlumno);
	
	
}
