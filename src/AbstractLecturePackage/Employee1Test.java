package AbstractLecturePackage;

public class Employee1Test {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Developer developer = new Developer();

        waiter.onBoardWithEmployer();
        System.out.println(waiter.doWork());
        waiter.quit();

        developer.onBoardWithEmployer();
        System.out.println(developer.doWork());
        developer.quit();
    }
}
