package AST.Expressions;

public class IdentifierExpression implements Expression{


    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  "IdentifierExpression :" + value ;
    }


}
