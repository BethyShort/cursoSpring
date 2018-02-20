package modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import modelo.beans.Trabajador;

public class TrabajadorDAO extends JdbcDaoSupport  implements ITrabajadorDAO {


	@Override
	public boolean ingresarEmpleado(Trabajador t) {
		// TODO Auto-generated method stub
		// ingresamos 1 trabajador con el metodo update de plantilla
		try {
			getJdbcTemplate().update("INSERT INTO trabajadores(id,nombre,departamento) VALUES(?,?,?)", 
								  t.getId(), t.getNombre(), t.getDepartamento());
			return true;
		} catch (DataAccessException e) {
			return false;
		}
	}

	@Override
	public List<Trabajador> listarEmpleados() {
		// TODO Auto-generated method stub
		// realizamos la consulta de de trabajadores
		return getJdbcTemplate().query("SELECT * FROM trabajadores" +
				" ORDER BY numero_trabajador DESC LIMIT 10",
		// se mapea el resultado de la consulta para que query
				// retorne una lista con objetos de tipo Trabajador
				new RowMapper<Trabajador>() {
					public Trabajador mapRow(ResultSet rs, int rowNum)throws SQLException {
						Trabajador t = new Trabajador();
						t.setId(rs.getString("id"));
						t.setNombre(rs.getString("nombre"));
						t.setDepartamento(rs.getString("departamento"));
						return t;
					}
				});
	}

	@Override
	public boolean eliminarEmpleado(String id) {
		// TODO Auto-generated method stub
		try {
			getJdbcTemplate().update("delete from trabajadores where id = ?", id); 
								  
			return true;
		} catch (DataAccessException e) {
			return false;
		}
	}

	@Override
	public boolean actualizarEmpleado(Trabajador t) {
		// TODO Auto-generated method stub
		try {
			getJdbcTemplate().update("update trabajadores set nombre = ?,departamento=? where id=?", 
								  t.getNombre(), t.getDepartamento(), t.getId());
			return true;
		} catch (DataAccessException e) {
			return false;
		}
	}

	@Override
	public int numeroTrabajadores() {
		// TODO Auto-generated method stub
		return getJdbcTemplate().queryForObject("select count(*) from trabajadores", Integer.class);
	}

	@Override
	public int numeroTrabajadoresPorDpo(String departamento) {
		// TODO Auto-generated method stub
		Object parametros[] = new Object[]{departamento};
		
		return getJdbcTemplate().queryForObject("select count(*) from trabajadores where departamento = ?", parametros, Integer.class);
	}

	@Override
	public Trabajador getTrabajador(String id) {
		// TODO Auto-generated method stub
		String sql = "select id, nombre, departamento from Trabajadores where id = ?";
		Object parametros[] = new Object[]{id};
		return getJdbcTemplate().queryForObject(sql, parametros, new RowMapper<Trabajador>(){

			@Override
			public Trabajador mapRow(ResultSet rst, int arg1) throws SQLException {
				/// Creamos un trabajador y lo devolvemos:
				Trabajador t = new Trabajador();
				
				t.setId(rst.getString("id"));
				t.setNombre(rst.getString("nombre"));
				t.setDepartamento(rst.getString("departamento"));
				return t;
			}
			
		});
	}

}
