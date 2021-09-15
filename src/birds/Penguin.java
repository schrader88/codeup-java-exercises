package birds;

public class Penguin extends Bird{

    public void makeNoise() {
        System.out.println("Honk honk");
    }

    public Penguin() {
        // By default, super(); runs immediately. If not hard coded in, the compiler will add it on its own.
        super();
    }
}
