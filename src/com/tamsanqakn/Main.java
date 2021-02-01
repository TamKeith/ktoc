package com.tamsanqakn;

import java.util.Scanner;

public class Main {

    static double kelvin = 0;
    static double celcius = 0;

    public static void main(String[] args) {

        boolean quit = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the ****Kelvin to Celcius Converter****");

        while(!quit) {

            System.out.println("Enter the Temperature in Kelvin: ");

            boolean isANumber = scanner.hasNextDouble();

            if(isANumber) {
                String input = scanner.nextLine();
                kelvin = Double.parseDouble(input);
                celcius = kelvin - 273.15;
                String strCelcius = String.format("%.2f", celcius);
                System.out.println(kelvin + " Kelvin is = " + strCelcius + "  Degrees Celcius");
                boolean stop = false;
                int choice;

                while (!stop) {

                    System.out.println("Do you wish to continue?" +
                            "\n 1 : Continue" +
                            "\n 2 : Exit");
                    boolean isAnInt = scanner.hasNextInt();
                    if (isAnInt) {
                        choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                stop = true;
                                break;
                            case 2:
                                stop = true;
                                quit = true;
                                break;
                            default:
                                System.out.println("Please Enter a choice between 1 and 2");
                                stop = false;
                                break;
                        }
                    } else {
                        System.out.println("Please Select a choice from the ones shown.");
                    }
                    scanner.nextLine();
                }

            } else {
                scanner.nextLine();
                System.out.println("Please Enter a Numeric value for the Temperature");
            }
        }
        scanner.close();
        System.out.println("Thank You for using the ****Kelvin to Celcius Converter****. Bye");
    }
}