public class file {
    public static void main(String[] args) {
        String s = "rabada";
        int i=0,l;
        String w="";
        char c;
        l=s.length();
        while (i<l){

            c=s.charAt(l-i-1);
            w=w+c;
            i++;
        }
        System.out.println(w);
    }
}