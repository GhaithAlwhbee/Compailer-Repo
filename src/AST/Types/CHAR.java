package AST.Types;

public class CHAR implements primitiveType{

    String char_type ;

    @Override
    public void setType(String type) {
        this.char_type = type;
    }

    @Override
    public String getType() {
        return char_type;
    }

    @Override
    public String toString() {
        return " " +char_type +" " ;
    }

}
