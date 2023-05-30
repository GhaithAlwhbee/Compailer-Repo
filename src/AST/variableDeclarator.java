package AST;

import AST.Expressions.Expression;
import AST.Statements.Statement;

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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(identifier);
        if(expression != null){
            stringBuilder.append(" = "+expression);
        }
        return stringBuilder.toString();
    }
}
