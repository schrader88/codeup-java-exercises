public class ArraysMiniExercises {
    public static void main(String[] args) {
        // Without Initializer:

//        double[] numbers = new double[5];
//        numbers[0] = 1;
//        numbers[1] = 1;
//        numbers[2] = 1;
//        numbers[3] = 1;
//        numbers[4] = 1;

        // Initializer:

        double[] numbers = {1, 1, 1, 1, 1};

        double sumOfNumbers = 0;

        for (double number : numbers) {
            sumOfNumbers += number;
        }
        System.out.println(sumOfNumbers);
    }
}
