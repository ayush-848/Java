import java.util.Scanner;

public class sum_of_dig {
    static int sum(int a){

        if(a==0){
        return 1;}
    return a%10 *sum(a/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();

        System.out.println(sum(a));
    }
}