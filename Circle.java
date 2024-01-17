// Circle.java
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calcArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of Circle: " + area);
    }

    public void calcPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
