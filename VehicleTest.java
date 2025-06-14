abstract class Vehicle {
    abstract void startEngine();
    abstract void stopEngine();
}

class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine started.");
    }

    void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

class Motorcycle extends Vehicle {
    void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Motorcycle();

        car.startEngine();
        car.stopEngine();

        bike.startEngine();
        bike.stopEngine();
    }
}
