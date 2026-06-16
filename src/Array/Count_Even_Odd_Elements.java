package Array;

public class Count_Even_Odd_Elements {
    public static void main(String[] args){
        int [] arr={1,2,3,4,5,6};
        int count = 0;
        int no =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
              count++;
            }
            else{
                no++;
            }

        }
        System.out.println("No of even digits in the array are "+count);
        System.out.println("No of odd digit in the array are "+no);
    }
}
