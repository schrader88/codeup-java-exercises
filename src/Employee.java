public class Employee {
    public String name;
    public static String company = "Veridian Dynamics";

    public void displayEmployeeInfo() {
        System.out.println(name + " works at " + company);
    }

    public void displayRandomQuote() {
        int randomNumber = (int) (Math.random()*4) + 1;
        if (randomNumber == 1) {
            System.out.println("The best thing about a boolean is even if you are wrong, you are only off by a bit.");
        } else if (randomNumber == 2) {
            System.out.println("Without requirements or design, programming is the art of adding bugs to an empty text file.");
        } else if (randomNumber == 3) {
            System.out.println("Before software can be reusable it first has to be usable.");
        } else {
            System.out.println("The best method for accelerating a computer is the one that boosts it by 9.8 m/s2.");
        }
    }
}
