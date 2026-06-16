package BASICS;

import java.util.Scanner;

public class Simple_Interest_Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Principal (initial loan or investment amount)");
        double p = scanner.nextDouble();
        System.out.println("Enter the  Rate of interest (percentage per annum)");
        int r = scanner.nextInt();
        System.out.println("Enter the Time (duration in years)");
        double t = scanner.nextDouble();
        double SI = (p*r*t)/100;
        System.out.println("The SI on the loan amount is :");
        System.out.println(SI);
    }
}
