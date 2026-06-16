package Input_And_Decisiom_Making;
import java.util.Scanner;

public class BANK_USING_SWITCH {
    public static void main(String[] args) {

        System.out.println("-----WELCOME TO THE BANK OF BUNDELKHAND-------");

        int balance = 100000;
        int key = 8155;

        Scanner sc = new Scanner(System.in);

        System.out.println("-----------Enter the passkey:---------");

        int pass = sc.nextInt();

        if(pass == key) {

            for (int i = 0; i < 10; i++) {

                System.out.println("Choose the type of service");
                System.out.println("1: Balance  2: Withdraw  3: Deposit  4: Exit");

                int choice = sc.nextInt();

                switch(choice) {

                    case 1:

                        System.out.println("Current Balance:");
                        System.out.println(balance);

                        break;

                    case 2:

                        System.out.println("Enter withdraw amount:");

                        int amount = sc.nextInt();

                        if(amount <= balance) {

                            balance -= amount;

                            System.out.println("Remaining Balance:");
                            System.out.println(balance);

                        }
                        else {

                            System.out.println("Insufficient Balance");

                        }

                        break;

                    case 3:

                        System.out.println("Enter deposit amount:");

                        int deposit = sc.nextInt();

                        balance += deposit;

                        System.out.println("Updated Balance:");
                        System.out.println(balance);

                        break;

                    case 4:

                        System.out.println("Thank you for visiting");
                        return;

                    default:

                        System.out.println("Enter valid choice");

                }

            }

        }
        else {

            System.out.println("Invalid Passkey");

        }

    }
}