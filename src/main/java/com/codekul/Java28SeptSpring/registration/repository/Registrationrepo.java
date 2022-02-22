package com.codekul.Java28SeptSpring.registration.repository;

import com.codekul.Java28SeptSpring.registration.domain.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Registrationrepo extends JpaRepository<Registration, Integer> {
    Registration findByEmailAndPassword(String email,String password);
}
