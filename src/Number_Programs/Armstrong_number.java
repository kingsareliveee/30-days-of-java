package Number_Programs;

import java.util.Scanner;

public class Armstrong_number { public  static void main(String[] args) {
    System.out.println("Enter a no");
    Scanner scanner = new Scanner(System.in);
    int reverse = 0;
    int sum=0;
    int no = scanner.nextInt();
    int a = no;
    while (no > 0) {
        int p = no % 10;
        no = no / 10;
        sum=sum+(p*p*p);

    }
    System.out.print(sum);
  }
}
