package AST.Statements;

import AST.localVariableDeclaration;

public class VariableDeclarationStatement implements Statement{

    localVariableDeclaration localVariable;

    public localVariableDeclaration getLocalVariable() {
        return localVariable;
    }

    public void setLocalVariable(localVariableDeclaration localVariable) {
        this.localVariable = localVariable;
    }

    @Override
    public String toString() {
        return  localVariable + " ";
    }

    @Override
    public String toHtml() {
        return null;
    }
}
