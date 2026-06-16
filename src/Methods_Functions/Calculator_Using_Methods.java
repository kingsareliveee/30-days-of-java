package Methods_Functions;

import java.util.Scanner;

public class Calculator_Using_Methods {
    static int add(int a , int b){
        return a+b;
    }
    static int subtract(int a , int b){
        return a-b;
    }
    static int multiply(int a, int b){
        return a*b;
    }
    static float divide(int a , int b){
        return a/b;
    }
    public static void main(String[] args){
        System.out.println("Enter a two no:");
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("1- ADD\n2- SUBTRACT \n3- MUTLIPLY \n 4- DIVIDE");
        int c = scanner.nextInt();
        switch (c){
            case 1:{
                System.out.println(add(a , b));
                break;
            }
            case 2:{
                System.out.println(subtract(a,b));
                break;
            }
            case 3:{
                System.out.println(multiply(a,b));
                break;
            }
            case 4:{
                System.out.println(divide(a,b));
            break;
            }
            default:{
                System.out.println("Enter a valid choice");
                break;}

        }

    }
}
