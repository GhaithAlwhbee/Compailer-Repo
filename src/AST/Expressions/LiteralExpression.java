package AST.Expressions;

import AST.Literals.Literal;

public class LiteralExpression implements Expression{


    Literal literal;

    public Literal getLiteral() {
        return literal;
    }

    public void setLiteral(Literal literal) {
        this.literal = literal;
    }

    @Override
    public String toString() {
        return " "+ literal ;
    }
}
