import java.util.Scanner;

public class x_power_n {
    public static void power(double x, double n) {
        double p=1.0;
        if(x==0) {
            return;
        }
        p=x * Math.pow(x,n-1);

        System.out.println(p);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,n;
        System.out.println("Enter base");
        x= sc.nextDouble();
        System.out.println("Enter exponent");
        n= sc.nextDouble();
        power(x,n);
    }
}