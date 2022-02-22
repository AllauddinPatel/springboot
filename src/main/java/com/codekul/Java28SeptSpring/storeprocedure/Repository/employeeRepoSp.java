package com.codekul.Java28SeptSpring.storeprocedure.Repository;

import com.codekul.Java28SeptSpring.jpa.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface employeeRepoSp extends JpaRepository<Employee, Integer> {

    @Query(value = "{call getemployee()}" , nativeQuery = true)
    List<Map<String , String>> getemployee();
}
