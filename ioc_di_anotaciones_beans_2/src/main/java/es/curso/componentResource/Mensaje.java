package es.curso.componentResource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mensaje implements IMensaje {

    @Value("mensaje por value")
    private String mensaje;

    public Mensaje() {
        super();
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Mensaje [mensaje=" + mensaje + "]";
    }

    @Override
    public void inicializar() {
        System.out.println("Inicializar objeto");
    }

    @Override
    public void destruir() {
        System.out.println("Destruir objeto");
    }
}
