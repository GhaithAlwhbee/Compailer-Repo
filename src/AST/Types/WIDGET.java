package AST.Types;

public class WIDGET implements primitiveType{

    String Widget_type ;


    @Override
    public void setType(String type) {
        this.Widget_type = type;
    }

    @Override
    public String getType() {
        return Widget_type;
    }

    @Override
    public String toString() {
        return " " +Widget_type +" ";
    }
}
