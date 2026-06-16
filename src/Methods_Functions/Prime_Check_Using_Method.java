package Methods_Functions;

import java.util.Scanner;

public class Prime_Check_Using_Method {

    static boolean prime(int no) {

        if (no <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(no); i++) {

            if (no % i == 0) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int no = sc.nextInt();

        if (prime(no)) {

            System.out.println("The number is Prime");

        } else {

            System.out.println("The number is Not Prime");

        }

    }
}