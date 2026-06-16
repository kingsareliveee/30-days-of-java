package BASICS;

import java.util.Scanner;

public class Area_of_Rectangle {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of length of the rectangle\n");
        int length = scanner.nextInt();
        System.out.print("Enter the size of breath of the rectangle\n");
        int breath = scanner.nextInt();
        int area = length*breath;
        System.out.println("The are of the rectangle is :");
        System.out.println(area);
    }
}
