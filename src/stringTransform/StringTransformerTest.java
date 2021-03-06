package stringTransform;

public class StringTransformerTest {
    public static void main(String[] args) {
        StringTransformer stringOne = new UpperCaseStringTransformer("string one");
        StringTransformer stringTwo = new ReverseStringTransformer("string two");

//        System.out.println(stringOne.transform());
//        System.out.println(stringTwo.transform());

        StringTransformer[] tester = {stringOne, stringTwo};

        for (StringTransformer string : tester) {
            System.out.println(string.transform());
        }

    }
}
