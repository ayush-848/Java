import java.util.*;
public class ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j=0,k=0,n;
        System.out.println("Enter 5 integers");
        for(i=0;i<5;i++){
            n= sc.nextInt();
            if(i==0)
                j=n;
            else if(j>n){
                j=n;
            k=1;}}
            if(k==0)
                System.out.println("Numbers are in ascending order");
            else System.out.println("Not in ascending order");

    }
}