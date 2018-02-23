package es.curso.modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import es.curso.modelo.beans.Trabajador;

/**
 * 
 * @author sorel
 *
 */
public class TrabajadorDAO extends JdbcDaoSupport implements ITrabajadorDAO, RowMapper<Trabajador> {

    public Trabajador mapRow(ResultSet resultset, int n) throws SQLException {
        Trabajador trabajador = new Trabajador();

        trabajador.setId(resultset.getString("id"));
        trabajador.setNombre(resultset.getString("nombre"));
        trabajador.setDepartamento(resultset.getString("departamento"));
        trabajador.setNumeroTrabajador(resultset.getInt("numero_trabajador"));
        return trabajador;
    }

    public void insert(Trabajador trabajador) {
        String sentenciaSQL = "insert into trabajadores(id,nombre,departamento) values(?,?,?)";
        Object[] param = new Object[] { trabajador.getId(), trabajador.getNombre(), trabajador.getDepartamento() };
        getJdbcTemplate().update(sentenciaSQL, param);
    }

    public void delete(int numeroTrabajador) {
        String sql = "delete from trabajadores where numero_trabajador = ?";
        Object[] param = new Object[] { numeroTrabajador };
        getJdbcTemplate().update(sql, param);
    }

    public void update(Trabajador trabajador) {
        String sentanciaSql = "update trabajadores set id=?,nombre=?,departamento=? where numero_trabajador=?";
        Object[] parametros = new Object[] { trabajador.getId(), trabajador.getNombre(), trabajador.getDepartamento(),
                trabajador.getNumeroTrabajador() };
        getJdbcTemplate().update(sentanciaSql, parametros);
    }

    public Trabajador get(int numeroTrabajador) {
        String sentenciaSql = "select * from trabajadores where numero_trabajador = ?";
        Object[] parametros = new Object[] { numeroTrabajador };
        return getJdbcTemplate().queryForObject(sentenciaSql, parametros, this);
    }

    public List<Trabajador> getAll() {
        String sentenciaSql = "select * from trabajadores";
        return getJdbcTemplate().query(sentenciaSql, this);
    }

    public List<Trabajador> getAll(Trabajador trabajador) {

        if (trabajador == null)
            return getAll();
        else {
            String sentenciaSql = montarSentenciaGetAll(trabajador);
            return getJdbcTemplate().query(sentenciaSql, this);
        }
    }

    private String montarSentenciaGetAll(Trabajador trabajador) {
        String filtroNombre=null;
        String filtroDepartamento=null;
        String where="";

        if (trabajador.getNombre() != null)
            filtroNombre = " (nombre like '%" + trabajador.getNombre() + "%') ";

        if (trabajador.getDepartamento() != null)
                filtroDepartamento = " (departamento = '" + trabajador.getDepartamento() + "') ";

        if (filtroNombre!=null) {
            where=filtroNombre;
            if (filtroDepartamento!=null)
                where+=" and " + filtroDepartamento;
        }else if (filtroDepartamento!=null)
            where=filtroDepartamento;
        
        
        return "select * from trabajadores " + where;

    }

}
