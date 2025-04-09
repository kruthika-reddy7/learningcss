interface Engine {
    int horsepower = 150;
    int rpm = 7000;
    int torque = 200;

    void startEngine();
    void stopEngine();
}

interface Vehicle extends Engine {
    void accelerate();
    void brake();
    void honk();
}

class Car implements Vehicle {
    public void startEngine() {
        System.out.println("Engine started with " + horsepower + " HP.");
    }

    public void stopEngine() {
        System.out.println("Engine stopped.");
    }

    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    public void brake() {
        System.out.println("Car is braking.");
    }

    public void honk() {
        System.out.println("Car horn is honking.");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.startEngine();
        c.accelerate();
        c.honk();
        c.brake();
        c.stopEngine();
    }
}