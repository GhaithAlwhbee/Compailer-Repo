package AST.Expressions;

public class Postfix implements Expression{
    @Override
    public String getType() {
        return null;
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
}
