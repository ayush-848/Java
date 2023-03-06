import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,p=1;
        System.out.println("Enter any number to find its factorial");
        n= sc.nextInt();
        for(i=1;i<=n;i++){
            p=p*i;

        }
        System.out.print("The factorial of ");
        System.out.print(n);
        System.out.println(" is = "+p);
    }
}