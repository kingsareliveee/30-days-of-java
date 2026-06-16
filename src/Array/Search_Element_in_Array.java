package Array;

import java.util.Scanner;

public class Search_Element_in_Array {
    public static void main(String[] args){
        int[] arr = {4,5,7,99,81,55};
        System.out.print("Enter the no you want");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                System.out.println("The item is found "+i);
            }
    }
}}
