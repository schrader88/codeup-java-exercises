import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CollectionsTest {
    /*
    Create a class called CollectionsTest and include the following...
    TODO: create a static method, omit2s, that takes in an array list of integers.
      The method should return an arraylist of integers with the same values as the
      input arraylist but without 2s.
 */

    public static ArrayList<Integer> omit2s(ArrayList<Integer> integers) {
        integers.removeIf(number -> number == 2);
        return integers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);

        System.out.println(numbers);

        System.out.println(omit2s(numbers));
    }
}
