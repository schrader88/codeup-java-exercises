package birds;

public class Ornithologist {
    public void changeBirdName(String newBirdName, Bird birdToRename) {
        System.out.println(birdToRename.getName() + "'s name has been changed to " + newBirdName + ".");
        birdToRename.setName(newBirdName);
    }
}
