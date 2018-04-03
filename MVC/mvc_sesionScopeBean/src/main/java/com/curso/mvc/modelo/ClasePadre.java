package com.curso.mvc.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class ClasePadre {

    @Autowired
    private ClaseHija claseHija;
    
	private String idSesion;    

    public String toString() {
        StringBuilder builder=new StringBuilder();
        builder.append("\n*****************************************************************");
        builder.append("\n******************  DATOS DEL BEAN DE SESSION  ******************");
        builder.append("\n*****************************************************************");
        builder.append("\nID SESIÓN                    :"+ idSesion);
        builder.append("\nID CLASE PADRE               :"+this.hashCode());
        System.out.println(builder);        
        claseHija.toString();
        builder=new StringBuilder();
        builder.append("*****************************************************************");
        builder.append("\n\n\n");
        System.out.println(builder);        
        return builder.toString();
    }

	public ClaseHija getClaseHija() {
		return claseHija;
	}

	public void setClaseHija(ClaseHija claseHija) {
		this.claseHija = claseHija;
	}
	
    public String getIdSesion() {
		return idSesion;
	}

	public void setIdSesion(String idSesion) {
		this.idSesion = idSesion;
	}

}

