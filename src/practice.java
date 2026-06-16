import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        int n = 10;
        int key = 8155;
        int balance = 815500;
        for (int i = 0; i < n; i++) {
            Scanner sc = new Scanner(System.in);

        System.out.print("Enter passcode: ");

        int passcode = sc.nextInt();

        if (passcode == key) {
            System.out.println(balance);
            break ;
        } else {
            System.out.println("Enter a valid choice");
        }
    }
    }
}