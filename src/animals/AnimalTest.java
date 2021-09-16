package animals;

public class AnimalTest {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        Animal myDog = new Dog();

        myCat.name = "Sylvester";
        myCat.age = 9;
        myCat.species = "Tabby";
        myCat.weight = 6;

        myDog.name = "Cooper";
        myDog.age = 4;
        myDog.species = "Cavalier King Charles Spaniel";
        myDog.weight = 24;

        myCat.rest(6);
        myDog.rest(3);

        myCat.responseToCommand("Fetch");
        myDog.responseToCommand("Fetch");
    }
}
