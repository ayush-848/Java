import java.util.*;
public class even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i=0,k=0;
        System.out.println("Enter any number");
        n=sc.nextInt();
        while(n>0){
            i=i+2;
            k++;
            if(k==n){
                System.out.println(i);
                break;
            }
        }
    }
}