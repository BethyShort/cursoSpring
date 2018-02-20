package modelo.dao;

import java.util.List;

import modelo.beans.Trabajador;

public interface ITrabajadorDAO {
	public Trabajador getTrabajador(String id);
	public boolean ingresarEmpleado(Trabajador t);
	public boolean eliminarEmpleado(String id);
	public boolean actualizarEmpleado(Trabajador t);
	public List<Trabajador> listarEmpleados();
	public int numeroTrabajadores();
	public int numeroTrabajadoresPorDpo(String departamento);	
}
