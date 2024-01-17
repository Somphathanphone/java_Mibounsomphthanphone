public class Main {
    public static void main(String[] args) {
        // Instantiate the Rectangle class and perform some operations
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Print area and perimeter
        rectangle.calcArea();
        rectangle.calcPerimeter();

        // Modify length and width
        rectangle.setLength(5.0);
        rectangle.setWidth(8.0);

        // Print updated area and perimeter
        rectangle.calcArea();
        rectangle.calcPerimeter();
    }
}
