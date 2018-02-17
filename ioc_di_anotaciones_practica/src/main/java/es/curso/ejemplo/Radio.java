package es.curso.ejemplo;

/**
 * 
 * @author serrulata
 *
 */
public class Radio {

    private String marca;
    private String modelo;
    private int    volumen;

    public Radio() {
        super();
    }

    public Radio(String marca, String modelo, int volumen) {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.volumen = volumen;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "Radio [marca=" + marca + ", modelo=" + modelo + ", volumen=" + volumen + "]";
    }
}
