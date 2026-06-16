package Number_Programs;

import java.util.Scanner;

public class Palindrome_Number {
    public  static void main(String[] args) {
        System.out.println("Enter a no");
        Scanner scanner = new Scanner(System.in);
        int reverse = 0;

        int no = scanner.nextInt();
        int a = no;
        while (no > 0) {
            int p = no % 10;
            no = no / 10;
            reverse = reverse * 10 + p;
        }
        System.out.println(reverse);
        if (a==reverse){
            System.out.println("this a palindrome no");
        }
        else {
            System.out.println("this is not a palindrome no");
    }}}

