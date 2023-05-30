package AST.Types;

import AST.Types.primitiveType;

public class BOOLEAN implements primitiveType {

    String bool_type ;

    @Override
    public void setType(String type) {
        this.bool_type = type;
    }

    @Override
    public String getType() {
        return bool_type;
    }

    @Override
    public String toString() {
        return " "+bool_type+" ";
    }
}
