package AST.Expressions;

public class betweenBrackets implements Expression{
    @Override
    public String getType() {
        return null;
    }

    Expression ex1 ;

    public Expression getEx1() {
        return ex1;
    }

    public void setEx1(Expression ex1) {
        this.ex1 = ex1;
    }

    @Override
    public String toString() {
        return "( " + ex1 + " )";
    }
}
