package com.example.java.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    String id;
    String name;
    String department;
    int yrsOfExperience;
    double salary;
    Set<String> skillSet;

    public Employee(String id, String name, String department, int yrsOfExperience, long salary, Set<String> skillSet) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.yrsOfExperience = yrsOfExperience;
        this.salary = salary;
        this.skillSet = skillSet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getYrsOfExperience() {
        return yrsOfExperience;
    }

    public void setYrsOfExperience(int yrsOfExperience) {
        this.yrsOfExperience = yrsOfExperience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Set<String> getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(Set<String> skillSet) {
        this.skillSet = skillSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", yrsOfExperience=" + yrsOfExperience +
                ", salary=" + salary +
                ", skillSet=" + skillSet +
                '}';
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Set<String> skill1 = new HashSet<>();
        skill1.add("java");
        Set<String> skill2 = new HashSet<>();
        skill1.add("python");


        Employee emp1 = new Employee("101", "Ajeet", "cs", 5, 1000, skill1);
        Employee emp2 = new Employee("102", "Chandan", "it", 10, 1000, skill2);
        List<Employee> employeeList = Arrays.asList(emp1, emp2);

        //department name start with c
        List<Employee> res = employeeList.stream().filter(depName -> depName.department.startsWith("c")).toList();
        System.out.println("Result1: " + res);

        //count of employee by department name
        Map<String, Long> res2 = employeeList.stream().filter(depName -> depName.department.startsWith("c")).collect(Collectors.groupingBy(Employee::getDepartment, TreeMap::new, Collectors.counting()));
        System.out.println("Result2: " + res2);

        //filter employee who is having java skill set
        List<Employee> res3 = employeeList.stream().filter(skill -> skill.getSkillSet().contains("java")).toList();
        System.out.println("Result3 : " + res3);

        //increase salary by 10 %
        employeeList.forEach(emp -> emp.setSalary(emp.getSalary() * 1.10));
        System.out.println(employeeList);
        employeeList.forEach(emp -> System.out.println(emp.getName() + "->" + emp.getSalary()));

        //get the employee object which name is ajeet
        Optional<Employee> res4 = employeeList.stream().filter(name -> name.getName().equals("Ajeet")).findFirst();
        if (res4.isPresent()) {
            System.out.println("res4 : " + res4);
        }

    }
}
