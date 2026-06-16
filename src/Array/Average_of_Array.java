package Array;

public class Average_of_Array {public static void main(String[] args){
    int[] arr = {2,5,7,8,9};
    float sum=0;
    for (int i = 0; i < arr.length; i++) {
         sum= sum+arr[i];

    }
    System.out.println(sum/ arr.length);
}
}
