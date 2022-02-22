package com.codekul.Java28SeptSpring.serviceDemo.Service;

import com.codekul.Java28SeptSpring.serviceDemo.Domian.ServiceDemo;
import com.codekul.Java28SeptSpring.serviceDemo.Repository.ServiceDemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDemoImpl implements ServiceDemoInterface {

    @Autowired
    ServiceDemoRepo serviceDemoRepo;

    @Override
    public void saveServiceDemo(ServiceDemo serviceDemo) {
    serviceDemoRepo.save(serviceDemo);

    }
}
