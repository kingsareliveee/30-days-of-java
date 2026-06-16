package Loops;

import java.util.Scanner;

public class Reverse_Counting {
    public static void main(String[] args) {
        int reverse = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no ");
        int n = scanner.nextInt();
        while (n > 0) {
            int p = n % 10;
            n = n / 10;
            reverse = reverse*10 + p;


        }
        System.out.print(reverse);
    }}
