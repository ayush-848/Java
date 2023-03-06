import java.util.*;
public class pairs {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array");
        int k,i,p,q,s;

        k=sc.nextInt();    int a[]=new int[k];
        System.out.println("Fill-up the array");
        for(i=0;i<k;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter number for sum of pairs");
        s=sc.nextInt();
        System.out.println("The pairs whose sum is "+s+" :-");
        for(p=0;p<k;p++){
            for(q=p+1;q<k;q++){
                if(a[p]+a[q]==s)
                    System.out.println("("+a[p]+","+a[q]+")");
                }
            }
        }
}