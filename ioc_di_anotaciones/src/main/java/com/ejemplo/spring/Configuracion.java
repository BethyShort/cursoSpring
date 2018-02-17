package com.ejemplo.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("java")
public class Configuracion {
	
	@Value("#{systemProperties['java.home']}")
	private String javaHome;
	
	@Value("#{systemProperties['java.version']}")
	private String version;

	public String getJavaHome() {
		return javaHome;
	}

	public void setJavaHome(String javaHome) {
		this.javaHome = javaHome;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	

}
