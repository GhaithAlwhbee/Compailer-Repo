package AST.Types;

public class STRING implements primitiveType{

    String string_type ;
    @Override
    public void setType(String type) {
        this.string_type = type;
    }

    @Override
    public String getType() {
        return string_type;
    }

    @Override
    public String toString() {
        return " " +string_type +" " ;
    }
}
