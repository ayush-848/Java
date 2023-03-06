import java.util.*;
public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        int p,l;
        System.out.println("Enter a sentence");
        s= sc.nextLine();
        System.out.println("Enter a numeric position in the sentence");
        p= sc.nextInt();
        l=s.length();
        if(p>=0 && p<l){
            char c=s.charAt(p-1);
            System.out.println("The character at "+p+"th position is = "+c);}
        else if(p>=l){

        System.out.println("Try a number lesser than "+l);}
        else if(p<0){
            System.out.println("Try a number greater than or equal to 0");
        }
        else{
            System.out.println("Invalid");
        }
                
    }
}