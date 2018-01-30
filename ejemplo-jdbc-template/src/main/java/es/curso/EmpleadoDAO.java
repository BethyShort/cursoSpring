package es.curso;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class EmpleadoDAO extends JdbcDaoSupport implements IEmpleadoDAO, RowMapper<Empleado>{

	/**
	 * Este método obliga a implementarlo la interfaz RowMapper. Se trata de una clase parametrizada
	 */
	public Empleado mapRow(ResultSet r, int arg1) throws SQLException {
		Empleado e = new Empleado();
		e.setId(r.getInt("id"));
		e.setCargo(r.getString("cargo"));
		e.setNombre(r.getString("nombre"));
		return e;
	}

	public void create(Empleado e) {
		String sql ="insert into empleados (id, nombre, cargo) values (?,?,?)";
		this.getJdbcTemplate().update(sql, new Object[] {e.getId(),e.getNombre(),e.getCargo()});
	}

	public Empleado read(int id) {
		//recuperar un cliente por el nombre
		String sql="select * from empleados where id=?";
		return this.getJdbcTemplate().queryForObject(sql, new Object[]{id},this); 
	}

	public void updte(Empleado e) {
		String sql="update empleados set nombre=?, cargo=? where id=?";
		this.getJdbcTemplate().update(sql, new Object[] {e.getNombre(),e.getCargo(),e.getId()});
	}

	public void delete(int id) {
		String sql="delete from empleados where id=?";
		this.getJdbcTemplate().update(sql, new Object[] {id});
	}

	public List<Empleado> selectAll() {
		String sql ="select * from empleados";
		return this.getJdbcTemplate().query(sql, this);
	}

}
