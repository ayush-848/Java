import java.util.*;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer");
        int n,r,d,s=0,k;
        n=sc.nextInt();
        k=n;
        while(n!=0){
            r=n%10;
            s=s+r;
            n=n/10;
        }
        System.out.println("The sum of digits in "+k+" is "+s);
    }
}