package com.technohacks.calculator;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		CalculatorImpl calculator = new CalculatorImpl();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Select the operation to perform:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        int choice = scanner.nextInt();
        double result = 0;

        switch (choice) {
            case 1:
                result = calculator.add(num1, num2);
                break;
            case 2:
                result = calculator.subtract(num1, num2);
                break;
            case 3:
                result = calculator.multiply(num1, num2);
                break;
            case 4:
                try {
                    result = calculator.divide(num1, num2);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
