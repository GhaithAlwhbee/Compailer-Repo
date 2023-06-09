package AST.Statements;

import AST.Expressions.Expression;

public class ExpressionStatement implements Statement{

    Expression expression ;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "ExpressionStatement=" + expression ;
    }

    @Override
    public String toHtml() {
        StringBuilder stringBuilder = new StringBuilder();

            stringBuilder.append(expression.toHtml());
        return stringBuilder.toString();
    }
}
