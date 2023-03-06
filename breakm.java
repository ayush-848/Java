public class breakm {
    public static void main(String[] args) {
        int i,k=0;
        for(i=0;i<7;i++){
            k++;
            System.out.println("k = "+k);
            if(k==3){
                System.out.println("ending loop.............");
                System.out.println("Done");
                break;
            }
        }
    }
}