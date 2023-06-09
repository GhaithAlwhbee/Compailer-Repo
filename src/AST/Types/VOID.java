package AST.Types;

public class VOID implements primitiveType{


    String void_type ;

    @Override
    public void setType(String type) {
        this.void_type = type;
    }

    @Override
    public String getType() {
        return void_type;
    }

    @Override
    public String toString() {
        return " " +void_type +" " ;
    }

}
