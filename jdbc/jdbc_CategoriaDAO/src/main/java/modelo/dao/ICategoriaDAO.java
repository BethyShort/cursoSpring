package modelo.dao;

import java.util.List;

import modelo.beans.Categoria;

public interface ICategoriaDAO {
	
	public Categoria get(int id);
	public List<Categoria> getAll();

}
