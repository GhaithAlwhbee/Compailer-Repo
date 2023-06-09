package AST;

import AST.Types.primitiveType;
import AST.clases.ClassBody;

public class localVariableDeclaration{


    primitiveType primitive;
    variableDeclarators variableDeclaratorsObject ;

    public primitiveType getPrimitive() {
        return primitive;
    }

    public void setPrimitive(primitiveType primitive) {
        this.primitive = primitive;
    }

    public variableDeclarators getVariableDeclaratorsObject() {
        return variableDeclaratorsObject;
    }

    public void setVariableDeclaratorsObject(variableDeclarators variableDeclaratorsObject) {
        this.variableDeclaratorsObject = variableDeclaratorsObject;
    }

    @Override
    public String toString() {
        return "localVariable : " + primitive +" "+ variableDeclaratorsObject ;
    }

    public String toHtml() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("localVariable .tohtml");

        return stringBuilder.toString();
    }

}
