package pruebas.spring.clases;

public class SaludoServiceImpl implements SaludoService {
	private String saludo;

	public SaludoServiceImpl() {
	}

	public SaludoServiceImpl(String saludo) {
		this.saludo = saludo;
	}

	public void saludar() {
		System.out.println(saludo);
	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	
	
}
