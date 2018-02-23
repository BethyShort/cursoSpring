package es.curso.modelo.dao2;

import java.util.HashMap;
import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import es.curso.modelo.beans.Trabajador;

/**
 * 
 * @author sorel
 *
 */
public class TrabajadorDAO2 extends NamedParameterJdbcTemplate implements ITrabajadorDAO2 {

    public TrabajadorDAO2(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public int insert(Trabajador trabajador) {
        String sentenciaSql;
        int registrosActualizados = 0;

        try {
            sentenciaSql = "insert into trabajadores(id,nombre,departamento) values(:id,:nombre,:departamento)";

            HashMap<String, Object> parametros = new HashMap<String, Object>();
            parametros.put("id", trabajador.getId());
            parametros.put("nombre", trabajador.getNombre());
            parametros.put("departamento", trabajador.getDepartamento());
            registrosActualizados = update(sentenciaSql, parametros);
        } catch (Exception e) {
        }
        return registrosActualizados;
    }

}
