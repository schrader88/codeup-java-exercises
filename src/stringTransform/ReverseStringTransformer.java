package stringTransform;

public class ReverseStringTransformer extends StringTransformer{
    @Override
    public String transform() {
        String input = str;
        StringBuilder input1 = new StringBuilder();

        input1.append(input);
        input1.reverse();

        return input1.toString();
    }

    public ReverseStringTransformer(String str) {
        super(str);
    }
}
