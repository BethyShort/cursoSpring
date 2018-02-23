package es.curso.modelo.dao;

import java.util.List;

import es.curso.modelo.beans.Trabajador;

/**
 * 
 * @author sorel
 *
 */
public interface ITrabajadorDAO {

    public void insert(Trabajador trabajador);

    public void delete(int idTrabajador);

    public void update(Trabajador trabajador);

    public Trabajador get(int idTrabajador);

    public List<Trabajador> getAll();

    public List<Trabajador> getAll(Trabajador trabajador);
}
