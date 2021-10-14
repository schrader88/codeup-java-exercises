//================================= WARM UP
//        In `codeup-java-exercises`, create a class `JavaDrills`, with the following:
//        Create a public static method, `flipOuterCase`, that takes in a string and returns the string
//        with the case reversed for the first and last letters. Assume the input will be three or more characters long.
//        Example inputs and expected outputs...
//        System.out.println(flipOuterCase(“cat”)); // CaT
//        System.out.println(flipOuterCase(“CaT”)); // cat
//        System.out.println(flipOuterCase(“cAt”)); // CAT
//        System.out.println(flipOuterCase(“caT”)); // Cat

public class JavaDrills {
    public static String flipOuterCase(String str) {

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            boolean firstOrLastChar = chars[i] == chars[0] || chars[i] == chars[chars.length - 1];
            if (Character.isUpperCase(c)) {
                if (firstOrLastChar) {
                    chars[i] = Character.toLowerCase(c);
                }
            } else if (Character.isLowerCase(c)) {
                if (firstOrLastChar) {
                    chars[i] = Character.toUpperCase(c);
                }
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(flipOuterCase("cat")); // CaT
        System.out.println(flipOuterCase("CaT")); // cat
        System.out.println(flipOuterCase("cAt")); // CAT
        System.out.println(flipOuterCase("caT")); // Cat
    }
}
