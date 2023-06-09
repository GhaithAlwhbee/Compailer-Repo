package Flutter.FlutterFunction;

import AST.Statements.Statement;

import java.util.ArrayList;

public class RMS_AnonymousFunction implements AnonymousFunction {

    ArrayList<Statement>statements = new ArrayList<>();

    public ArrayList<Statement> getStatements() {
        return statements;
    }

    public void setStatements(ArrayList<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "RMS_AnonymousFunction{" +
                "statements=" + statements +
                '}';
    }

    @Override
    public String toHtml() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Statement s:statements
             ) {
            stringBuilder.append(s.toHtml());
        }
        return stringBuilder.toString();
    }
}
