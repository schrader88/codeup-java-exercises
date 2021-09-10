public class Fighter {
    // instance variables
    public String name;
    public int hitPoints;
    public int maxDamage;

    // methods
    public void printStats(){
        System.out.println(name + " has " + hitPoints + " hit points and can do " + maxDamage + " damage.");
    }

    public void battleRoar(){
        System.out.println("I am " + name + ", prepare to be defeated!");
    }

    public int attackRoll(){
        return D20.roll20();
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
