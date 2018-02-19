package es.curso.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name="miBean")
	public IMensaje getMensaje(){
		return new Mensaje();
	}
	
}
