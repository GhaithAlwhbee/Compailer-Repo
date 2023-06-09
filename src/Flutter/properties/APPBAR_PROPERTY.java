package Flutter.properties;

import AST.Statements.WidgetStatement;
import Flutter.Widgets.Widget;

public class APPBAR_PROPERTY implements Property{

    String propertyName;
    Widget propertyValue;


    @Override
    public void setPropertyName(String name) {
        this.propertyName = name;
    }


    public void setPropertyValue(Widget value) {
        this.propertyValue = value;
    }

    @Override
    public String getPropertyName() {
        return propertyName;
    }


    public Widget getPropertyValue() {
        return propertyValue;
    }

    @Override
    public String toString() {
        return "APPBAR_PROPERTY{" +
                "propertyName='" + propertyName + '\'' +
                ", propertyValue='" + propertyValue + '\'' +
                '}';
    }

    public String toHtml()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<h1>");
        stringBuilder.append(propertyValue.toHtml());
        stringBuilder.append("</h1>\n");
        return stringBuilder.toString();
    }
}
