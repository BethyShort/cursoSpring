package es.curso;

import java.util.List;

public interface IEmpleadoDAO {

	//MÉTOS CRUD
	public void create(Empleado e);
	public Empleado read(int id);
	public void updte(Empleado e);
	public void delete(int id);
	public List<Empleado> selectAll();
}
