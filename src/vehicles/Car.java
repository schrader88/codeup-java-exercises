package vehicles;

public class Car extends Vehicle{
    public Car() {
    }

    public Car(String name) {
        super(name);
    }

    public void setName(String carName) {
        super.name = carName;
    }
}
