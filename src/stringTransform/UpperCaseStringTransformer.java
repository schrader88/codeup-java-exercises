package stringTransform;

public class UpperCaseStringTransformer extends StringTransformer{

    @Override
    public String transform() {
        return str.toUpperCase();
    }

    public UpperCaseStringTransformer(String str) {
        super(str);
    }
}
