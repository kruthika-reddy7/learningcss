interface Transport {
    int speed = 60;
    int capacity = 50;
    int wheels = 4;
    int fuelCapacity = 100;
    int mileage = 20;

    void start();
    void move();
    void stop();
}

class Bus implements Transport {
    private String driver;

    Bus(String driver) {
        this.driver = driver;
    }

    public void start() {
        System.out.println("Bus started by " + this.driver);
    }

    public void move() {
        System.out.println("Bus is moving at speed: " + speed);
    }

    public void stop() {
        System.out.println("Bus stopped");
    }

    public static void main(String[] args) {
        Bus b = new Bus("John");
        b.start();
        b.move();
        b.stop();
    }
}