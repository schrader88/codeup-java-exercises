package birds;

public class BirdTest {
    public static void main(String[] args) {
        // Below is using constructor with parameter:

        Bird cardinal = new Bird("Cardinal");

        // Below is for default constructor:

//        Bird cardinal = new Bird();
//        cardinal.setName("Cardinal");
        System.out.println(cardinal.getName() + " says: ");
        cardinal.makeNoise();
        System.out.println(cardinal.getName() + " goes: ");
        cardinal.move();

        // Below is using constructor with parameter:

        Duck mallard = new Duck("Mallard");

//        Duck mallard = new Duck();
//        mallard.setName("Mallard");
        System.out.println(mallard.getName() + " says: ");
        mallard.makeNoise();
        System.out.println(mallard.getName() + " goes: ");
        mallard.move();

        // Below is using constructor with parameter:

        Finch goldFinch = new Finch("Goldfinch");

//        Finch goldFinch = new Finch();
//        goldFinch.setName("Goldfinch");
        System.out.println(goldFinch.getName() + " says: ");
        goldFinch.makeNoise();
        System.out.println(goldFinch.getName() + " goes: ");
        goldFinch.move();
    }
}
