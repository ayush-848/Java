public class array {
    public static void main(String[] args) {
        int a []={9 ,33,87,4,78};
        int i,k=0,s;

        s=a.length;
        for(i=0;i<s;i++){
            k=k+a[i];

        }
        System.out.println(k);
    }
}