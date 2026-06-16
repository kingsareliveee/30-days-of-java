package Input_And_Decision_Making;

import java.util.Scanner;

public class Even_or_Odd_Number {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a no");
        int x = scanner.nextInt();
        if(x%2 == 0){
                System.out.println("Entered no is even");
    }
        else {
                System.out.println("Entered no is odd"); }

} }
