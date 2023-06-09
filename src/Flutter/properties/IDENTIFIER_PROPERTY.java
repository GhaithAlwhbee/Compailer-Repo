package Flutter.properties;

import AST.Expressions.Expression;

public class IDENTIFIER_PROPERTY implements Property{

    String propertyName;

    Expression expression;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public void setPropertyName(String name) {
        propertyName = name;
    }

    @Override
    public String getPropertyName() {
        return propertyName;
    }

    @Override
    public String toString() {
        return "IDENTIFIER_PROPERTY{" +
                "propertyName='" + propertyName + '\'' +
                ", expression=" + expression +
                '}';
    }

    @Override
    public String toHtml() {
        return "IDENTIFIER_PROPERTY.toHtml";
    }
}
