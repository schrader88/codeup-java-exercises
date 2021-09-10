public class Kangaroo {
    public String name;
    public String sound;

    public void makeNoise(){
//        System.out.println(name + " goes " + sound);
        System.out.println(Quote.randomQuote());
    }

    public void hippityHoppity(){
        System.out.println(name + " jumps around the room! Vibin' and bouncin'!");
    }

    public Kangaroo() {

    }

    public  Kangaroo(String name, String sound) {
        this.name = name;
        this.sound = sound;
        System.out.println(sound + " goes " + name);
    }
}
