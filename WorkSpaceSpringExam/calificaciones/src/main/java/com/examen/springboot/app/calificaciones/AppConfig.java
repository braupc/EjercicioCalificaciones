package com.examen.springboot.app.calificaciones;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	@Bean("clienteRest") 
	RestTemplate registrarRestTemplate() {
		
		return new RestTemplate();
	}
	
	
}
