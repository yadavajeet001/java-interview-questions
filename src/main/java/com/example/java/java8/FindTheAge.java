package com.example.java.java8;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

//find the age of a person from the given date
public class FindTheAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your data of birth in YYYY-MM-DD : ");
        String inputDate = scanner.nextLine();
        scanner.close();

        LocalDate date = LocalDate.parse(inputDate);
        LocalDate localDate = LocalDate.now();

        Period period = Period.between(date, localDate);
        System.out.println("You are " + period.getYears() + " years old");

    }
}
