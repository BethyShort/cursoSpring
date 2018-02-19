package es.curso.ejemplo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

/**
 * 
 * @author serrulata
 *
 */
public class Coche {

    @Autowired
    @Qualifier("radio1")
    private Radio radio;

    private String marca;
    private String modelo;

    @Resource
    private Motor motor;

    public Coche() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Coche(Radio radio, String marca, String modelo, Motor motor) {
        super();
        this.radio = radio;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Radio getRadio() {
        return radio;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public String getMarca() {
        return marca;
    }

    @Required
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Coche [radio=" + radio + ", marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + "]";
    }

    @PostConstruct
    public void inicializacion() {
        System.out.println("Spring termina de inicializar el bean ...");
    }

    @PreDestroy
    public void destruccion() {
        System.out.println("Spring va a destruir el bean ...");
    }
}
