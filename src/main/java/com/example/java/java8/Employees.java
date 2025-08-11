package com.example.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employees {
    private String Fullname;
    private double salary;
    private long mobile;

    public Employees(String Fullname, double salary, long mobile) {
        this.Fullname = Fullname;
        this.salary = salary;
        this.mobile = mobile;

    }

    public static void main(String[] args) {
        /*
         * employee class employee should have full name,salary and mobile no
         * arraylist of employee
         * using stream sort them as highest  to lowest salary
         * to get phone no of all employee
         * to get full name of every employee and print initials
         */
        List<Employees> emp = new ArrayList<>();
        emp.add(new Employees("Khushi  Kumari Singh", 7000, 9376987699L));
        emp.add(new Employees("rohit K", 5000, 9476987699L));
        emp.add(new Employees("sam R", 9000, 9676987699L));
        emp.add(new Employees("ram S", 4000, 9776987699L));
        emp.add(new Employees("sunil singh", 3000, 9976987699L));

        //sort the employee by salary
        emp.sort((emp1, emp2) -> Double.compare(emp2.getSalary(), emp1.getSalary()));
        System.out.println(emp);

        //get phone number
        List<Long> employeesMobile = emp.stream().map(Employees::getMobile).toList();
        System.out.println(employeesMobile);

        //get the first character from name
        List<String> employeeName = emp.stream().map(Employees::getFullname).toList();

        employeeName.stream().map(name -> {
            String initial =
                    Stream.of(name.split("\\s+"))
                            .map(initials -> initials.substring(0, 1)).collect(Collectors.joining());
            return name + " -> " + initial;
        }).forEach(System.out::println);
    }

    public String getFullname() {
        return Fullname;

    }

    public double getSalary() {
        return salary;
    }

    public long getMobile() {
        return mobile;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "Fullname='" + Fullname + '\'' +
                ", salary=" + salary +
                ", mobile=" + mobile +
                '}' + '\n';
    }
}

