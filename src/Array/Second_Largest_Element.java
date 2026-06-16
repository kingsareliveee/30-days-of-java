package Array;

public class Second_Largest_Element {

    public static void main(String[] args) {

        int[] arr = {10, 50, 20, 90, 70};

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {

                secondLargest = largest;
                largest = arr[i];

            }
            else if (arr[i] > secondLargest) {

                secondLargest = arr[i];

            }

        }

        System.out.println("Second Largest = " + secondLargest);

    }
}