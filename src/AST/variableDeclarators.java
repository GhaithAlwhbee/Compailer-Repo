package AST;

import java.util.ArrayList;
import java.util.List;

public class variableDeclarators {

    List<variableDeclarator> variableDeclaratorList = new ArrayList<variableDeclarator>();

    public List<variableDeclarator> getVariableDeclaratorList() {
        return variableDeclaratorList;
    }

    public void setVariableDeclaratorList(List<variableDeclarator> variableDeclaratorList) {
        this.variableDeclaratorList = variableDeclaratorList;
    }

    @Override
    public String toString() {
        return  variableDeclaratorList + ""  ;
    }
}
