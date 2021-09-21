import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

//        System.out.println(input.getString());
//        System.out.println(input.yesNo());
//        System.out.println(input.getInt(1, 10));
//        System.out.println(input.getInt());
//        System.out.println(input.getDouble(1.00, 10.00));
//        System.out.println(input.getDouble());

        try {
            input.getInt(1, 10);
        } catch (NumberFormatException nfx) {
            System.out.println("That is not a number.");
        }

        try {
            input.getDouble(1, 10);
        } catch (NumberFormatException nfx) {
            System.out.println("That is not a number.");
        }

        try {
            input.getInt();
        } catch (NumberFormatException nfx) {
            System.out.println("That is not a number.");
        }

        try {
            input.getDouble();
        } catch (NumberFormatException nfx) {
            System.out.println("That is not a number.");
        }
    }
}
