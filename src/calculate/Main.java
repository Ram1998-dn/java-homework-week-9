package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();
        char continueCalculation;
        do {
            // Take user inputs for the two numbers
            System.out.print("Enter first number: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Enter second number: ");
            int secondNumber = scanner.nextInt();

            // Take user input for the operator symbol
            System.out.print("Please enter one of the symbols (+, -, *, /): ");
            char symbol = scanner.next().charAt(0);

            // Perform the calculation based on the symbol
            calculator.calculateResult(firstNumber, secondNumber, symbol);

            // Ask the user if they want to continue
            System.out.print("Would you like to do more calculation? Please enter 'Y' or 'N': ");
            continueCalculation = scanner.next().charAt(0);

        } while (continueCalculation == 'Y' || continueCalculation == 'y');

        System.out.println("Program terminated.");
        scanner.close();


    }
}
