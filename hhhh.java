import java.io.*;
import java.util.*;

public class hhhh {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n,k=0;
        double d;
        n=sc.nextInt();
        int a[]=new int[n];
        String s[]=new String[n];
        double c[]=new double[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            s[i]=sc.nextLine();
            c[i]=sc.nextDouble();
        }for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[j]>a[i])
                    d=a[j];
                k=j;
            }
        }System.out.println(s[k]);
    }
}