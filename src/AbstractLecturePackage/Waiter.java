package AbstractLecturePackage;

class Waiter extends Employee1 implements Transferable {
    @Override
    public String doWork() {
        return "Serving the guests...";
    }

    @Override
    public void transferToNewLocation(String location) {
        System.out.println("Moving to " + location + ". Checking with manager of that location...");
    }

    @Override
    public String[] getListOfPossibleTransferLocations() {
        // check company database for list of my preferred transfer locations
        return new String[] {"location1", "location2"};
    }

//    public static void main(String[] args) {
////        Waiter waiter = new Waiter();
////        Developer developer = new Developer();
////
////        waiter.onBoardWithEmployer();
////        System.out.println(waiter.doWork());
////        waiter.quit();
////
////        developer.onBoardWithEmployer();
////        System.out.println(developer.doWork());
////        developer.quit();
//    }
}
