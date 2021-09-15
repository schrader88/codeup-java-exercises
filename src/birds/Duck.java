package birds;

public class Duck extends Bird {
    // lets override the superclass makeNoise() method

    public void makeNoise() {
        System.out.println("Quack quack");
    }

    public Duck() {
        // By default, super(); runs immediately. If not hard coded in, the compiler will add it on its own.
        super();
    }
}
