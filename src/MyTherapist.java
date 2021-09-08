import java.util.Scanner;

public class MyTherapist {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How are you doing today?");
        System.out.println("(Choose one: great, terrible, or okay)");
        String userResponse = scanner.next();

        if (userResponse.equals("great")) {
            System.out.println("So glad you are having a great day!");
        } else if (userResponse.equals("terrible")) {
            System.out.println("I'm very sorry to hear that. My advice: Get some fresh air and do some self care!");
        } else if (userResponse.equals("okay")) {
            System.out.println("I am glad to hear your day is not bad, but I would love to improve the day to make it great! Go out and get some ice cream, on me. *hands patient $5* ");
        } else {
            System.out.println("That is too complicated for me, you will have to pay for extra time for that one.");
        }
    }
}
