public class Fighter {
    // instance variables
    public String name;
    private int hitPoints;
    private int maxDamage;

    // methods

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getHitPoints() {
        System.out.println(hitPoints);
        return hitPoints;
    }

    public void setMaxDamage(int hitPoints) {
        this.maxDamage = hitPoints;
    }

    public int getMaxDamage() {
        System.out.println(maxDamage);
        return maxDamage;
    }

    public void printStats(){
        System.out.println(name + " has " + hitPoints + " hit points and can do " + maxDamage + " damage.");
    }

    public void battleRoar(){
        System.out.println("I am " + name + ", prepare to be defeated!");
    }

    public int attackRoll(){
        return D20.roll20();
    }

    // Default constructor
    public Fighter() {

    }

    public Fighter(String name, int hitPoints, int maxDamage) {
        System.out.println("A new fighter has emerged.");
        this.name = name;
        this.hitPoints = hitPoints;
        this.maxDamage = maxDamage;
        this.printStats();
    }

    // DON'T DO THIS: PUT THE MAIN METHOD IN THE CLASS DEFINITION
    // Instead, create a Test class rather than testing in main of the same class
//    public static void main(String[] args) {
//        Fighter arata = new Fighter();
//        arata.name = "Arata";
//        arata.hitPoints = 17;
//        arata.maxDamage = 14;
//        arata.printStats();
//    }

}
