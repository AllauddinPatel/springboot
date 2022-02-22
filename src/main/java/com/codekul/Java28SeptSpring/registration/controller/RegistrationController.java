package com.codekul.Java28SeptSpring.registration.controller;

import com.codekul.Java28SeptSpring.registration.domain.Registration;
import com.codekul.Java28SeptSpring.registration.repository.Registrationrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
public class RegistrationController {

    @Autowired
    private Registrationrepo registrationrepo;

    @PostMapping("register")
    public String register(@Valid @RequestBody Registration registration){
     registrationrepo.save(registration);
     return "registration successful";
    }

    @PostMapping("save")
    public String login(@Valid @RequestBody LoginDto loginDto){
        Registration registration=
                registrationrepo.findByEmailAndPassword(loginDto.getEmail(),loginDto.getPassword());
        if (registration.getEmail() != null){
            return "Login Successful";
        }else
        return "Failed";
    }
}
