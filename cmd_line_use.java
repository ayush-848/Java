
public class cmd_line_use{
    public static void main(String... args){
        int k=0;
        for(int i=0;i<args.length;i++)
        {
            k=k+Integer.parseInt(args[i]);
            System.out.println(args[i]);
        }
        System.out.println("\nTheir sum is:-\n"+k);
    }
}