import java.util.*;
public class remainder_n_quotient {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int divisor,dividend,r=1,q=1;
        System.out.println("Enter the dividend");
        dividend = sc.nextInt();
        System.out.println("Enter the divisor");
        divisor=sc.nextInt();

        r=dividend%divisor;
        System.out.println("Remainder is = "+r);
        q=dividend/divisor;
        System.out.println("Quotient is = "+q);

    }
}