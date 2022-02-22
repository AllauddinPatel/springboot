package com.codekul.Java28SeptSpring.Userbank.Domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Bankacc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Long Account_no;


    private  String Ifsc;

    private String branch;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;


}
