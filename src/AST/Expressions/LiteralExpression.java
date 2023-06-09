package AST.Expressions;

import AST.Literals.Literal;

public class LiteralExpression implements Expression{


    Literal literal;

    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Literal getLiteral() {
        return literal;
    }

    public void setLiteral(Literal literal) {
        this.literal = literal;
    }

    @Override
    public String toString() {
        return "LiteralExpression: { type: "+type +" "+ literal+ " }";
    }

    @Override
    public String toHtml() {
        return null;
    }
}
