package AST.Expressions;

public class Compare implements Expression{
    String type;
    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toHtml() {
        return null;
    }

    Expression ex1,ex2;
    String compareElement;

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

    public String getCompareElement() {
        return compareElement;
    }

    public void setCompareElement(String compareElement) {
        this.compareElement = compareElement;
    }

    @Override
    public String toString() {
        return  "Compare { "+ex1 + compareElement + ex2 +" }";
    }
}
