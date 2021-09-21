package ExceptionsLecture;

public class ExceptionsLectureTest {
    public static void main(String[] args) {
//        try {
//            ExceptionsLecture el = new ExceptionsLecture();
//            System.out.println(Integer.parseInt(el.couldBeAnInteger));
//            System.out.println(Integer.parseInt(el.certainlyNotAnInteger));
//        } catch (NumberFormatException nfx) {
//            System.out.println("Got an exception: " + nfx);
//            System.out.println(nfx.getMessage());
//            nfx.printStackTrace();
//        }

        ExceptionsLecture el = new ExceptionsLecture();

//        el.askForAnInteger();
//        el.aMoreComplexAskForInteger();

//        try {
//            el.echoWord();
//        } catch (IllegalArgumentException iax) {
//            System.out.println("That is an illegal argument");
//        }

        try {
            el.echoWord();
        } catch (CusswordException cx) {
            System.out.println(cx.getMessage());
        }
    }
}
