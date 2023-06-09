package Flutter.FlutterFunction;

import AST.Expressions.Expression;

public class ROS_AnonymousFunction implements AnonymousFunction {

    Expression expression ;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "() => " +
                "expression= " + expression;
    }

    @Override
    public String toHtml() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(expression.toHtml());
        return stringBuilder.toString();
    }
}
