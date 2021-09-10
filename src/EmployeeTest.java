public class EmployeeTest {
    public static void main(String[] args) {
        Employee kyle = new Employee();
        Employee jenna = new Employee();
        Employee joe = new Employee();

        kyle.name = "Kyle";
        jenna.name = "Jenna";
        joe.name = "Joe";

        kyle.displayEmployeeInfo();
        jenna.displayEmployeeInfo();
        joe.displayEmployeeInfo();

        kyle.displayRandomQuote();
        jenna.displayRandomQuote();
        joe.displayRandomQuote();
    }
}
