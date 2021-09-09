public class MethodWarmup {
//    TODO: create a class, MethodWarmup, and add an empty main method.
//    TODO: create a method, getDifference, that takes in two integers and returns the difference between the higher integer and the lower integer (subtract).
//            - If both integers are equal, the order of operands doesn’t matter in the calculation.
//          - If only one integer is passed, treat the calculation as if zero was passed as the second argument.
//          *** BONUS *** allow the method to accept two doubles and return a double output

    public static void main(String[] args) {
        System.out.println(getDifference(2, 9));
        System.out.println(getDifference(9));
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

    public static int getDifference(int oneInt) {
        return oneInt - 0;
    }
}
