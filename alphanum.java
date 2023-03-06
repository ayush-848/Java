import java.util.*;
public class alphanum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s,w=" ";
        System.out.println("Enter a string");
        s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c>='0'&& c<='9')
                System.out.print(i);
        }
    }
}