import java.util.Scanner;

public class MethodWarmup {
//    TODO: create a class, MethodWarmup, and add an empty main method.
//    TODO: create a method, getDifference, that takes in two integers and returns the difference between the higher integer and the lower integer (subtract).
//            - If both integers are equal, the order of operands doesn’t matter in the calculation.
//          - If only one integer is passed, treat the calculation as if zero was passed as the second argument.
//          *** BONUS *** allow the method to accept two doubles and return a double output

    public static void main(String[] args) {
        System.out.println(getDifference(2, 9));
        System.out.println(getDifference(2.63, 9.58));
        System.out.println(getDifference(9));
        System.out.println(addNums(5));
        System.out.println("You say " + getHello() + ", I say howdy!");
    }

    // Code below works. Returns sout of difference and not difference:

//    public static void getDifference(int firstInt, int secInt) {
//        if (firstInt > secInt) {
//            System.out.println(firstInt - secInt);
//        } else if (firstInt < secInt) {
//            System.out.println(secInt - firstInt);
//        } else {
//            System.out.println(firstInt - secInt);
//        }
//    }

    // Returning difference instead of sout below:

    public static int getDifference(int firstInt, int secInt) {
        if (firstInt > secInt) {
            return firstInt - secInt;
        } else if (firstInt < secInt) {
            return secInt - firstInt;
        } else {
            return firstInt - secInt;
        }
    }

    // Overloading below. One for a "double" data type:

    public static double getDifference(double firstInt, double secInt) {
        if (firstInt > secInt) {
            return firstInt - secInt;
        } else if (firstInt < secInt) {
            return secInt - firstInt;
        } else {
            return firstInt - secInt;
        }
    }

    // Overloading below. This is for one entry, not two:

    public static int getDifference(int oneInt) {
        return oneInt - 0;
    }

    // TODO: use recursion to add all numbers up, from 1 to the given number input
    /*
        addNums(5) would trigger a calculation of...
            5 + 4 + 3 + 2 + 1, evaluating to 15
     */
     public static int addNums(int num) {
        if (num <= 1) {
            return num;
        }
        return addNums(num - 1) + num;
     }

    // TODO: use recursion to ensure only the user input of "hello" is returned from the function

     public static String getHello() {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Please enter the word \"hello\": ");
         String userResponse = scanner.next();

         if (userResponse.equalsIgnoreCase("hello")) {
             return userResponse;
         } else {
             return getHello();
         }
     }
}
