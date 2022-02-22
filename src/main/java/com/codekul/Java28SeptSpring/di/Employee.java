package com.codekul.Java28SeptSpring.di;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Employee {
     private  int id;
    private  String name;
    private  String address;

    public  void show(){
        System.out.println("In Show");
    }
    public Employee(){
        System.out.println("Object Created");
    }

}
