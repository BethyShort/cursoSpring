package es.curso.modelo.dao3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import es.curso.modelo.beans.Trabajador;

public class TrabajadorDAO3 extends JdbcDaoSupport implements ITrabajadorDAO3 {
		
	@Override
	public int insert(final Trabajador t) {
		final String sql;		
		KeyHolder keyHolder = null;

		try {
			sql = "insert into trabajadores(id,nombre,departamento) values(?,?,?)";
			
			keyHolder = new GeneratedKeyHolder();
			getJdbcTemplate().update(new PreparedStatementCreator() {
				
		        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
		                
		        		PreparedStatement ps = connection.prepareStatement(sql, new String[] {"numero_trabajador" });
		                ps.setString(1, t.getId());
		                ps.setString(2, t.getNombre());
		                ps.setString(3, t.getDepartamento());
		                
		                return ps;
		        }
		        }, keyHolder);
		} catch (Exception e) {
			return -1;
		}
		return ((GeneratedKeyHolder) keyHolder).getKey().intValue();
	}

}
