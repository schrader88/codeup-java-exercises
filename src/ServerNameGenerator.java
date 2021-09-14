import java.util.Random;

public class ServerNameGenerator {
    private String[] adjectives = {"Charming", "Cruel", "Fantastic", "Gentle", "Huge", "Perfect", "Rough", "Sharp", "Tasty", "Zealous"};
    private String[] nouns = {"Milk", "Rain", "Tablecloth", "Orange", "Basketball", "Door", "Perfume", "Laser", "Pretzel", "School"};

    public static String randomElementFromArray(String[] arr1, String[] arr2) {
        int random = new Random().nextInt(arr1.length);
        int random2 = new Random().nextInt(arr2.length);
        return (arr1[random] + "-" + arr2[random2]);
    }

    public void setAdjectives(String[] adjectives) {
        this.adjectives = adjectives;
    }

    public void setNouns(String[] nouns) {
        this.nouns = nouns;
    }

    public String[] getAdjectives() {
        return adjectives;
    }

    public String[] getNouns() {
        return nouns;
    }

    public static void main(String[] args) {
        ServerNameGenerator thisGenerator = new ServerNameGenerator();

        System.out.println("Here is your server name: ");
        System.out.println(randomElementFromArray(thisGenerator.getAdjectives(), thisGenerator.getNouns()));
    }
}
