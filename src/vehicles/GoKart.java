package vehicles;

public final class GoKart extends Vehicle{

    public void makeNoise() {
        super.makeNoise();
        System.out.println("SKRT");
    }

    public GoKart() {

    }

    public GoKart(String name) {
        super(name);
    }
}
