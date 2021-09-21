package ExceptionsLecture;

import java.util.Scanner;

public class ExceptionsLecture {

    public String couldBeAnInteger = "42";
    public String certainlyNotAnInteger = "No integer at all here";

    public void askForAnInteger() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        String userInput = sc.nextLine();
        try {
            int userInputInteger = Integer.parseInt(userInput);
            System.out.println("The integer in your string is " + userInputInteger);
        } catch(NumberFormatException nfx) {
            System.out.println("Uh oh, " + nfx.getMessage() + " there is no integer!");
        } finally {
            System.out.println("Thank you for using this complex and useful app.");
        }

    }

    public void aMoreComplexAskForInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        String userInput = scanner.nextLine();
        try {
            //userInput = null;
            int userInputAsInteger = Integer.parseInt(userInput, 10, 15, 10);
        } catch (NullPointerException npx){
            System.out.println("Oops you didn't enter anything");
            npx.printStackTrace();
        } catch (IndexOutOfBoundsException iobx) {
            System.out.println("Oops your string wasn't long enough");
            iobx.printStackTrace();
        } catch (NumberFormatException nfx){
            System.out.println("No integer between chars 10 and 15");
            nfx.printStackTrace();
        } finally {
            System.out.println("That was useful wasn't it?");
        }
    }

    public void echoWord() throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);
        System.out.println("I am a parrot. Please say something so I can parrot you.");
        String userInput = sc.nextLine();
        if (userInput.equalsIgnoreCase("curses")) {
            throw new IllegalArgumentException();
        }
        System.out.println(userInput);
    }

}
