class cylinder{
    private int height,radius;

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height=height;
    }
}
public class chunky {
    public static void main(String[] args) {
        cylinder my = new cylinder();
        my.setHeight(12);
        int h=my.getHeight();
        System.out.println(h);
    }
}