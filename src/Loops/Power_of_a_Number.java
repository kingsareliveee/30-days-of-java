package Loops;

import java.util.Scanner;

public class Power_of_a_Number {

    public static void main(String[] args) {

        int result = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number:");
        int no = scanner.nextInt();

        System.out.println("Enter the power:");
        int power = scanner.nextInt();

        for (int i = 0; i < power; i++) {

            result = result * no;

        }

        System.out.println("Answer = " + result);

    }
}