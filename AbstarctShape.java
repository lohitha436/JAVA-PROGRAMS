abstract class Shape {
    protected int dimension1; // Could represent length, base, or radius
    protected int dimension2; // Could represent width or height
    public Shape(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }
    public abstract void printArea();
}
class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);
    }
    @Override
    public void printArea() {
        int area = dimension1 * dimension2; // Area = length * width
        System.out.println("Area of Rectangle: " + area);
    }
}
class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height);
    }
    @Override
    public void printArea() {
        double area = 0.5 * dimension1 * dimension2; // Area = 0.5 * base * height
        System.out.println("Area of Triangle: " + area);
    }
}
class Circle extends Shape {
    public Circle(int radius) {
        super(radius, 0); // Only one dimension is needed for a circle
    }
    @Override
    public void printArea() {
        double area = Math.PI * dimension1 * dimension1; // Area = π * r^2
        System.out.println("Area of Circle: " + area);
    }
}
public class MainS {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        rectangle.printArea(); // Prints area of rectangle
        Shape triangle = new Triangle(5, 10);
        triangle.printArea(); // Prints area of triangle
        Shape circle = new Circle(7);
        circle.printArea(); // Prints area of circle
    }
}
