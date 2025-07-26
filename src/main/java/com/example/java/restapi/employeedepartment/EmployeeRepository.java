package com.example.java.restapi.employeedepartment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Department, Integer> {
    Department findDeptById(int id);
}
