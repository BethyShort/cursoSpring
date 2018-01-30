package es.curso;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Principal {
	static ApplicationContext  contexto;
	
	public static void main(String[] args) {

		
		contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Recuperar la plantilla
		JdbcTemplate jdbc= (JdbcTemplate) contexto.getBean("jdbcTemplate");

		
//		consultarNumeroClientes(jdbc);
//		consultarClientesXPais(jdbc);
//		consultarClientesXId(jdbc);
//		consultarEmpleados(jdbc);
//		consultarEmpleadoXDAO();
		findAllEmpleado();

		Empleado emp=consultarEmpleado(jdbc);
		Empleado emp2=new Empleado();
		
		emp2.setNombre("Julio Medem");
		emp2.setId(emp.getId());
		emp2.setCargo(emp.getCargo());
		actualizarEmpleado(emp2);

//		int numeroEmpleados=consultarNumeroEmpleados(jdbc);
//		numeroEmpleados++;
//		emp2.setId(numeroEmpleados);
//		emp2.setNombre("Nombre inserción");
//		emp2.setCargo("Cargo inserción");
//		insertarEmpleado(emp2);
		
		borrarEmpleado(10);
		
		
		((ClassPathXmlApplicationContext)contexto).close();
	}
	
	/**
	 * Recupera el número de clientes de la tabla clientes
	 * @param jdbc
	 */
	private static void consultarNumeroClientes(JdbcTemplate jdbc) {
		//select para recuperar el número de clientes
		String sql="select count(*) from clientes";
		int n=jdbc.queryForObject(sql, Integer.class);
		System.out.println("El número de clientes es: "+ n);
	}
	
	private static int consultarNumeroEmpleados(JdbcTemplate jdbc) {
		//select para recuperar el número de clientes
		String sql="select count(*) from empleados";
		int n=jdbc.queryForObject(sql, Integer.class);
		System.out.println("El número de empleados es: "+ n);
		return n;
	}


	/**
	 * Recupera todos los clientes de un país
	 * @param jdbc
	 */
	private static void consultarClientesXPais(JdbcTemplate jdbc) {
		//select para recuperar el número de clientes alemanes
		String sql="select count(*) from clientes where pais=?";
		int n=jdbc.queryForObject(sql, new Object[]{"Alemania"},Integer.class);
		System.out.println("El número de clientes alemanes es: "+ n);
	}
	
	/**
	 * Recupera un cliente por ID
	 * @param jdbc
	 */
	private static void consultarClientesXId(JdbcTemplate jdbc) {
		//recuperar un cliente por el nombre
		String sql="select nombre from clientes where idcliente=?";
		String datos=jdbc.queryForObject(sql, new Object[]{"A1234"},String.class);
		System.out.println("El nombre del cliente A1234 es: "+ datos);
	}

	/**
	 * Consulta un empleado por ID
	 * @param jdbc
	 */
	private static Empleado consultarEmpleado(JdbcTemplate jdbc) {
		//recuperar un cliente por el nombre
		String sql="select * from empleados where id=?";
		Empleado emp=jdbc.queryForObject(sql, new Object[]{"1"}, 
				new RowMapper<Empleado>() {
			
			public Empleado mapRow(ResultSet r, int n)throws SQLException{
				Empleado e = new Empleado();
				e.setId(r.getInt("id"));
				e.setCargo(r.getString("cargo"));
				e.setNombre(r.getString("nombre"));
				return e;
			}});
		System.out.println("Los datos del empleado recuperado son: "+ emp.toString());
		return emp;
	}

	/**
	 * Consulta todos los empleados
	 * @param jdbc
	 */
	private static void consultarEmpleados(JdbcTemplate jdbc) {
		//recuperar un cliente por el nombre
		String sql="select * from empleados";
		List<Empleado> empleados=jdbc.query(sql,  
				new RowMapper<Empleado>() {
			
			public Empleado mapRow(ResultSet r, int n)throws SQLException{
				Empleado e = new Empleado();
				e.setId(r.getInt("id"));
				e.setCargo(r.getString("cargo"));
				e.setNombre(r.getString("nombre"));
				return e;
			}});
		
		escribirListaEmpleados(empleados);
	}

	private static void consultarEmpleadoXDAO() {
		IEmpleadoDAO dao=(IEmpleadoDAO)contexto.getBean("dao");
		Empleado empleado=dao.read(1);
		System.out.println(empleado);
	}
	
	private static void findAllEmpleado() {
		IEmpleadoDAO dao=(IEmpleadoDAO)contexto.getBean("dao");
		List<Empleado> empleados=dao.selectAll();
		escribirListaEmpleados(empleados);
	}

	private static void escribirListaEmpleados(List<Empleado> list) {
		for (Empleado e: list) {
			System.out.println("Los datos del empleado recuperado son: "+ e.toString());
		}
	}
	
	private static void actualizarEmpleado(Empleado emp) {
		IEmpleadoDAO dao=(IEmpleadoDAO)contexto.getBean("dao");
		dao.updte(emp);
	}
	
	private static void insertarEmpleado(Empleado emp) {
		IEmpleadoDAO dao=(IEmpleadoDAO)contexto.getBean("dao");
		dao.create(emp);
	}
	
	private static void borrarEmpleado(int idEmpleado) {
		IEmpleadoDAO dao=(IEmpleadoDAO)contexto.getBean("dao");
		dao.delete(idEmpleado);
	}


}

