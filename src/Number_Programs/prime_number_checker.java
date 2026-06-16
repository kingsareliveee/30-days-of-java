package Number_Programs;

import java.util.Scanner;

public class prime_number_checker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");

        int no = scanner.nextInt();

        boolean isPrime = true;

        if (no <= 1) {

            isPrime = false;

        } else {

            for (int i = 2; i <= Math.sqrt(no); i++) {

                if (no % i == 0) {

                    isPrime = false;
                    break;

                }

            }

        }

        if (isPrime) {

            System.out.println("Prime Number");

        } else {

            System.out.println("Composite Number");

        }

    }
}