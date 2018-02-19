package com.curso.aop;

/**
 * Clase sobre la que se establece el pointcut
 * @author sorel
 *
 */
public class Voluntario implements IVoluntario {

    private String pensamientos;
    private String observaciones;

    @Override
    public void pensar(String pensamientos, String observaciones) {
        this.pensamientos = pensamientos;
        this.observaciones = observaciones;
    }

    @Override
    public String getPensamientos() {
        return pensamientos;
    }

    @Override
    public String getObservaciones() {
        return observaciones;
    }

}
