package com.curso.ejemplo;

import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.SqlParameter;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext contexto = new ClassPathXmlApplicationContext("contexto.xml");
		
		DataSource ds = contexto.getBean("ds", DataSource.class);
		
		String sql = "select * from clientes";
		SelectCliente selectCliente = new SelectCliente(ds, sql);
		List<Cliente> resultados = selectCliente.execute();
		
		System.out.println("Listado 1");
		for (Cliente c : resultados)
			System.out.println(c);
		
		
		// Consulta parametrizada:
		System.out.println("\n\nBusqueda de un cliente: ");
		sql = "select * from clientes where idcliente=?";
		selectCliente = new SelectCliente(ds, sql);		
		SqlParameter param = new SqlParameter(Types.VARCHAR, "id_cliente");
		selectCliente.declareParameter(param);
		selectCliente.compile();		
		Cliente cli = selectCliente.findObject("ALFKI");		
		System.out.println(cli);
			
		((ClassPathXmlApplicationContext) contexto).close();
	}
}
