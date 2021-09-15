package vehicles;

public class VehicleTest {
    public static void main(String[] args) {
        // Below is with default constructor (or no arg constructor)

//        Vehicle vehicle = new Vehicle();
//        vehicle.setName("Generic cars.Vehicle");

        // Below is with the constructor that accepts a string as an arg:

        Vehicle vehicle = new Vehicle("Generic Car");

        System.out.println(vehicle.getName() + " goes: ");
        vehicle.makeNoise();

        // Below is with default constructor (or no arg constructor)

//        FourWheeler fourWheeler = new FourWheeler();
//        fourWheeler.setName("Four Wheeler");

        // Below is with the constructor that accepts a string as an arg:

        FourWheeler fourWheeler = new FourWheeler("Four Wheeler");

//        System.out.println(fourWheeler.getName() + " goes: ");
//        fourWheeler.makeNoise();

        System.out.println(fourWheeler.getName() + " goes: ");
        fourWheeler.breakingDownNoise();

        // Below is with the constructor that accepts a string as an arg:

        Car car = new Car("Honda Accord");
        System.out.println(car.getName() + " goes: ");
        car.makeNoise();

        // Below is with the constructor that accepts a string as an arg:

        Motorcycle motorcycle = new Motorcycle("Harley");
        System.out.println(motorcycle.getName() + " goes: ");
        motorcycle.makeNoise();

    }
}
