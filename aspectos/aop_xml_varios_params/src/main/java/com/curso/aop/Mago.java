package com.curso.aop;

/**
 * 
 * @author sorel
 *
 */
public class Mago implements IMago {

    private String pensamientos;
    private String observaciones;

    @Override
    public void interceptar(String pensamientos, String observaciones) {
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
