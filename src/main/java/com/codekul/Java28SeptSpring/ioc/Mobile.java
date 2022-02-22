package com.codekul.Java28SeptSpring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mobile {
    public static void main(String[] args) {
//        Vodafone vodafone=new Vodafone();
//        vodafone.calling();
//        vodafone.data();
//
//        Jio jio = new Jio();
//        jio.calling();
//        jio.data();

        ApplicationContext context = new AnnotationConfigApplicationContext(SimConfig.class);
        Sim sim=context.getBean(Vodafone.class);
        sim.calling();
        sim.data();

    }



}
