import java.util.*;
public class triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c,s=0;
        System.out.println("Enter three angles");
        a= sc.nextInt();
                b= sc.nextInt();
                        c=sc.nextInt();
        s=a+b+c;
        if(s!=180)
            System.out.println("Invalid!");
        else if(a==b && b==c && s==180)
            System.out.println("Equilateral");
        else if(a!=b && b!=c && s==180)
            System.out.println("Scalene");
        else
            System.out.println("Isosceles");
    }
}