package com.curso.ejemplo;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.object.SqlQuery;

/**
 * 
 * @author sorel
 *
 */
public class SelectCliente extends SqlQuery<Cliente> {

    public SelectCliente() {
        super();
    }

    public SelectCliente(DataSource dataSource, String sentenciaSql) {
        super(dataSource, sentenciaSql);
    }

    @Override
    protected RowMapper<Cliente> newRowMapper(Object[] parameters, Map context) {
        return BeanPropertyRowMapper.newInstance(Cliente.class);
    }
}
