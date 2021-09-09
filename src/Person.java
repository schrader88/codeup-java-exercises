public class Person {

    public static void main(String[] args) {
        Person p1 = new Person("Kyle");
//        System.out.println(p1.getName());

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


    }

    private String name;

    public Person(String name) {
        this.name = name;
//        System.out.println("The person's name is " + name);
//        this.setName("Joe");
//        this.sayHello();
    }

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;
        System.out.println(name);
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println(this.name + " says YO");
    }
}
