import java.util.Scanner;

public class recursion_pattern {
    public static void pattern(int a) {
        System.out.println("The resulting pattern for your entered number is:- ");
        int i,j;
        for(i=0;i<a;i++){
            for(j=0;j<i+1;j++){
                System.out.print("*"+" ");
            }

        System.out.println(" ");}

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int a= sc.nextInt();
        pattern(a);

    }
}