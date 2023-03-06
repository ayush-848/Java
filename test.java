import java.util.*;
//program to find the second max element

public class test{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,max=0,n,k=1,s=0;

        n= sc.nextInt();
        int[]a=new int[n];
        for(i=0;i<n;i++){
            a[i]= sc.nextInt();
        }max=a[0];
        for(i=1;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }}
            for(i=0;i<n;i++){
            if(a[i]==max)
                k++;
        }
        System.out.println(k);
        int[]b=new int[n-k];
        for(i=0;i<n;i++){
            if(a[i]!=max){
                b[s]=a[i];
                s++;
            }
        }
        max=b[0];
        for(i=0;i<b.length;i++){
            if(b[i]>max){
                max=b[i];
            }
        }
        System.out.println("2nd max element is = "+max);
}}