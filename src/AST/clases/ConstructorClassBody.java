package AST.clases;

import AST.MethodPackage.FormalParameters;
import AST.Statements.Statement;

import java.util.ArrayList;

public class ConstructorClassBody implements ClassBody{


    String identifier;

    FormalParameters formalParameters;

    ArrayList<Statement> statement = new ArrayList<>();

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

    public ArrayList<Statement> getStatement() {
        return statement;
    }

    public void setStatement(ArrayList<Statement> statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {
        return "ConstructorClassBody{" +
                "identifier='" + identifier + '\'' +
                ", formalParameters=" + formalParameters +
                ", statement=" + statement +
                '}';
    }

    @Override
    public String toHtml() {
        return null;
    }
}
