import java.util.*;
public class noreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n,d,r=0;
        n=sc.nextInt();
        while(n>0){
            d=n%10;
            r=10*r+d;
            n=n/10;
        }
        System.out.println("The reverse number is = "+r);
    }
}