import java.util.*;
public class selectionsort {
    static void selection(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]>a[min])
                    min =j;
            }int t=a[i];
            a[i]=a[min];
            a[min]=t;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n;
    n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
        a[i]= sc.nextInt();
    }
    selectionsort ob=new selectionsort();
    ob.selection(a);
    for(int b=0;b<n;b++){
        System.out.print(a[b]+" ");
    }

    }}