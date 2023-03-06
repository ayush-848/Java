import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,i,k=0,n=0,l=0;
        System.out.println("Enter two numbers to find their HCF");
        a= sc.nextInt();
        b= sc.nextInt();
        if(a<b)
            k=a;
        else
            k=b;
        for(i=1;i<=k;i++){
            if(a%i==0 && b%i==0){
                if(n<i)
                n=i;
            }
        }
        System.out.println("The HCF of "+a+" and "+b+" is:- "+n);
    }
}