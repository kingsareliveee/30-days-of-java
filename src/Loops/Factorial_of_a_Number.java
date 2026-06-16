package Loops;

import java.util.Scanner;

public class Factorial_of_a_Number {

    public static void main(String[] args) {

        System.out.println("Enter a number:");

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int fact = 1;

        for (int i = n; i > 0; i--) {

            fact = fact * i;

        }

        System.out.println("Factorial = " + fact);

    }
}