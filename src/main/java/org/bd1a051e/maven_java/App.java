package org.bd1a051e.maven_java;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n==== Calculator ====");
            System.out.println("1) Addition");
            System.out.println("2) Subtraction");
            System.out.println("3) Multiplication");
            System.out.println("4) Division");
            System.out.println("5) Modulo");
            System.out.println("6) Power");
            System.out.println("7) Exit");
            System.out.print("Choose an option (1-7): ");
            int choice = sc.nextInt();
            if (choice == 7) {
                System.out.println("Exiting..");
                break;
            }
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();
            double result;
            switch (choice) {
                case 1: result = a + b; break;
                case 2: result = a - b; break;
                case 3: result = a * b; break;
                case 4: result = b != 0 ? a / b : Double.NaN; break;
                case 5: result = a % b; break;
                case 6: result = Math.pow(a, b); break;
                default:
                    System.out.println("Invalid choice.");
                    continue;
            }
            System.out.println("Result: " + result);
        }
        sc.close();
    }
}
