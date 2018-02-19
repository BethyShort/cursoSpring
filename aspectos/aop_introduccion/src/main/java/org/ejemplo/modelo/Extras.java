package org.ejemplo.modelo;

public class Extras implements IExtras {

    @Override
    public void activarAirbag() {
        System.out.println("Activar Airbag");
    }

    @Override
    public void activarGPS() {
        System.out.println("Activar GPS");
    }

}
