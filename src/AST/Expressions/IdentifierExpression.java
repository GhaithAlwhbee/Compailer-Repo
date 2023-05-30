package AST.Expressions;

import AST.Statements.Statement;

public class IdentifierExpression implements Expression{

    String value;

    Expression expression;

    @Override
    public String getType() {
        return null;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IdentifierExpression{ ");
        stringBuilder.append("value= " + value );
        if(expression!=null)
        {
            stringBuilder.append(" , expression=" + expression + " }");
        }

        return stringBuilder.toString();
    }
}
