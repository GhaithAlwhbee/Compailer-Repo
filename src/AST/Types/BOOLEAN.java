package AST.Types;

import AST.Types.primitiveType;

public class BOOLEAN implements primitiveType {

    String bool_type ;

    public String getBool() {
        return bool_type;
    }

    public void setBool(String bool) {
        this.bool_type = bool;
    }

    @Override
    public String toString() {
        return " "+bool_type+" ";
    }
}
