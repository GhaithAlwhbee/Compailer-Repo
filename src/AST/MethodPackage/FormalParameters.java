package AST.MethodPackage;

import AST.Statements.Statement;

import java.util.ArrayList;

public class FormalParameters {

    ArrayList<FormalParameter>formalParameterArrayList = new ArrayList<>();

    public ArrayList<FormalParameter> getFormalParameterArrayList() {
        return formalParameterArrayList;
    }

    public void setFormalParameterArrayList(ArrayList<FormalParameter> formalParameterArrayList) {
        this.formalParameterArrayList = formalParameterArrayList;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FormalParameters{");
        for (FormalParameter child : this.formalParameterArrayList) {
            stringBuilder.append(child);
            //stringBuilder.append("\n");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();

    }
}
