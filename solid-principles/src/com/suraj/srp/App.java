package com.suraj.srp;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("Welcome to the App\n");
        Scanner scanner = new Scanner(System.in);
        /*
        * Take Input from User
        */
        System.out.print("Enter the First Number: ");
        String firstNumber = scanner.nextLine();

        System.out.print("Enter the Second Number: ");
        String secondNumber = scanner.nextLine();

        scanner.close();

        Integer firstInteger =0;
        Integer secondInteger =0;
        if(firstNumber == null || secondNumber == null){
            System.out.println("Input Not Valid, one of the Inputs is null");
            return;
        }
        try{
        firstInteger = Integer.parseInt(firstNumber);
        secondInteger = Integer.parseInt(secondNumber);
        }catch(NumberFormatException ex){
            System.out.println(" Input not Valid ...");
        }

        int result = firstInteger + secondInteger;
        System.out.println("Result is : "+ result);

    }
}
