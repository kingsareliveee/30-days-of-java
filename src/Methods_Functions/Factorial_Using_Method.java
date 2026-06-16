package Methods_Functions;

public class Factorial_Using_Method {
    static int fact (int n)
    {
        for (int i =n-1; i >=1; i--) {
            n=n*i;
        }
        return n;
    }
    public static void main(String[] argsS){

      System.out.println(fact(5));
    }
}
