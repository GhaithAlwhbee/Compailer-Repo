package AST.Expressions;

public class Return implements Expression{

    String type;

    Expression expression ;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Return { "  + expression +" }";
    }

    @Override
    public String toHtml() {
        return expression.toHtml();
    }
}
