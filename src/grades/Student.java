package grades;

import java.util.ArrayList;

public class Student {
    private ArrayList<Integer> grades;
    private String name;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        int gradesAdded = 0;
        for (int i = 0; i < grades.size(); i++) {
            gradesAdded += grades.get(i);
        }
        return (gradesAdded/ (double) grades.size());
    }

    public static void main(String[] args) {
        Student kyle = new Student("Kyle");

        kyle.addGrade(45);
        kyle.addGrade(86);
        kyle.addGrade(95);

        System.out.println(kyle.getGradeAverage());
    }
}
