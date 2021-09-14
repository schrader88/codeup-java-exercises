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

        FourWheeler greenFourWheeler = new FourWheeler();
        greenFourWheeler.setName("Big Green Four Wheeler");
        vehicles[2] = greenFourWheeler;

        Garage myGarage = new Garage();

        myGarage.alarmCascade(vehicles);

        // Bonus:

        Vehicle customerVehicle = myGarage.findVehicle("NOT Harley", vehicles);
        Vehicle customerVehicle2 = myGarage.findVehicle("Big Green Four Wheeler", vehicles);

        System.out.println(customerVehicle.getName());
        System.out.println(customerVehicle2.getName());
    }
}
