import java.util.Scanner;

public class fibro {
    public static void fibronacci(int a, int b, int n) {
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        fibronacci(b,c,n-1);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,n;
        System.out.println("enter the numbers");
        a= sc.nextInt();
        b= sc.nextInt();
        n= sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        fibronacci(a,b,n-2);
    }
}