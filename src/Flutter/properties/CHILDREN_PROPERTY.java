package Flutter.properties;

import AST.Statements.WidgetStatement;
import Flutter.Widgets.Widget;

import java.util.ArrayList;

public class CHILDREN_PROPERTY implements Property{


    String propertyName;
    ArrayList<Widget> propertyValue = new ArrayList<>();


    @Override
    public String getPropertyName() {
        return propertyName;
    }

    @Override
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public ArrayList<Widget> getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(ArrayList<Widget> propertyValue) {
        this.propertyValue = propertyValue;
    }


    @Override
    public String toString() {
        return "CHILDREN_PROPERTY{" + propertyName + '\'' +
                ", propertyValue='" + propertyValue + '\'' +
                '}';
    }

    @Override
    public String toHtml() {
        return null;
    }
}
