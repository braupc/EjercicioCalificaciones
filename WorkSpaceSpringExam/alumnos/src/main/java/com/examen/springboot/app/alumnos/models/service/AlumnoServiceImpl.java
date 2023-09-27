package com.examen.springboot.app.alumnos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examen.springboot.app.alumnos.models.entity.Alumno;
import com.examen.springboot.app.alumnos.models.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements IAlumnoService{
	
	@Autowired
	private AlumnoRepository alumnoRepo;

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findAll() {
		// TODO Auto-generated method stub
		return (List<Alumno>) alumnoRepo.findAll();
	}

	@Override
	public Alumno findById(Long id) {
		// TODO Auto-generated method stub
		return alumnoRepo.findById(id).orElse(null);
	}

}
