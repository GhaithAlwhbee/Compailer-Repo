package Flutter.properties;

import AST.Statements.WidgetStatement;
import Flutter.Widgets.Widget;

public class TITLE_PROPERTY implements Property{

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
        return "TITLE_PROPERTY{" +
                "propertyName='" + propertyName + '\'' +
                ", propertyValue='" + propertyValue + '\'' +
                '}';
    }

    public String toHtml()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(propertyValue.toHtml());
        return stringBuilder.toString();
    }
}
