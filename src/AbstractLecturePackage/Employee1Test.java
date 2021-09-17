package AbstractLecturePackage;

import java.util.Arrays;

public class Employee1Test {
    public static void main(String[] args) {
//        Waiter waiter = new Waiter();
//        Developer developer = new Developer();
//
//        waiter.onBoardWithEmployer();
//        System.out.println(waiter.doWork());
//        waiter.quit();
//
//        developer.onBoardWithEmployer();
//        System.out.println(developer.doWork());
//        developer.quit();

        Transferable waiter = new Waiter();
        waiter.transferToNewLocation("San Antonio Location 4");
        System.out.println(Arrays.toString(waiter.getListOfPossibleTransferLocations()));
    }
}
