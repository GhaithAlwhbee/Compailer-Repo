package AST.Literals;

public class CharLiteral implements Literal{

    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  "CharLiteral : " + value ;
    }

}
