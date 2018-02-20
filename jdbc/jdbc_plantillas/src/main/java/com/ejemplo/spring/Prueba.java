package com.ejemplo.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import modelo.beans.Trabajador;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class Prueba implements RowMapper<Trabajador >{

	private void pruebaPlantilla(){
		ApplicationContext contexto = new ClassPathXmlApplicationContext("contexto.xml");
		JdbcTemplate plantilla;
		Trabajador t;
		String sql;
		
		// Recuperar la plantilla del contexto:
		plantilla = (JdbcTemplate) contexto.getBean("plantilla");
		
		
		// RECUPERAR EL N�MERO DE FILAS DE UNA TABLA:
		int numero = plantilla.queryForObject("select count(*) from trabajadores", Integer.class);
		System.out.println(numero + " trabajadores");
		
		// RECUPERAR EL NOMBRE DEL TRABAJADOR:
		String nombre;
		Object [] params = {new Long(100)};
		sql = "select nombre from trabajadores where numero_trabajador = ?";
		nombre = plantilla.queryForObject(sql, params, String.class);
		System.out.println("Nombre del trabajador: " + nombre);
				
		// RECUPERAR EL TRABAJADOR
		sql = "select id, nombre, departamento from trabajadores where numero_trabajador = ?";		
		t = (Trabajador) plantilla.queryForObject(sql, params, this);
		System.out.println("Datos del trabajador: " + t);
		
		// RECUPERAR UNA COLECCION DE TRABAJADORES:
		List<Trabajador> trabajadores;
		sql = "select id, nombre, departamento from trabajadores";
		trabajadores = plantilla.query(sql, this);
		
		System.out.println("Listado de trabajadores");
		for (Trabajador tr : trabajadores)
			System.out.println(tr);	
		
		// Ejemplo con IN: Los nombres de los trabajadores que pertenecen a un departamento de la lista:
		List<String> l = Arrays.asList(new String[]{"Informatica","Contabilidad"});
		Map<String, List<String>> param = Collections.singletonMap("param",l);        
		NamedParameterJdbcTemplate  namedParameterJdbcTemplate = new  NamedParameterJdbcTemplate(plantilla.getDataSource());
		sql = "SELECT nombre FROM trabajadores WHERE departamento in (:param)";
		List<String> lista = namedParameterJdbcTemplate.queryForList(sql, param, String.class);
		System.out.println(lista);
		
		// Ejemplo con IN: Los trabajadores que pertenecen a un departamento de la lista:
		sql = "SELECT * FROM trabajadores WHERE departamento in (:param)";				
		List<Trabajador> lista2 = namedParameterJdbcTemplate.query(sql, param, this);
		System.out.println(lista2);

		((ClassPathXmlApplicationContext) contexto).close();
	}
	
	public static void main(String[] args) {
		
		Prueba prueba = new Prueba();
		prueba.pruebaPlantilla();
		
	}

	@Override
	public Trabajador mapRow(ResultSet rs, int arg1) throws SQLException {
		Trabajador trabajador = new Trabajador();
		
		trabajador.setId(rs.getString("id"));
		trabajador.setNombre(rs.getString("nombre"));
		trabajador.setDepartamento(rs.getString("departamento"));
		
		return trabajador;
	}

}
