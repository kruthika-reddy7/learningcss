class Cuboid {
    int length, breadth, height;

    // Constructor
    Cuboid(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    int volume() {
        return length * breadth * height;
    }

    public static void main(String[] args) {
        Cuboid c = new Cuboid(5, 3, 2);
        System.out.println("Volume: " + c.volume());
    }
}