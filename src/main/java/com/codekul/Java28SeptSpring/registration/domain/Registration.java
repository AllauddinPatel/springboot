package com.codekul.Java28SeptSpring.registration.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
    @Email(message = "Enter Valid mail")
    private String email;

    @NotNull(message = "Password Can Not Be Null")
    @Size(min = 8,message = "Password cannot be less than 8 ")
    private  String password;


}
