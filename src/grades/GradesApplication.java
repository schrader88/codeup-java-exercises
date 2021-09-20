package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student kyle = new Student("Kyle");
        Student joe = new Student("Joe");
        Student jenna = new Student("Jenna");
        Student anthony = new Student("Anthony");

        kyle.addGrade(45);
        kyle.addGrade(84);
        kyle.addGrade(95);

        joe.addGrade(64);
        joe.addGrade(32);
        joe.addGrade(99);

        jenna.addGrade(94);
        jenna.addGrade(99);
        jenna.addGrade(78);

        anthony.addGrade(66);
        anthony.addGrade(89);
        anthony.addGrade(42);

        students.put("schrader88", kyle);
        students.put("joedirt67", joe);
        students.put("jhays95", jenna);
        students.put("atony99", anthony);

//        System.out.println(students);

        System.out.println("Here are the GitHub usernames of our students: ");
        System.out.println();
        System.out.printf("|%s| |%s| |%s| |%s|%n", "schrader88", "joedirt67", "jhays95", "atony99");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        String userContinue;
        String userInput;

        do {

            System.out.println("What student would you like to see more information on? ");
            System.out.println();

            userInput = scanner.next();

            if (userInput.equals("schrader88")) {
                System.out.printf("Name: %s - GitHub Username: %s%nCurrent Average: %.4s", kyle.getName(), "schrader88", kyle.getGradeAverage());
            } else if (userInput.equals("joedirt67")) {
                System.out.printf("Name: %s - GitHub Username: %s%nCurrent Average: %.4s", joe.getName(), "joedirt67", joe.getGradeAverage());
            } else if (userInput.equals("jhays95")) {
                System.out.printf("Name: %s - GitHub Username: %s%nCurrent Average: %.4s", jenna.getName(), "jhays95", jenna.getGradeAverage());
            } else if (userInput.equals("atony99")) {
                System.out.printf("Name: %s - GitHub Username: %s%nCurrent Average: %.4s", anthony.getName(), "schrader88", anthony.getGradeAverage());
            } else {
                System.out.println("Sorry, no user found with the username of \"" + userInput + "\"");
            }

            System.out.println();
            System.out.println("Would you like to see another student? (choose yes/y or no/n)");
            System.out.println();
            userContinue = sc.next();
        } while(userContinue.equalsIgnoreCase("yes") || userContinue.equalsIgnoreCase("y"));

    }
}
