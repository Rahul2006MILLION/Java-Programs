class Shape {
    void displayShape() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        System.out.println("Circle Area = " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l; 
        breadth = b;
    }

    void area() {
        System.out.println("Rectangle Area = " + (length * breadth));
    }
}

public class TestShape {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        c.displayShape();
        c.area();

        r.displayShape();
        r.area();
    }
}

