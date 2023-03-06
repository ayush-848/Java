import java.util.Scanner;

public class finronacci {
    public static void main(String[] args) {
        int a=0,b=1,n,k=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the limit");
        n= sc.nextInt();
        k=a+b;
        System.out.print(a+","+b+",");
        while(k<n){
            a=b;
            b=k;
            k=a+b;
            if(k<100)
            System.out.print(b+",");
            else
                System.out.println(b);

        }
    }
}