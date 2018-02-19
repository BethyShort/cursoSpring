package com.curso.principal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.curso.aop.IMago;
import com.curso.aop.IVoluntario;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
        IVoluntario vol;
        IMago mago;

        vol = (IVoluntario) contexto.getBean("voluntario");
        mago = (IMago) contexto.getBean("mago");

        vol.pensar("mis pensamientos", "mis observaciones");

        System.out.println("El mago intercepta: " + mago.getObservaciones() + " " + mago.getPensamientos());
        ((ClassPathXmlApplicationContext) contexto).close();
    }

}
