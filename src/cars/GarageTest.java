package cars;

public class GarageTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];

        vehicles[0] = new FourWheeler();
        vehicles[0].setName("Custom Four Wheeler");
        vehicles[1] = new Car();
        vehicles[1].setName("Ford F-150");
        vehicles[2] = new Motorcycle();
        vehicles[2].setName("Harley");
        vehicles[3] = new Car();
        vehicles[3].setName("Honda Accord");

        Garage myGarage = new Garage();

        myGarage.alarmCascade(vehicles);
    }
}
