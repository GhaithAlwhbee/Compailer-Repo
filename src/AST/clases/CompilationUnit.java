package AST.clases;

import java.util.ArrayList;

public class CompilationUnit {

    ArrayList<ClassDeclaration> classDeclaration = new ArrayList<>();

    public ArrayList<ClassDeclaration> getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(ArrayList<ClassDeclaration> classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CompilationUnit {");
        for (ClassDeclaration child : this.classDeclaration) {
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
