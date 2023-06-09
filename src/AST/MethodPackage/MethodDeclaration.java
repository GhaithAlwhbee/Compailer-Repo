package AST.MethodPackage;

import AST.Statements.Statement;
import AST.Types.primitiveType;
import AST.clases.ClassBody;

import java.util.ArrayList;

public class MethodDeclaration {


    primitiveType prim ;

    String identifier;

    FormalParameters formalParameters;

    ArrayList<Statement> statement = new ArrayList<>();

    public ArrayList<Statement> getStatement() {
        return statement;
    }

    public void setStatement(ArrayList<Statement> statement) {
        this.statement = statement;
    }

    public primitiveType getPrim() {
        return prim;
    }

    public void setPrim(primitiveType prim) {
        this.prim = prim;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public FormalParameters getFormalParameters() {
        return formalParameters;
    }

    public void setFormalParameters(FormalParameters formalParameters) {
        this.formalParameters = formalParameters;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MethodDeclaration {");
        stringBuilder.append("\n");
        stringBuilder.append(prim + identifier + "(" + formalParameters + ")");
        stringBuilder.append("\n");
        stringBuilder.append("statements :");
        stringBuilder.append("\n{\n");
        for (Statement child : this.statement) {
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public String toHtml() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Statement statement1 :
                statement) {
            stringBuilder.append(statement1.toHtml());
        }
        return stringBuilder.toString();
    }

}
