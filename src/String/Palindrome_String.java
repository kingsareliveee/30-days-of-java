package String;

public class Palindrome_String {
public static void main(String[] args){
    String name = "nitin";
    String rev="";
    for (int i = name.length()-1; i >=0; i--) {
        rev = rev + name.charAt(i);

    }
    System.out.print(name.equals(rev));
}
}
