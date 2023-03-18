import java.util.*;


public class omnipotent_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        int r, p = 0;
        a = sc.nextLine();
        char[] array = a.toCharArray();
        r = array.length;
        char[] s = new char[r];
        System.out.println(array);
        for (int i = 0; i < r; i++) {
            s[i] = array[r - i - 1];
            p++;
        }
        System.out.println(s);
    }
}