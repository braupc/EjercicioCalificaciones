package com.examen.springboot.app.calificaciones.models;

public class CalificacionAlumno {
	
	private Double calificacion;
	public CalificacionAlumno(Double calificacion, Alumno alumno) {
		super();
		this.calificacion = calificacion;
		this.alumno = alumno;
	}
	private Alumno alumno;
	
	public Double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

}
