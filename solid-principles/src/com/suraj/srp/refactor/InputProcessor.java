package com.suraj.srp.refactor;

import java.util.Scanner;

public class InputProcessor {

    public static Pair input(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        String firstNumber = scanner.nextLine();

        System.out.print("Enter the Second Number: ");
        String secondNumber = scanner.nextLine();

        scanner.close();

       return new Pair(firstNumber,secondNumber);
    }
}
