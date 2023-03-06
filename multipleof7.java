import java.util.*;
public class multipleof7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        if(a%7==0 && b%7==0) {
            System.out.println("Both are divisible by 7");
        }
        else {
            System.out.println("Both of them are not divisible by 7");
        }
    }
}