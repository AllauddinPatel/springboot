package com.codekul.Java28SeptSpring.service.Repository;

import com.codekul.Java28SeptSpring.service.Domain.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bankrepository extends JpaRepository<Bank,Integer> {
}
