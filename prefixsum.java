import java.util.*;
public class prefixsum {
    static void print(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    static int[] prefsum(int arr[]){
        int n=arr.length;
        int prefix[]=new int[n];
        prefix[0]=arr[0];
      for(int i=1;i<n;i++){
          prefix[i]=prefix[i-1]+arr[i];

      }return prefix;

        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements inside the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the numbers inside the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        print(arr);
        int pref[]=prefsum(arr);
        System.out.println("Prefix array is:-");
        print(pref);
    }
}