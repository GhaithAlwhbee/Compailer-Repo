package Flutter.properties;

import AST.Statements.WidgetStatement;

public class FLOATINGACTIONBUTTON_PROPERTY implements Property{


    String propertyName;
    String propertyValue;

    WidgetStatement widget;


    @Override
    public void setPropertyName(String name) {
        this.propertyName = name;
    }


    public void setPropertyValue(String value) {
        this.propertyValue = value;
    }

    @Override
    public String getPropertyName() {
        return propertyName;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    @Override
    public String toHtml() {
        return null;
    }

    public WidgetStatement getWidget() {
        return widget;
    }

    public void setWidget(WidgetStatement widget) {
        this.widget = widget;
    }


}
