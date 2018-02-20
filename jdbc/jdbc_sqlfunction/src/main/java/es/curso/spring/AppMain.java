package es.curso.spring;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.object.SqlFunction;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext contexto = new ClassPathXmlApplicationContext("contexto.xml");
		
		DataSource ds = contexto.getBean("ds", DataSource.class);
		
		String sql = "select 1+1 from dual";
		SqlFunction<?> f = new SqlFunction<Object>(ds, sql);
		System.out.println(f.runGeneric());
		
		sql = "select calcularPedido2(10248)";
		f = new SqlFunction<Object>(ds, sql);
		System.out.println(f.runGeneric());
		
		((ClassPathXmlApplicationContext) contexto).close();
	}
}
