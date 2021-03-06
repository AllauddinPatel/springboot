package com.codekul.Java28SeptSpring.serviceDemo.Controller;

import com.codekul.Java28SeptSpring.serviceDemo.Domian.ServiceDemo;
import com.codekul.Java28SeptSpring.serviceDemo.Service.ServiceDemoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceDemoController {

    @Autowired
    private ServiceDemoInterface serviceDemoInterface;

    @PostMapping("saveServiceDemo")
    public String saveService(@RequestBody ServiceDemo serviceDemo){
        serviceDemoInterface.saveServiceDemo(serviceDemo);
        return "saved..";
    }
}
