package com.example.java.java8;

import java.util.HashSet;
import java.util.Set;

public class Employee {
    String id;
    int yrsOfExperience;
    long salary;
    Set<String> skillSet;

    public Employee(String id, int yrsOfExperience, long salary, Set<String> skillSet) {
        this.id = id;
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

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Set<String> getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(Set<String> skillSet) {
        this.skillSet = skillSet;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
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


        Employee emp1 = new Employee("101", 1, 100, skill1);

    }
}
