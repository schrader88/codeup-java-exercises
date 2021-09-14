public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Generic Vehicle");
        System.out.println(vehicle.getName() + " goes: ");
        vehicle.makeNoise();

        FourWheeler fourWheeler = new FourWheeler();
        fourWheeler.setName("Four Wheeler");
        System.out.println(fourWheeler.getName() + " goes: ");
        fourWheeler.makeNoise();
    }
}
