package ExceptionsLecture;

public class ExceptionsLectureTest {
    public static void main(String[] args) {
        try {
            ExceptionsLecture el = new ExceptionsLecture();
            System.out.println(Integer.parseInt(el.couldBeAnInteger));
            System.out.println(Integer.parseInt(el.certainlyNotAnInteger));
        } catch (NumberFormatException nfx) {
            System.out.println("Got an exception: " + nfx);
            System.out.println(nfx.getMessage());
            nfx.printStackTrace();
        }
    }
}
