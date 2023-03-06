import java.util.*;
public class swapwithno3rdv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two integers");
        int a,b;
        a= sc.nextInt();
        b= sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+"\n"+b);
    }

}