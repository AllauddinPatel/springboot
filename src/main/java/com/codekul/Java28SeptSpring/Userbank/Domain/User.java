package com.codekul.Java28SeptSpring.Userbank.Domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.swagger.models.auth.In;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String Fname;

    private String Lname;

    private  String Address;

    private  String email;

    private  String contact;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Bankacc> bankacc;


}
