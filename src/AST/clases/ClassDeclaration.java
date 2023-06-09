package AST.clases;

import AST.Statements.Statement;

import java.util.ArrayList;

public class ClassDeclaration {

    String identifier;

    ArrayList<ClassBody> classBodyArrayList = new ArrayList<>();

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ArrayList<ClassBody> getClassBodyArrayList() {
        return classBodyArrayList;
    }

    public void setClassBodyArrayList(ArrayList<ClassBody> classBodyArrayList) {
        this.classBodyArrayList = classBodyArrayList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        stringBuilder.append("Class ");
        stringBuilder.append(identifier + " { ");
        stringBuilder.append("\n");
        for (ClassBody child : this.classBodyArrayList) {
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    public String toHtml() {
        StringBuilder stringBuilder = new StringBuilder();
        for (ClassBody classBody :
                classBodyArrayList) {
            stringBuilder.append(classBody.toHtml());
        }
        return stringBuilder.toString();
    }
}
