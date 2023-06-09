package AST.Expressions;

public interface Expression {


    String getType();
    void setType(String type);

    String toHtml();

}

