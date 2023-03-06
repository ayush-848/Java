import java.io.*;
import java.util.*;

public class ab {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n,b,k=1;
        n=sc.nextInt();
        String s[]=new String[n+1];
        for(b=0;b<s.length;b++){
            s[b]=sc.nextLine();

        }for(b=0;b<n;b++) {
            System.out.println(k+" "+s[b+1]);
            k++;

        }   }
}