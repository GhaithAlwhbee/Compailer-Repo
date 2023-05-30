package AST.Types;

import AST.Types.primitiveType;

public class INT implements primitiveType {

    String int_type ;

    @Override
    public void setType(String type) {
        this.int_type = type;
    }

    @Override
    public String getType() {
        return int_type;
    }

    @Override
    public String toString() {
        return " " +int_type +" " ;
    }
}
