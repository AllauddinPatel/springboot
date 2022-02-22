package com.codekul.Java28SeptSpring.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpoyeeRepository extends JpaRepository<Employee , Integer> {

}
