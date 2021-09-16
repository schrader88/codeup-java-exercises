package birds;

public class OrnithologyConference {
    public static void main(String[] args) {
        Duck duck = new Duck("Billy");
        Ornithologist ornithologist = new Ornithologist();

        ornithologist.changeBirdName("Todd", duck);
    }
}
