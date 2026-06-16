package String;

public class Count_Consonants {  public static void main(String[] args){
    String name ="chhilkatazamoot";
    int count=0;
    for (int i = 0; i <name.length(); i++) {
        if(name.charAt(i)=='a'|| name.charAt(i)=='e'|| name.charAt(i)=='i' ||
                name.charAt(i)=='o' || name.charAt(i)=='u'){
           System.out.print("");
        }
        else {
            count++;
        }

    }
    System.out.println(count);
}
}
