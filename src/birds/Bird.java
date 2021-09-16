package birds;

public class Bird {
    // What kind of bird is it?
    public static int birdCount;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Tweet tweet");
    }

    public void move() {
        System.out.println("Flap flap");
    }

    public Bird() {
        // By default, super(); runs immediately. If not hard coded in, the compiler will add it on its own.
        super();
        this.incrementAndOutputBirdCount();
    }

    public Bird(String name) {
        this.name = name;
        this.incrementAndOutputBirdCount();
    }

    public void incrementAndOutputBirdCount() {
        birdCount++;
        System.out.println("There are now " + birdCount + " birds.");
    }
}
