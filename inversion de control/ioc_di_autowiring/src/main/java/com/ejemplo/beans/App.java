package com.ejemplo.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer);

        Dealer dealer = (Dealer) context.getBean("dealer");
        System.out.println(dealer);

        Seller seller = (Seller) context.getBean("seller");
        System.out.println(seller);

        ((ClassPathXmlApplicationContext) context).close();
    }
}