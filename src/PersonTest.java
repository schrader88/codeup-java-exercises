public class PersonTest {
    public static void main(String[] args) {
        // Exercise 1 below:

//        Person p1 = new Person("Kyle");
//        System.out.println(p1.getName());
//        p1.setName("Joe");
//        p1.sayHello();

        // Example block #1:
        // Will result in true and then false. Cannot compare strings with a "==" comparison operator.

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

        // Example block #2:
        // Will result in true. Probably because you are comparing the constructed Person(s) and not strings

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        // Example block #3:
        // Will print John twice and then Jane twice. This is because of the second line: person2 = person1. This means that when you change person2, the change will also affect person1

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }
}
