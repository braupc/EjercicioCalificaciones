package com.examen.springboot.app.calificaciones.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.examen.springboot.app.calificaciones.models.Alumno;
import com.examen.springboot.app.calificaciones.models.Calificacion;
import com.examen.springboot.app.calificaciones.models.CalificacionAlumno;
import com.examen.springboot.app.calificaciones.repository.CalificacionRepository;

@Service
public class CalificacionServiceImpl implements CalificacionService {

	@Autowired
	private RestTemplate clienteRest;
	
	@Autowired
	private CalificacionRepository calificacionRepo;
	
	@Override
	public List<CalificacionAlumno> findAll() {
		
		List<CalificacionAlumno> listaCalif = new ArrayList<CalificacionAlumno>();
		
		 List<Calificacion> calificaciones = (List<Calificacion>) calificacionRepo.findAll();
		 
		 calificaciones.forEach(calificacion -> {
			 
			 System.out.println("-----------  calificacion.getId() ---------- "+calificacion.getMatricula());
			 
			 Alumno alumno = clienteRest.getForObject("http://localhost:8001/detalle/"+calificacion.getMatricula(), Alumno.class);
			   
				CalificacionAlumno calif = new CalificacionAlumno(calificacion.getCalificacion(), alumno);
				
				listaCalif.add(calif);
			});
		
	
		
		
		
		return listaCalif;
		 
	}

	@Override
	public void registrarCalificacion(Calificacion calificacion) {
		// TODO Auto-generated method stub
		
		calificacionRepo.save(calificacion);

	}


	@Override
	public void eliminarCalificacion(Long matricula) {
		// TODO Auto-generated method stub
		calificacionRepo.deleteById(matricula);

	}

	@Override
	public Calificacion traeCalificacion(Long idAlumno) {
		return	calificacionRepo.findBymatricula(idAlumno);
		 	}



}
