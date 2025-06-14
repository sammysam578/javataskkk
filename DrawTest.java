abstract class Draw {
    abstract double calculateVolume();
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Cube extends Draw {
    double side;

    Cube(double s) {
        side = s;
    }

    double calculateVolume() {
        return side * side * side;
    }

    double calculateArea() {
        return 6 * side * side;
    }

    double calculatePerimeter() {
        return 12 * side;
    }
}

class Cuboid extends Draw {
    double l, w, h;

    Cuboid(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    double calculateVolume() {
        return l * w * h;
    }

    double calculateArea() {
        return 2 * (l * w + w * h + h * l);
    }

    double calculatePerimeter() {
        return 4 * (l + w + h);
    }
}

class Cylinder extends Draw {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double calculateVolume() {
        return Math.PI * r * r * h;
    }

    double calculateArea() {
        return 2 * Math.PI * r * (r + h);
    }

    double calculatePerimeter() {
        return 2 * Math.PI * r * 2; // Top + bottom circumference
    }
}

public class DrawTest {
    public static void main(String[] args) {
        Draw cube = new Cube(4);
        Draw cuboid = new Cuboid(2, 3, 4);
        Draw cylinder = new Cylinder(3, 5);

        System.out.println("Cube Volume: " + cube.calculateVolume());
        System.out.println("Cuboid Area: " + cuboid.calculateArea());
        System.out.println("Cylinder Perimeter: " + cylinder.calculatePerimeter());
    }
}
