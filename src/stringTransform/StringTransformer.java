package stringTransform;

abstract class StringTransformer {
    protected String str;

    abstract public String transform();

    public StringTransformer() {
    }

    public StringTransformer(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
