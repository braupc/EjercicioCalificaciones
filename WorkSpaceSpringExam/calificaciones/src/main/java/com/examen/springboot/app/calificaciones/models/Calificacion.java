package com.examen.springboot.app.calificaciones.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "calificaciones")
public class Calificacion {

	@Id
	private Long matricula;
	private Double calificacion;

	public Calificacion(Long matricula, Double calificacion) {

		super();
		this.matricula = matricula;
		this.calificacion = calificacion;
	}

	public Calificacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public Double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}

	

}
