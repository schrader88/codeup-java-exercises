package cars;

public class Garage {
    public Vehicle[] vehicles;

    public void alarmCascade(Vehicle[] allTheCarsInTheGarage) {
        System.out.println("Welcome to the garage!");

        for (Vehicle vehicle : allTheCarsInTheGarage) {
            System.out.println(vehicle.getName() + ":");
            vehicle.makeNoise();
        }
    }

}
