package birds;

public class Finch extends Bird{

    public void makeNoise() {
        super.makeNoise();
        System.out.println("Chirp chirp");
    }

    public Finch() {
        // By default, super(); runs immediately. If not hard coded in, the compiler will add it on its own.
        super();
    }
}
