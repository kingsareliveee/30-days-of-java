package Loops;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Multiplication_Table ");
        System.out.println("Enter the no u wanna get table of");
       int n = scanner.nextInt();
        for (int i = 0; i <11 ; i++) {
            int p= n*i;
            System.out.println(p);
        }
    }
}
