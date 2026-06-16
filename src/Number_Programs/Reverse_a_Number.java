package Number_Programs;

import java.util.Scanner;

public class Reverse_a_Number {   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the no ");
    int n = scanner.nextInt();
    while (n > 0) {
        int p = n % 10;
        n = n / 10;


        System.out.print(p);
    }
}
}
