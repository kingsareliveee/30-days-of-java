package BASICS;

import java.util.Scanner;

public class Area_of_Circle {
    public static void main(String[] args){
        double pie = Math.PI;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle :\n");
        int r = scanner.nextInt();
        double area = pie*r*r;
        System.out.println("The are of circle is :");
        System.out.println(area);
    }
}
