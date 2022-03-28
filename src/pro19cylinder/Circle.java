package pro19cylinder;

public class Circle {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius < 0 ? 0 : radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        area=radius * radius * Math.PI;
        return area;
    }
}
