import java.util.*;
public class fact2 {
    static int sum(int a){
        int k=0,p=0;
        if(a==0)
            return 0;
        if(a%2==0){
            return sum(a-1)-a;
        }
        else
       return sum(a-1)+a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        System.out.println("Sum of digits of "+n+" = "+sum(n));
    }
}