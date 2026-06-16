package Array;

public class Smallest_Element_in_Array {
    public static void main(String[] args){
        int[] arr = {2,7,8,44,99,1};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min=arr[i];
            }

        }
        System.out.println(min);
    }
}
