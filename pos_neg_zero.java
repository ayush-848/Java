import java.util.Scanner;

public class pos_neg_zero {
    public static void main(String[] args) {
        int a,i,k,p=0,n=0,z=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers you want to enter");
        a= sc.nextInt();
        System.out.println("Enter the integers");
        for(i=0;i<a;i++){
            k= sc.nextInt();
            if(k>0){
            p++;}
          if(k<0){
            n++;}
            if(k==0){
                z++;}
        }
        System.out.println(" ");
        System.out.println("Postive integers are :- "+p);
        System.out.println("Negative integers are :- "+n);
        System.out.println("Total zeroes are :- "+z);

    }
}