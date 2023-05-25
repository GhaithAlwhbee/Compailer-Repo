package AST;

import AST.Statements.Statement;

import java.util.ArrayList;
import java.util.List;

public class Program {

    ArrayList <Statement> statementList = new ArrayList<>();

    public ArrayList<Statement> getStatement() {
        return statementList;
    }

    public void setStatement(ArrayList<Statement> statement) {
        this.statementList = statement;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Statement child : this.statementList) {
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
