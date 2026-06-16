package Input_And_Decision_Making;

import java.util.Scanner;

public class Voting_Eligibility_Checker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Welcome to Voting_Eligibility_Checker");
        System.out.printf("\nEnter your age :");
        int age = scanner.nextInt();
        if(age>=18){
            System.out.printf("You are Eligibile to vote");
        }
        else{
            System.out.printf("you are not Eligibile to vote");
        }
    }
}
