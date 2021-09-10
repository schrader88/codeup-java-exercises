public class Quote {
    public static String randomQuote(){
        int randomNumber = (int) (Math.random()*4) + 1;
        if (randomNumber == 1) {
            return "The best thing about a boolean is even if you are wrong, you are only off by a bit.";
        } else if (randomNumber == 2) {
            return "Without requirements or design, programming is the art of adding bugs to an empty text file.";
        } else if (randomNumber == 3) {
            return "Before software can be reusable it first has to be usable.";
        } else {
            return "The best method for accelerating a computer is the one that boosts it by 9.8 m/s2.";
        }
    }
}
