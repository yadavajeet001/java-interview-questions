package com.example.java.restapi.employeedepartment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<DepartmentResponse> getEmployeeByDepartment() {
        List<Department> departments = employeeRepository.findAll();
       return departments.stream()
                .map(department -> new DepartmentResponse(department.getDeptName(),
                        (List<Employee>) employeeRepository.findDeptById(department.getDeptId()))).collect(Collectors.toList());
    }
}
