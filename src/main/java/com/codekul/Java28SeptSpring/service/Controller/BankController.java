package com.codekul.Java28SeptSpring.service.Controller;


import com.codekul.Java28SeptSpring.service.Domain.Bank;
import com.codekul.Java28SeptSpring.service.Services.Bankservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @Autowired
    private Bankservice bankservice;

    @PostMapping("saveBank")
    public String saveBank(@RequestBody Bank bank){
        bankservice.saveBank(bank);
        return "Bank Saved";
    }
}
