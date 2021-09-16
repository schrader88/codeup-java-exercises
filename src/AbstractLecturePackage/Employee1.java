package AbstractLecturePackage;

abstract public class Employee1 {
    public abstract String doWork();

    public void onBoardWithEmployer() {
        System.out.println("Onboarding");
    }

    public void quit() {
        System.out.println("I quit!!");
    }

}
