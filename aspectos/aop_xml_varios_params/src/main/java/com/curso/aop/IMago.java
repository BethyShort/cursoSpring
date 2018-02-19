package com.curso.aop;

/**
 * 
 * @author sorel
 *
 */
public interface IMago {

    public void interceptar(String pensamientos, String observaciones);

    public String getPensamientos();

    public String getObservaciones();

}
