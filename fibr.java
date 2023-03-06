import java.util.*;
public class fibr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer");
        int f=0,l=1,i=0,s=0,k;
        k= sc.nextInt();
       while(f<k){
           s=f+l;
           System.out.print(f+" ");
           f=s;
           i=f;
           f=l;
           l=i;

       }
    }
}