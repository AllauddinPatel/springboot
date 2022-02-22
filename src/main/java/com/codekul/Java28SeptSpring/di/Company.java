package com.codekul.Java28SeptSpring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singleton")
public class Company {
    private  int id;
    private  String componyname;
    private  String componyaddress;

    //fixed base
    @Autowired
    private Employee employee;

    @Autowired
    private Employee employee1;




    //setter base
//    @Autowired
//    public void setEmployee(Employee employee){
//        this.employee=employee;

//    }





    public void getData(){
        employee.show();
        employee1.show();

    }
}
