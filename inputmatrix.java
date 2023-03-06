import java.util.Scanner;

public class inputmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,c,i,j,k,s=0;

        System.out.println("rows and columns");
        r= sc.nextInt();
        c= sc.nextInt();
        int[][] n =new int[r][c];
        System.out.println("Enter no to find");
        k= sc.nextInt();
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                n[i][j]= sc.nextInt();
            }
        }
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(n[i][j]==k)
                    System.out.println("the position of "+k+" is "+i+","+j);
                  else
                      s++;
            }
    }if(s>1)
            System.out.println("not found");
}}