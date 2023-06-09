package AST.Expressions;

import AST.Statements.Statement;

public class IdentifierExpression implements Expression{

    String type;
    String value;

    Expression expression;

    public void setType(String type)
    {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
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
        else stringBuilder.append(" } " );

        return stringBuilder.toString();
    }

    @Override
    public String toHtml() {
        return value;
    }
}
