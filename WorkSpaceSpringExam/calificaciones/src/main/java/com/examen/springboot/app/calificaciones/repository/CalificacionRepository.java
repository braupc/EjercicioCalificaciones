package com.examen.springboot.app.calificaciones.repository;

import org.springframework.data.repository.CrudRepository;

import com.examen.springboot.app.calificaciones.models.Calificacion;


public interface CalificacionRepository extends CrudRepository<Calificacion, Long>{
	
	Calificacion findBymatricula(Long id);

}
