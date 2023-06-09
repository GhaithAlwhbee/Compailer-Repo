package AST.Expressions;

public class betweenBrackets implements Expression{
    String type;
    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toHtml() {
        return null;
    }

    @Override
    public String getType() {
        return type;
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
