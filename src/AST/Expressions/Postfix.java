package AST.Expressions;

public class Postfix implements Expression{

    String type;
    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    Expression ex1  ;

    String postfixSymbol;

    public String getPostfixSymbol() {
        return postfixSymbol;
    }

    public void setPostfixSymbol(String postfixSymbol) {
        this.postfixSymbol = postfixSymbol;
    }

    public Expression getEx1() {
        return ex1;
    }

    public void setEx1(Expression ex1) {
        this.ex1 = ex1;
    }

    @Override
    public String toString() {
        return  ex1 +" Postfix : " + postfixSymbol ;
    }

    @Override
    public String toHtml() {
        return null;
    }
}
