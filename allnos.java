
import java.util.*;
public class allnos
{ public static long factorial(int n) {
    if(n == 1)
        return 1;
    long fact = n * factorial(n - 1);
    return fact;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
}