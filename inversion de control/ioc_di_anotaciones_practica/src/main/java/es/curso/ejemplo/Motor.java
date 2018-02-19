package es.curso.ejemplo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 
 * @author serrulata
 *
 */
@Component
public class Motor {

    @Value("Honda")
    private String marca;

    @Value("Diesel")
    private String tipo;

    public Motor() {
        super();
    }

    public Motor(String marca, String tipo) {
        super();
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Motor [marca=" + marca + ", tipo=" + tipo + "]";
    }

}
