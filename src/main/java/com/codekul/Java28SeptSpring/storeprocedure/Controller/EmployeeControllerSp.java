package com.codekul.Java28SeptSpring.storeprocedure.Controller;

import com.codekul.Java28SeptSpring.storeprocedure.Repository.employeeRepoSp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class EmployeeControllerSp {

    @Autowired
    private employeeRepoSp employeeRepoSp;

    @GetMapping("getemployee")
    public List<Map<String ,String>> getemployee(){
        return employeeRepoSp.getemployee();
    }
}
