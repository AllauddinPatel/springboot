package com.codekul.Java28SeptSpring.serviceDemo.Repository;

import com.codekul.Java28SeptSpring.serviceDemo.Domian.ServiceDemo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceDemoRepo extends JpaRepository<ServiceDemo , Integer> {
}
