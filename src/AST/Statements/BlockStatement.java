package AST.Statements;

import java.util.ArrayList;

public class BlockStatement implements Statement{

    ArrayList<Statement> statement = new ArrayList<>();

    public ArrayList<Statement> getStatement() {
        return statement;
    }

    public void setStatement(ArrayList<Statement> statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        for (Statement s:statement) {
            stringBuilder.append("statement : "+ s);
            stringBuilder.append("\n");
        }
        stringBuilder.append("}");


        return stringBuilder.toString();
    }
}
