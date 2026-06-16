package Loops;

import java.util.Scanner;

public class Sum_of_1_to_N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a no");
        int n = scanner.nextInt();
       int sum = (n*(n+1))/2;
       System.out.printf("The total sum is " +sum);
    }
}