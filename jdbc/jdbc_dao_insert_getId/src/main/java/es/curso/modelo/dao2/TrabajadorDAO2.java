package es.curso.modelo.dao2;

import java.util.HashMap;
import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import es.curso.modelo.beans.Trabajador;

public class TrabajadorDAO2 extends NamedParameterJdbcTemplate implements ITrabajadorDAO2 {

	public TrabajadorDAO2(DataSource dataSource) {
		super(dataSource);
	}

	@Override
	public int insert(Trabajador t) {
		String sql;
		int n = 0;

		try {
			sql = "insert into trabajadores(id,nombre,departamento) values(:id,:nombre,:departamento)";

			HashMap<String, Object> parametros = new HashMap<String, Object>();
			parametros.put("id", t.getId());
			parametros.put("nombre", t.getNombre());
			parametros.put("departamento", t.getDepartamento());
			n = update(sql, parametros);
		} catch (Exception e) {
		}
		return n;
	}

}
