package AST;

import AST.Expressions.Expression;

public class variableDeclarator {

    String identifier;

    Expression expression;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return identifier +" = " + expression ;
    }
}
