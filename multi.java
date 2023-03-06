public class multi {
    static void multiplication(int n){
        int i,p=1;
        for(i=1;i<11;i++){
            p=n*i;
            System.out.println(n+" x "+i+" = "+p);
            p=1;
        }
    }

    public static void main(String args[]) {
        multiplication(9);
    }
}