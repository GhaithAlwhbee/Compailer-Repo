package SemanticAnalysis;

public class Symbol {

    String name;
    String type;

    String kind;
    int scope;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getScope() {
        return scope;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }

    // other attributes such as memory location can be added here
    Symbol(String name, String type,String kind, int scope) {
        this.name = name;
        this.type = type;
        this.kind = kind;
        this.scope = scope;
    }
}
