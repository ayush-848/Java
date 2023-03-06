import java.util.*;
public class passfail {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a,b,c,d;
        System.out.println("Enter marks of all the three subjects");
        a= sc.nextInt();
        b= sc.nextInt();
        c=sc.nextInt();
        d=(a+b+c)/3.0;

        if (a>100 || a<0 || b>100 || b<0 || c>100 || c<0){
            System.out.println("Enter proper number");
        }
        else if(a>32 && b>32 && c>32 && d>40.0){
            System.out.println("\t"+"Pass with an average of = "+d);
        }
        else{
            System.out.println("\t"+"Fail");
        }
    }
}