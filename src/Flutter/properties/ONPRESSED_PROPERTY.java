package Flutter.properties;

import Flutter.FlutterFunction.AnonymousFunction;

public class ONPRESSED_PROPERTY implements Property{

    String propertyName;
    AnonymousFunction propertyValue;


    @Override
    public void setPropertyName(String name) {
        this.propertyName = name;
    }

    public void setPropertyValue(AnonymousFunction value) {
        this.propertyValue = value;
    }

    @Override
    public String getPropertyName() {
        return propertyName;
    }

    public AnonymousFunction getPropertyValue() {
        return propertyValue;
    }

    @Override
    public String toString() {
        return "ONPRESSED_PROPERTY{" +
                "propertyName='" + propertyName + '\'' +
                ", propertyValue='" + propertyValue + '\'' +
                '}';
    }

    @Override
    public String toHtml() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(propertyValue.toHtml());
        return stringBuilder.toString();
    }
}
