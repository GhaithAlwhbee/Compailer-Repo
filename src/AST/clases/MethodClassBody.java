package AST.clases;

import AST.MethodPackage.MethodDeclaration;

public class MethodClassBody implements ClassBody{


    MethodDeclaration methodDeclaration;

    public MethodDeclaration getMethodDeclaration() {
        return methodDeclaration;
    }

    public void setMethodDeclaration(MethodDeclaration methodDeclaration) {
        this.methodDeclaration = methodDeclaration;
    }

    @Override
    public String toString() {
        return " "+ methodDeclaration ;
    }

    @Override
    public String toHtml() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(methodDeclaration.toHtml());
        return stringBuilder.toString();
    }
}
