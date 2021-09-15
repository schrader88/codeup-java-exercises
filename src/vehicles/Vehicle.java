package vehicles;
//    Create a cars.Vehicle class with two properties: a name instance variable and a makeNoise() method. The instance variable should be private and have getters and setters (in IntelliJ try cmd-N). The makeNoise method should just sout out a typical vehicle noise. Then create a more specific vehicle subclass, such as cars.Motorcycle, cars.Car, Truck, Tractor, whatever. Make the specific vehicle class extend the cars.Vehicle class. Otherwise, keep it empty. Create a test class, perhaps calling it cars.VehicleTest Instantiate the specific vehicle, assign a value to the name property and run the methods on the specific vehicle. Notice the inherited method works and the inherited name property is assignable on the subclass.

//Create a cars.Car class if you have not already done so. It should be a subclass of cars.Vehicle. Create a cars.Garage class with two properties. It should have a cars.Vehicle array called vehicles, and an alarmCascade() method that simulates all the vehicles in the array having their alarms go off in sequence. Create a cars.GarageTest class. Create at least three cars and set their names. Put them in an array of vehicles. Instantiate a garage, assign your array to the garage's vehicles property and run the alarmCascade method. Now replace one of the cars with another type of vehicle. Run the alarmCascade method again and note that the vehicles array is polymorphic and can contain different types of vehicles.
public class Vehicle {
    private String name;

    public void makeNoise() {
        System.out.println("VROOOOOOOM");
        System.out.println("SKRRRRRRRT");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle() {
    }

    public Vehicle(String name) {
        this.name = name;
    }
}
