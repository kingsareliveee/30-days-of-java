package Input_And_Decision_Making;

import java.util.Scanner;

public class Leap_Year_Checkert {
    public static void main(String[] args){
        System.out.println("Welcome to Input_And_Decision_Making");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year u wanna check its leap year or not");
        int year = scanner.nextInt();
        if(year%400==0 || year%4==0){
            System.out.println("Its a leap year");
        }
        else{
            System.out.println("its not a leap year");
        }
    }
}
