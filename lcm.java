import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,i,s=0,n=0;
        System.out.println("Enter two numbers you want to find lcm");
        a= sc.nextInt();
        b= sc.nextInt();
        for(i=1;i>0;i++){
            if(i%a==0 && i%b==0){
                n=i;
                break;
            }
        }
        System.out.println("The LCM of "+a+" and "+b+" is:- "+n);
    }
}