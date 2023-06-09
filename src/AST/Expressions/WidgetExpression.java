package AST.Expressions;

import AST.Statements.Statement;
import AST.Statements.WidgetStatement;
import Flutter.Widgets.Widget;

public class WidgetExpression implements Expression{


    Widget widgetStatement ;

    public Widget getWidgetStatement() {
        return widgetStatement;
    }

    public void setWidgetStatement(Widget widgetStatement) {
        this.widgetStatement = widgetStatement;
    }

    @Override
    public String getType() {
        return "Widget";
    }

    @Override
    public void setType(String type) {

    }

    @Override
    public String toString() {
        return "WidgetExpression{" +
                "widgetStatement=" + widgetStatement +
                '}';
    }

    public String toHtml() {
        StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(widgetStatement.toHtml());
        return stringBuilder.toString();
    }

    

}
