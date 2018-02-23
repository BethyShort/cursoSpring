package es.curso.modelo.dao3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import es.curso.modelo.beans.Trabajador;

/**
 * 
 * @author sorel
 *
 */
public class TrabajadorDAO3 extends JdbcDaoSupport implements ITrabajadorDAO3 {

    public int insert(final Trabajador trabajador) {
        final String sentenciaSql;
        KeyHolder keyHolder = null;

        try {
            sentenciaSql = "insert into trabajadores(id,nombre,departamento) values(?,?,?)";

            keyHolder = new GeneratedKeyHolder();
            getJdbcTemplate().update(new PreparedStatementCreator() {

                public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {

                    PreparedStatement preparedStatement = connection.prepareStatement(sentenciaSql, new String[] {"numero_trabajador"});
                    preparedStatement.setString(1, trabajador.getId());
                    preparedStatement.setString(2, trabajador.getNombre());
                    preparedStatement.setString(3, trabajador.getDepartamento());

                    return preparedStatement;
                }
            }, keyHolder);
        } catch (Exception excepcion) {
            return -1;
        }
        return ((GeneratedKeyHolder) keyHolder).getKey().intValue();
    }

}
