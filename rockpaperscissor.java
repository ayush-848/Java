import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random in = new Random();
        System.out.println("Enter 0 for stone, 1 for paper and 2 for scissor");
        int u,c;
        u= sc.nextInt();
        c= in.nextInt(3);
        if(u==c)
            System.out.println("DRAW");
        else if (u==0 && c==2 ||u==1 && c==0 ||u==2 && c==1)
            System.out.println("Congratulations, You WIN!!!");
            else
            System.out.println("Computer WINS!!!");
        System.out.println("Computer's choice is:- "+c);

        }
    }