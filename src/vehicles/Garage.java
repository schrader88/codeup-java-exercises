package vehicles;

public class Garage {
    public Vehicle[] vehicles;

    public void alarmCascade(Vehicle[] allTheCarsInTheGarage) {
        System.out.println("Welcome to the garage!");

        for (Vehicle vehicle : allTheCarsInTheGarage) {
            System.out.println(vehicle.getName() + ":");
            vehicle.makeNoise();
        }
    }

//    The findVehicle method should be part of the Garage class. It takes a string and an array of Vehicles. It returns the vehicle that the customer is looking for (the vehicle the name of which matches the string). If the vehicle is not in the garage, it returns a Vehicle with a null name.

    public Vehicle findVehicle(String vehicle, Vehicle[] arrayOfVehicles) {
        for (Vehicle vehicles : arrayOfVehicles) {
            if (vehicles.getName().equals(vehicle)) {
                return vehicles;
            }
        }
        Vehicle notHere = new Vehicle();
        notHere.setName(null);
        return notHere;
    }
}
