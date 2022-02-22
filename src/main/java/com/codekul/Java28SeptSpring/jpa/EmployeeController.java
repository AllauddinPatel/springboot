package com.codekul.Java28SeptSpring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmpoyeeRepository empoyeeRepository;

    @PostMapping("saveEmployee")
    public String saveEmployee(@RequestBody Employee employee) {
        empoyeeRepository.save(employee);
        return "Employee Saved";
    }

    @GetMapping("getEmployee")
    public List<Employee> getEmployee() {
        return empoyeeRepository.findAll();
    }


    @PutMapping("updateEmployee")
    public String updateEmployee(@RequestBody Employee employee) {
        Employee employee1 = empoyeeRepository.getById(employee.getId());

        employee1.setName(employee.getName());
        employee1.setAddress(employee.getAddress());
        empoyeeRepository.save(employee1);
        return "Data Updated..";
    }


//    @DeleteMapping("deleteEmployee/{id}")
//    public  String deleteEmp(@PathVariable(value = "id") Integer id){
//        empoyeeRepository.deleteById(id);
//        return "Record Deleted";
//    }


    @DeleteMapping("deleteEmployee/{id}")
    public String deleteEmp(@PathVariable(value = "id") Integer id) {
        Employee employee = empoyeeRepository.getById(id);
        empoyeeRepository.delete(employee);

        return "Record Deleted";
    }
}
