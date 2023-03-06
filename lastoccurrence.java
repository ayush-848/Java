import java.util.*;
public class lastoccurrence {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int l,i,j,k,s=0;
        System.out.println("Enter no of numbers to be entered in the array");
        j=sc.nextInt();
        int a[]=new int[j];
        System.out.println("Fill the array");
        for(l=0;l<j;l++){
            a[l]=sc.nextInt();
        }
        System.out.println("Enter number to find its last occurrence ");
        k=sc.nextInt();
        for(i=0;i<j;i++){
            if(a[i]==k)
                s=i;
        }
        System.out.println("Last occurrence of k = "+(s+1));

    }
}