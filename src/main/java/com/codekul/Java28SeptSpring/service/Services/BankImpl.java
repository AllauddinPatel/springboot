package com.codekul.Java28SeptSpring.service.Services;

import com.codekul.Java28SeptSpring.service.Domain.Bank;
import com.codekul.Java28SeptSpring.service.Repository.Bankrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankImpl implements Bankservice{
    @Autowired
    private Bankrepository bankrepository;

    @Override
    public void saveBank(Bank bank) {
        bankrepository.save(bank);
    }
}
