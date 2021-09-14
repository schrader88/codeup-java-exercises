package birds;

public class BirdTest {
    public static void main(String[] args) {
        Bird cardinal = new Bird();
        cardinal.setName("Cardinal");
        System.out.println(cardinal.getName() + " says: ");
        cardinal.makeNoise();
        System.out.println(cardinal.getName() + " goes: ");
        cardinal.move();

        Duck mallard = new Duck();
        mallard.setName("Mallard");
        System.out.println(mallard.getName() + " says: ");
        mallard.makeNoise();
        System.out.println(mallard.getName() + " goes: ");
        mallard.move();
    }
}
