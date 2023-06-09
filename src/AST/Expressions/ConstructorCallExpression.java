package AST.Expressions;

import Flutter.properties.Property;

import java.util.ArrayList;

public class ConstructorCallExpression implements Expression{

    String identifier;

    ArrayList<Property> properties = new ArrayList<>();

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public void setType(String type) {

    }

    @Override
    public String toString() {
        return "ConstructorCallExpression{" +
                "identifier='" + identifier + '\'' +
                ", properties=" + properties +
                '}';
    }

    @Override
    public String toHtml() {
        return "ConstructorCallExpression.toHtml";
    }
}
