package com.curso.mvc.modelo;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class ClaseHija {
    private double valorAnterior;
    private double valor;

    
    public double getValorAnterior() {
		return valorAnterior;
	}

	public void setValorAnterior(double valorAnterior) {
		this.valorAnterior = valorAnterior;
	}

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valorAnterior=this.valor;
        this.valor = valor;
    }

    public String toString() {
        StringBuilder aux=new StringBuilder();
        aux=aux.append("ID CLASE HIJA                :"+ this.hashCode());        
        aux=aux.append("\nESTADO ANTERIOR              :"+ valorAnterior);
        aux=aux.append("\nESTADO ACTUAL                :"+ valor);
        System.out.println(aux.toString());
        return aux.toString();
    }

}
