import java.util.*;
public class div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        float s;
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();

        if(a==0 || b==0){
            System.out.println("Invalid!");

        }
        else if(a>b){
            s=(float)a/b;
            System.out.println(s);
        }
        else{
            s=(float)b/a;
            System.out.println(s);
        }
    }
}