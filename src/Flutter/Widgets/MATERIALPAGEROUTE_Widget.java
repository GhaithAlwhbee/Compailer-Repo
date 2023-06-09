package Flutter.Widgets;

import Flutter.properties.Property;

import java.util.ArrayList;

public class MATERIALPAGEROUTE_Widget implements Widget{

    ArrayList<Property> properties = new ArrayList<>();

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }


    @Override
    public String toString() {
        return "MATERIALPAGEROUTE_Widget{" +
                "properties=" + properties +
                '}';
    }

    @Override
    public String toHtml() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Property p :properties
        ) {
            stringBuilder.append(p.toHtml());
        }
        return stringBuilder.toString();
    }


}
