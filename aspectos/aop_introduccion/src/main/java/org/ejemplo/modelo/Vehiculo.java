package org.ejemplo.modelo;

public class Vehiculo implements IVehiculo {

    @Override
    public void arrancar() {
        System.out.println("llamada al metodo arrancar");
    }

    @Override
    public void parar() {
        System.out.println("llamada al metodo parar");
    }

    @Override
    public void acelerar() {
        System.out.println("llamada al metodo acelerar");
    }

}
