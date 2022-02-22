package com.codekul.Java28SeptSpring.registration.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Name can not be null")
    private String Name;

    @NotNull(message = "email can not be null")
    private String email;

    @NotNull(message = "Password Can Not Be Null")
    private  String password;


}
