package Flutter.Widgets;

import Flutter.properties.Property;

public class NAVIGATOR_Widget implements Widget{
    Widget widget;

    public Widget getWidget() {
        return widget;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    @Override
    public String toString() {
        return "\nNAVIGATOR_Widget{" +
                "widget=" + widget +
                '}';
    }

    @Override
    public String toHtml() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("window.location.href = \""+widget.toHtml()+".html\""+";");
        return stringBuilder.toString();
    }
}
