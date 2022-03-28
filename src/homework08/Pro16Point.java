package homework08;

public class Pro16Point {
    private int x;
    private int y;

    public static void main(String[] args) {
        Pro16Point first = new Pro16Point(6, 5);
        Pro16Point second = new Pro16Point(3, 1);
        System.out.println("distance(0,0) = " + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2,2) = " + first.distance(2, 2));
        Pro16Point obj = new Pro16Point();

        System.out.println("distance()=" + obj.distance());
    }
    //constructor
    public Pro16Point() {
    }
    public Pro16Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //get
    public int getx() {
        return x;
    }
    public int gety() {
        return y;
    }
    //set
    int a, b;

    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public double distance() {
        return distance(0, 0);
    }
    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }
    public double distance(Pro16Point another) {
        return distance(another.x, another.y);
    }
}
