package ExceptionsLecture;

public class ExceptionsTest {
    public String thisString = "This is a string!";
    public static void main(String[] args) {

        ExceptionsTest test = new ExceptionsTest();

//        System.out.println(test.thisString.substring(25));

        try {
            String newString = "STRING";
            System.out.println(newString.length());
            System.out.println(newString.substring(9));
        } catch(StringIndexOutOfBoundsException oob) {
            System.out.println("Got this exception: " + oob);
            System.out.println(oob.getMessage());
            oob.printStackTrace();
        }
    }
}
