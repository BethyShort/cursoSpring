package com.curso.ejemplo;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.object.SqlQuery;

public class SelectCliente extends SqlQuery<Cliente>{
	
	public SelectCliente() {
		super();
	}
	public SelectCliente(DataSource ds, String sql) {
		super(ds, sql);		
	}
	@Override
	protected RowMapper<Cliente> newRowMapper(Object[] parameters, Map context) {
		// TODO Auto-generated method stub
		return BeanPropertyRowMapper.newInstance(Cliente.class);
	}
}
