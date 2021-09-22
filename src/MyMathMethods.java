import java.lang.reflect.Array;
import java.util.Scanner;

public class MyMathMethods {

    // Both methods below are NOT STATIC:

//    public int multiply(int num1, int num2) {
//        return num1 * num2;
//    }
//
//    public double multiply(double num1, double num2) {
//        return num1 * num2;
//    }

    // Methods below are STATIC:

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static int multiply() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter two integers: ");
        int userFirst = scanner.nextInt();
        int userSec = scanner.nextInt();

        return userFirst * userSec;
    }

    public static int quotient(int num1, int num2) {
        return num1/num2;
    }

    public static double quotient(double num1, double num2) {
        return num1/num2;
    }

    public static int arraySum(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

    public static double arraySum(double[] numbers) {
        double sum = 0;
        for (double n : numbers) {
            sum += n;
        }
        return sum;
    }

}
