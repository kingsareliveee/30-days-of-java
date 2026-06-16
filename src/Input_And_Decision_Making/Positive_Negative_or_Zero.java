package Input_And_Decision_Making;

import java.util.Scanner;

public class Positive_Negative_or_Zero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a no");
        int x = scanner.nextInt();
        if(x>0){
            System.out.println("The no is positive");
        }
        else if (x<0){
            System.out.println("the no is negative");
        }
    else{
            System.out.println("The no is zero");
        }
    }
}
