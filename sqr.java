class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class sqr {
    public static void main(String[] args) {


        square sq = new square();
        sq.side = 6;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

    }
}