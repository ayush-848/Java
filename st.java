public class st {
    public static void main(String[] args) {
        String s = "CALL OF DUTY";
        int l,i;
        String w="";
        char c;
        l=s.length();
        for(i=0;i<l;i++){
            c=s.charAt(l-i-1);
            w=w+c;
        } System.out.println(w);
    }
}