package Flutter.Widgets;

import Flutter.properties.Property;

import java.util.ArrayList;

public class CENTER_Widget implements Widget{



    ArrayList<Property> properties = new ArrayList<>();

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }


    @Override
    public String toString() {
        return "\nCENTER_Widget{" +
                "properties=" + properties +
                '}';
    }

    @Override
    public String toHtml() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Property p :properties
        ) {
            stringBuilder.append(p.toHtml()+"\n");

        }
        return stringBuilder.toString();
    }


}
