package AST.Types;

import AST.Types.primitiveType;

public class INT implements primitiveType {

    String int_type ;

    public String getInt_type() {
        return int_type;
    }

    public void setInt_type(String int_type) {
        this.int_type = int_type;
    }

    @Override
    public String toString() {
        return int_type ;
    }
}
