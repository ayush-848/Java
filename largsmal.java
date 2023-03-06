import java.util.Scanner;

public class largsmal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers");
        int n,lar=0,sma=0,i;
        for(i=0;i<10;i++){
            n=sc.nextInt();
            if(i==0){
                lar=sma=n;
            } else {
                if (n > lar)
                    lar = n;

                if (n < sma)
                    sma = n;


            }
        }
        System.out.println("LARGE = "+lar);
        System.out.println("SMALL = "+sma);

    }
}