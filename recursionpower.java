import java.util.Scanner;

public class recursionpower {
    public static int power(int x, int n) {
        int p,q=1;
        if(x==0)
        {
            return 0;
        }
        if(n==0){
            return 1;
        }
        p=power(x,n-1);
        q=x*p;
        return q;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,n;
        System.out.println("Enter base");
        x=sc.nextInt();
        System.out.println("Enter power");
        n= sc.nextInt();
        System.out.println(power(x,n));
    }
}