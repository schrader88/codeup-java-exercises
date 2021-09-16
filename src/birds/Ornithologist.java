package birds;

public class Ornithologist {
    public void changeBirdName(String newBirdName, Bird birdToRename) {
        String oldBirdName = birdToRename.getName();
        birdToRename.setName(newBirdName);
        System.out.println(oldBirdName + "'s name has been changed to " + newBirdName + ".");
    }
}
