package es.curso.sh4.configuracion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "es.curso.sh4")
public class AppConfig {
	// Clase vacía …
}

// Siempre indicar el paquete raíz para poder levantar
//todas las clases anotadas.

