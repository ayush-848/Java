import java.util.*;
public class ceiling {
    //it is to find the smallest number in the array which is greater than or equal to the target
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements in the array");
        int n=sc.nextInt();
        int[] a=new int[n];
        int i,t,k=0;
        System.out.println("Fill the array");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter your target element");
        t=sc.nextInt();
        for(i=0;i<n;i++){
            if(a[i]>=t){
                System.out.println("The ceiling element is "+a[i]+" having the index = "+i);
                break;}
        }
    }
}