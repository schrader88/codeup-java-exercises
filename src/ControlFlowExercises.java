public class ControlFlowExercises {

    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

        // Below will cause an infinite loop unless it is set to (i > 0) in the while. Why?
        // Will infinite loop if while is set to any number higher than 65536.

//        int i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i > 0 && i < 1000000);

        // Above code will be refactored to For loops below:

//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (int i = 2; i > 0 && i < 1000000; i *= i) {
//            System.out.println(i);
//        }

        // FizzBuzz Test

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 ==0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }


    }

}
