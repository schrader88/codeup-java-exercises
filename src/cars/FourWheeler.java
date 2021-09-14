package cars;

public class FourWheeler extends Vehicle {

    public void makeNoise() {
        System.out.println("ERRRRRRRR");
    }

    public void breakingDownNoise() {
        super.makeNoise();
        System.out.println("CLINK CLANK CLUNK");
    }
}
