package com.example.java.restapi.employeedepartment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getemployee")
    public List<DepartmentResponse> getEmployeeByDepartment() {
        return employeeService.getEmployeeByDepartment();
    }
}
