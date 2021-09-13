public class Kangaroo {
    private String name;
    private String sound;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println(name);
        return this.name;
    }

    public void setSound(String sound) {;
        this.sound = sound;
    }

    public String getSound() {
        System.out.println(sound);
        return this.sound;
    }

    public void makeNoise(){
//        System.out.println(name + " goes " + sound);
        System.out.println(Quote.randomQuote());
    }

    public void hippityHoppity(){
        System.out.println(name + " jumps around the room! Vibin' and bouncin'!");
    }

    public Kangaroo() {

    }

    public Kangaroo(String name, String sound) {
        this.name = name;
        this.sound = sound;
        System.out.println(sound + " goes " + name);
    }
}
