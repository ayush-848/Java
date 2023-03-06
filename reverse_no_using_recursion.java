import java.util.*;
public class reverse_no_using_recursion {
   static int s=0;
    static void reverse(int a){
        int r;
        if(a==0){
            return;
        }
     r=a%10;
        s=s*10+r;
        reverse(a/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        reverse(n);
        System.out.println(s);

    }
}