package week14;

interface Shape {
    abstract double calArea();
    abstract double calPerimeter();
}

class Circle implements Shape {
    private double radius;
    public double calArea() {
        return Math.PI * radius * radius;
    }
    public double calPerimeter() {
        return 2 * Math.PI * radius;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
}

class Rectangle implements Shape {
    private double width;
    private double length;
    public double calArea() {
        return width * length;
    }
    public double calPerimeter() {
        return 2*width + 2*length;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Circle Area: " + c.calArea());
        System.out.println("Circle perimeter: " + c.calPerimeter());
        Rectangle r = new Rectangle(7, 4);
        System.out.println("Rectangle area: " + r.calArea());
        System.out.println("Rectangle perimeter: " + r.calPerimeter());
    }
}
