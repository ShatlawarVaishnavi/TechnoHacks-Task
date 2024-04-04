package com.technohacks.calculator;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		CalculatorImpl calculator = new CalculatorImpl();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number:");
		double num1 = scanner.nextDouble();

		System.out.println("Enter the second number:");
		double num2 = scanner.nextDouble();

		// Test addition
		System.out.println("Addition: " + calculator.add(num1, num2));

		// Test subtraction
		System.out.println("Subtraction: " + calculator.subtract(num1, num2));

		// Test multiplication
		System.out.println("Multiplication: " + calculator.multiply(num1, num2));

		// Test division
		try {
			System.out.println("Division: " + calculator.divide(num1, num2));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		scanner.close();
	}
}
