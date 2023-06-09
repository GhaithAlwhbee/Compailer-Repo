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

    public String toHtml()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<!DOCTYPE html>\n");
        stringBuilder.append("<html>\n");
        stringBuilder.append("<head>\n");
        stringBuilder.append("    <title>"+"Material app"+"</title>\n" );
        stringBuilder.append("</head>\n");
        stringBuilder.append("<body>\n");
        for (ClassDeclaration child : this.classDeclaration) {
            stringBuilder.append(child.toHtml());
            stringBuilder.append("\n");
        }

        stringBuilder.append("</body>\n");
        stringBuilder.append("</html>");
        return stringBuilder.toString();
    }
}
