package com.example.java.restapi.employeedepartment;

import java.util.List;

public class DepartmentResponse {

    private String departmentName;
    private List<Employee> employeeList;

    public DepartmentResponse(String departmentName, List<Employee> employeeList) {
        this.departmentName = departmentName;
        this.employeeList = employeeList;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
