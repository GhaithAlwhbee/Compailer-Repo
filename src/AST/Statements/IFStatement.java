package AST.Statements;

import AST.Expressions.Expression;

public class IFStatement implements Statement{


    Expression parExpression;

    Statement statement1 , statement2;

    public Expression getParExpression() {
        return parExpression;
    }

    public void setParExpression(Expression parExpression) {
        this.parExpression = parExpression;
    }

    public Statement getStatement1() {
        return statement1;
    }

    @Override
    public String toHtml() {
        return null;
    }

    public void setStatement1(Statement statement1) {
        this.statement1 = statement1;
    }

    public Statement getStatement2() {
        return statement2;
    }

    public void setStatement2(Statement statement2) {
        this.statement2 = statement2;
    }

    @Override
    public String toString() {
//        System.out.printf("IF("+ parExpression + ")"+ "statement1="+statement1 );
//        if(statement2 != null)
//            System.out.printf("Else" + "statement2=" + statement2);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" IF("+ parExpression + ") "+ " statement1= "+statement1);
        if(statement2 != null)
            stringBuilder.append(" Else " + " statement2= " + statement2);
        //stringBuilder.append("\n");

        return stringBuilder.toString();
    }
}
