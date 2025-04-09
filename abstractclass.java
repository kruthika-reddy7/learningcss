abstract class Shape {
    int a, b;
    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int x, int y) {
        a = x;
        b = y;
    }

    void printArea() {
        System.out.println("Rectangle Area: " + (a * b));
    }
}

class Triangle extends Shape {
    Triangle(int x, int y) {
        a = x;
        b = y;
    }

    void printArea() {
        System.out.println("Triangle Area: " + (0.5 * a * b));
    }
}

class Circle extends Shape {
    int radius;

    Circle(int r) {
        radius = r;
    }

    void printArea() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 5);
        r.printArea();
        Triangle t = new Triangle(4, 5);
        t.printArea();
        Circle c = new Circle(3);
        c.printArea();
    }
}