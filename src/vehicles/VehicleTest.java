package vehicles;

public class VehicleTest {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
//        vehicle.setName("Generic cars.Vehicle");

        Vehicle vehicle = new Vehicle("Generic Car");
        System.out.println(vehicle.getName() + " goes: ");
        vehicle.makeNoise();

//        FourWheeler fourWheeler = new FourWheeler();
//        fourWheeler.setName("Four Wheeler");

        FourWheeler fourWheeler = new FourWheeler("Four Wheeler");

//        System.out.println(fourWheeler.getName() + " goes: ");
//        fourWheeler.makeNoise();

        System.out.println(fourWheeler.getName() + " goes: ");
        fourWheeler.breakingDownNoise();

        Car car = new Car("Honda Accord");
        System.out.println(car.getName() + " goes: ");
        car.makeNoise();

        Motorcycle motorcycle = new Motorcycle("Harley");
        System.out.println(motorcycle.getName() + " goes: ");
        motorcycle.makeNoise();

    }
}
