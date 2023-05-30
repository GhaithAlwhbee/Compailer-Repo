package AST.Statements;

import AST.Expressions.Expression;
import AST.localVariableDeclaration;

public class FORStatement implements Statement{

    localVariableDeclaration localVariable;
    Expression ex1 , ex2;
    Statement statement;

    public localVariableDeclaration getLocalVariable() {
        return localVariable;
    }

    public void setLocalVariable(localVariableDeclaration localVariable) {
        this.localVariable = localVariable;
    }

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

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {
        return "FOR(" + localVariable +';'+ ex1 + ';' + ex2 +')'+"\n"+statement ;
    }
}
