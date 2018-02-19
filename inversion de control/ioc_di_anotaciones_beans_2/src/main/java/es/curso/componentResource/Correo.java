package es.curso.componentResource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Correo {

    @Value("123456789")
    private String origen;

    @Autowired
    private IMensaje mensaje;

    @Value("987654321")
    private String destino;

    public Correo() {
        super();
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public IMensaje getMensaje() {
        return mensaje;
    }

    public void setMensaje(IMensaje mensaje) {
        this.mensaje = mensaje;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Correo [origen=" + origen + ", mensaje=" + mensaje + ", destino=" + destino + "]";
    }

}
