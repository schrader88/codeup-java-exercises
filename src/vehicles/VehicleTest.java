package vehicles;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Generic cars.Vehicle");
        System.out.println(vehicle.getName() + " goes: ");
        vehicle.makeNoise();

        FourWheeler fourWheeler = new FourWheeler();
        fourWheeler.setName("Four Wheeler");

//        System.out.println(fourWheeler.getName() + " goes: ");
//        fourWheeler.makeNoise();

        System.out.println(fourWheeler.getName() + " goes: ");
        fourWheeler.breakingDownNoise();

    }
}
