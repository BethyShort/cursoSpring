package modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import modelo.beans.Trabajador;

/**
 * 
 * @author sorel
 *
 */
public class TrabajadorDAO extends JdbcDaoSupport implements ITrabajadorDAO {

    public boolean ingresarEmpleado(Trabajador trabajador) {
        // ingresamos 1 trabajador con el metodo update de plantilla
        try {
            getJdbcTemplate().update("INSERT INTO trabajadores(id,nombre,departamento) VALUES(?,?,?)", trabajador.getId(),
                    trabajador.getNombre(), trabajador.getDepartamento());
            return true;
        } catch (DataAccessException e) {
            return false;
        }
    }

    public List<Trabajador> listarEmpleados() {
        // realizamos la consulta de de trabajadores
        return getJdbcTemplate().query("SELECT * FROM trabajadores" + " ORDER BY numero_trabajador DESC LIMIT 10",
                // se mapea el resultado de la consulta para que query retorne una lista con objetos de tipo Trabajador
                new RowMapper<Trabajador>() {
                    public Trabajador mapRow(ResultSet resultSet, int numeroRegistro) throws SQLException {
                        Trabajador trabajador = new Trabajador();
                        trabajador.setId(resultSet.getString("id"));
                        trabajador.setNombre(resultSet.getString("nombre"));
                        trabajador.setDepartamento(resultSet.getString("departamento"));
                        return trabajador;
                    }
                });
    }

    public boolean eliminarEmpleado(String idTrabajador) {
        try {
            getJdbcTemplate().update("delete from trabajadores where id = ?", idTrabajador);

            return true;
        } catch (DataAccessException dataAccesssException) {
            return false;
        }
    }

    public boolean actualizarEmpleado(Trabajador trabajador) {
        try {
            getJdbcTemplate().update("update trabajadores set nombre = ?,departamento=? where id=?", trabajador.getNombre(),
                    trabajador.getDepartamento(), trabajador.getId());
            return true;
        } catch (DataAccessException dataAccessException) {
            return false;
        }
    }

    public int numeroTrabajadores() {
        return getJdbcTemplate().queryForObject("select count(*) from trabajadores", Integer.class);
    }

    public int numeroTrabajadoresPorDpo(String departamento) {
        Object parametros[] = new Object[] { departamento };

        return getJdbcTemplate().queryForObject("select count(*) from trabajadores where departamento = ?", parametros,
                Integer.class);
    }

    public Trabajador getTrabajador(String idTrabajador) {
        String sentenciaSql = "select id, nombre, departamento from trabajadores where id = ?";
        Object parametros[] = new Object[] { idTrabajador };
        return getJdbcTemplate().queryForObject(sentenciaSql, parametros, new RowMapper<Trabajador>() {

            public Trabajador mapRow(ResultSet resultSet, int numeroRegistro) throws SQLException {
                /// Creamos un trabajador y lo devolvemos:
                Trabajador trabajador = new Trabajador();

                trabajador.setId(resultSet.getString("id"));
                trabajador.setNombre(resultSet.getString("nombre"));
                trabajador.setDepartamento(resultSet.getString("departamento"));
                return trabajador;
            }

        });
    }

}
