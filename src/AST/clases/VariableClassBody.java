package AST.clases;

import AST.localVariableDeclaration;

public class VariableClassBody implements ClassBody {

    localVariableDeclaration localVar;

    public localVariableDeclaration getLocalVar() {
        return localVar;
    }

    public void setLocalVar(localVariableDeclaration localVar) {
        this.localVar = localVar;
    }


    @Override
    public String toString() {
        return "VariableClassBody{" +
                "localVar=" + localVar +
                '}';
    }
}
