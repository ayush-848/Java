class phone{
    public void time(){
        System.out.println("It is 8:00am in the morning");
    }
    public void on(){
        System.out.println("Turning on the mobile .......");
    }
}
class smartphone extends phone{
    public void music(){
        System.out.println("Knock! knock! tera baap aaya is playing .....");
    }
    public void on(){
        System.out.println("Turning on the smartphone ..........");
    }

        }
public class chinkapunka {
    public static void main(String[] args) {
        phone obj = new smartphone();
        obj.on();
        obj.time();

    }
}