package Input_And_Decision_Making;

import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter your percentage");
        int M = scanner.nextInt();
        if(M>90){
            System.out.printf("you got 10 sgpa");
        } else if (M>80) {
            System.out.printf("you got 9 sgpa");
        } else if (M>70) {
            System.out.printf("you got 8 sgpa");
        }
        else if(M>60) {
            System.out.printf("you got 7 sgpa");
        } else if (M>50) {
            System.out.printf("you got 6 sgpa");
        } else if (M>40) {
            System.out.printf("you got 5 sgpa");
        } else if (M>=35) {
            System.out.printf("you got 4 sgpa");
        }
        else {
            System.out.printf("Sorry you are failed");
        }
    }
}
