final class Shape {
    final int sides = 4;

    final void display() {
        System.out.println("Shape has " + sides + " sides.");
    }
}

public class Square extends Shape { // This will give error if uncommented
    // Cannot extend final class
    public static void main(String[] args) {
        Shape s = new Shape();
        s.display();
    }
}