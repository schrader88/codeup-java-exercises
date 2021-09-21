package ExceptionsLecture;

import java.util.*;

public class ExceptionsTest {

    //    Given the following code, investigate the kinds of exceptions it could throw and write a try-catch structure catching these exceptions and providing the appropriate output messages. Be careful of where exactly you begin your try-catch structure. Optionally, add a finally clause.
//
//    Test your code to make sure that the exceptions are indeed caught. Test the code by entering a null value as the method's String parameter (subListMaker(null) or String sentence = null; subListMaker(sentence)), and by entering negative integers and integers larger than the number of words in the sentence as the user inputs. Try to modify the warning for an improper integer to suggest to the user what range of integers is acceptable.
//
//    To search for what exceptions a method throws, use the following search string: Java + number of your Java JDK + API + name of method. For example, Java 16 API substring.

    public void subListMaker(String sentence){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int firstInt = scanner.nextInt();
        System.out.println("Please enter another integer");
        int secondInt = scanner.nextInt();
        System.out.println(sentence);
        ArrayList<String> wordArrayList = new ArrayList<String>();
            try {
                String[] stringArray = sentence.split(" ");
                for (String word : stringArray){
                    wordArrayList.add(word);
                }
                List<String> shorterList =  wordArrayList.subList(firstInt, secondInt);
                String newSentence = String.join(" ", shorterList);
                System.out.println(newSentence);
            } catch (IndexOutOfBoundsException ioobx) {
                System.out.println("The integers you entered are out of range.");
            } catch (IllegalArgumentException iax) {
                System.out.println("The endpoints are out of order.");
            } catch (NullPointerException npx) {
                System.out.println("A sentence was not entered. This just won't work.");
            } finally {
                System.out.println("The program is finished!");
            }
    }

    // InputMismatchException
    // NoSuchElementException
    // IllegalStateException

    // IndexOutOfBoundsException
    // IllegalArgumentException


    public static void main(String[] args) {

        ExceptionsTest et = new ExceptionsTest();

//        et.subListMaker("This is my sentence and it is good.");
//        et.subListMaker(null);

//        try {
//            String newString = "STRING";
//            System.out.println(newString.length());
//            System.out.println(newString.substring(9));
//        } catch(StringIndexOutOfBoundsException oob) {
//            System.out.println("Got this exception: " + oob);
//            System.out.println(oob.getMessage());
//            oob.printStackTrace();
//        }
        try {
            Lizard lizardKingOne = new Lizard("");
        } catch (IllegalArgumentException iax) {
            System.out.println("That, sir, is an illegal lizard.");
        }
        try {
            Lizard lizardKingTwo = new Lizard(null);
        } catch (IllegalArgumentException iax) {
            System.out.println("That, sir, is an illegal lizard.");
        }
        try {
            Lizard lizardKingThree = new Lizard("Kyle");
        } catch (IllegalArgumentException iax) {
            System.out.println("That, sir, is an illegal lizard.");
        }
    }
}
