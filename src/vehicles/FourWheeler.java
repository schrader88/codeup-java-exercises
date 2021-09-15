package vehicles;

public class FourWheeler extends Vehicle {

    public void makeNoise() {
        System.out.println("ERRRRRRRR");
    }

    public void breakingDownNoise() {
        super.makeNoise();
        System.out.println("CLINK CLANK CLUNK");
    }

    public FourWheeler() {

    }

    public FourWheeler(String name) {
        super(name);
    }

    public void setName(String fourWheelerName) {
        super.name = fourWheelerName;
    }
}
