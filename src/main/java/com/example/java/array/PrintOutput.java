package com.example.java.array;

public class PrintOutput {
    public static void main(String[] args) {

        //print loop -1
        for (int i = 0; i < 3; i++) {
            for (int j = 0; true; j++) {
                if (i == j) {
                    break;
                }
                System.out.print(i + "" + j + " ");
            }
        }
        //result - 10 20 21
        System.out.println();

        //print loop - 2
        int i = 5;
        while (i > 0) {
            i--;
            if (i == 2) {
                continue;
            }
            System.out.print(i + " ");
        }
        //result - 4 3 1 0

        //print output - 3
        System.out.println();

        int x = 4;
        int y = x++;
        System.out.println(x);
        System.out.println(y);
        //result - 5 4
    }
}



