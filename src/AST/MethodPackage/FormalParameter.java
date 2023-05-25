package AST.MethodPackage;

import AST.Types.primitiveType;

public class FormalParameter {


    primitiveType primitive ;

    String identifier ;

    public primitiveType getP() {
        return primitive;
    }

    public void setP(primitiveType p) {
        this.primitive = p;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "FormalParameter{ " + primitive + identifier + " }";
    }
}
