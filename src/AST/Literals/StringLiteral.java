package AST.Literals;

public class StringLiteral implements Literal{

    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  "StringLiteral : " + value ;
    }

}
