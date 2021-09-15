package birds;

public class Bird {
    // What kind of bird is it?
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
    }

    public Bird(String name) {
        this.name = name;
    }
}
