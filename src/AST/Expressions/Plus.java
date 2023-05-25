package AST.Expressions;

public class Plus implements Expression{

    Expression ex1 , ex2 ;

    public Expression getEx1() {
        return ex1;
    }

    public void setEx1(Expression ex1) {
        this.ex1 = ex1;
    }

    public Expression getEx2() {
        return ex2;
    }

    public void setEx2(Expression ex2) {
        this.ex2 = ex2;
    }

    @Override
    public String toString() {
        return  ex1 + " + " + ex2 ;
    }
}
