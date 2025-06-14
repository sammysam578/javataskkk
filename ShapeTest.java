import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and width of rectangle: ");
        double l = sc.nextDouble(), w = sc.nextDouble();
        Shape rect = new Rectangle(l, w);
        System.out.println("Rectangle Area: " + rect.calculateArea());

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        Shape circle = new Circle(r);
        System.out.println("Circle Area: " + circle.calculateArea());

        sc.close();
    }
}
