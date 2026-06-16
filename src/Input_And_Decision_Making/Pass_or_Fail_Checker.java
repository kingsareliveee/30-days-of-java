package Input_And_Decision_Making;

import java.util.Scanner;

public class Pass_or_Fail_Checker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Welcome to Pass_or_Fail_Checker");
        System.out.printf("Enter your marks:");
        double marks = scanner.nextDouble();
        if(marks>=33){
            System.out.printf("Congrats you are pass");
        }
        else{
            System.out.printf("sorry you are fail");
        }
    }

}
