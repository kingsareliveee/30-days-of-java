package Input_And_Decision_Making;

import java.util.Scanner;

public class Largest_of_Two_Numbers {
    public static void main( String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a>b){

            System.out.printf( " % d is the larger no",a);
        } else if (a<b) {

            System.out.printf(" %d is the larger no",b);
        }
        else {
            System.out.println("both the no are equal");
        }
    }
}
