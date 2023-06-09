package AST.Statements;

import Flutter.Widgets.Widget;
import Flutter.properties.Property;

import java.util.ArrayList;

public class WidgetStatement implements Statement{

    Widget widget;

    public Widget getWidget() {
        return widget;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    @Override
    public String toString() {
        return "WidgetStatement{" +
                "widget=" + widget +
                '}';
    }


    @Override
    public String toHtml() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(widget.toHtml());
        return stringBuilder.toString();
    }

}
