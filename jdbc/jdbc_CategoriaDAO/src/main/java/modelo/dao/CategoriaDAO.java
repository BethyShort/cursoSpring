package modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import modelo.beans.Categoria;
import modelo.beans.Producto;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class CategoriaDAO  implements RowMapper<Categoria>, ICategoriaDAO {

	private JdbcTemplate plantilla;

	public void setDataSource(DataSource dataSource) {
		// se instancia plantilla con la inyeccion del datasource
		this.plantilla = new JdbcTemplate(dataSource);
	}

	
	@Override
	public Categoria get(int id) {
		// TODO Auto-generated method stub
		String sql = "select id, nombre from categorias where id = ?";
		Object []parametros = {new Integer(id)};
		return this.plantilla.queryForObject(sql, parametros, this);
	}

	@Override
	public List<Categoria> getAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT id, nombre from categorias";
		return this.plantilla.query(sql, this);
	}

	@Override
	public Categoria mapRow(ResultSet rst, int numRow) throws SQLException {
		// TODO Auto-generated method stub
		Categoria categoria = new Categoria();
		categoria.setId(rst.getInt("id"));
		categoria.setNombre(rst.getString("nombre"));
		
		String sql = "select id, nombre, precio, existencias from productos where idcategoria = ?";
		Object []parametros = {new Integer(categoria.getId())};
		List<Producto> productos = this.plantilla.query(sql, parametros, new RowMapper<Producto>(){

			@Override
			public Producto mapRow(ResultSet rst, int numRows)	throws SQLException {
				Producto p = new Producto();
				p.setId(rst.getInt("id"));
				p.setNombre(rst.getString("nombre"));
				p.setPrecio(rst.getDouble("precio"));
				p.setExistencias(rst.getInt("existencias"));
				return p;
			}
			
		});
		
		categoria.setProductos(productos);		
		return categoria;
	}

}
