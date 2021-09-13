import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

        // If Arrays.toString is not used below, then it will just sout the object code:

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] people = {
                new Person("Kyle"),
                new Person("Todd"),
                new Person("Jen")
        };

        System.out.println(Arrays.toString(people));

        Person person = new Person("Jim");


//        for (int i = 0; i < people.length; i++) {
//            System.out.println(people[i].getName());
//        }

        for (Person p : addPerson(people, person)) {
            System.out.println(p.getName());
        }

    }

    public static Person[] addPerson(Person[] people, Person person) {
        Person[] newArr = Arrays.copyOf(people, people.length + 1);

        newArr[people.length] = person;

        return newArr;
    }


}
