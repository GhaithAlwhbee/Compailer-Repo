package Flutter.Widgets;

import Flutter.properties.CHILD_PROPERTY;
import Flutter.properties.ONPRESSED_PROPERTY;
import Flutter.properties.Property;

import java.util.ArrayList;

public class ELEVATEDBUTTON_Widget implements Widget{

    ArrayList<Property> properties = new ArrayList<>();

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }


    @Override
    public String toString() {
        return "\nELEVATEDBUTTON_Widget{" +
                "properties=" + properties +
                '}';
    }


    String functionName,functionBody;
    Property childProperty;
    Property onPressedProperty;

    @Override
    public String toHtml() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Property p :properties
        ) {
            if(p instanceof CHILD_PROPERTY)
            {
                //childProperty = p;
                 functionName = p.toHtml();
                 functionName=functionName.replace("\"","");
                functionName=functionName.replace(" ","");
            }
            else if (p instanceof ONPRESSED_PROPERTY)
            {
                //onPressedProperty = p;
                 functionBody = p.toHtml();
            }

        }

        stringBuilder.append("<button onclick=\""+functionName+"()\">"+functionName+"</button>\n");
        //stringBuilder.append("<button onclick=\""+functionName+"()\">"+functionName+"</button>\n");
        stringBuilder.append("<script>\n");
        stringBuilder.append("function "+functionName+"(){\n"+functionBody+"\n}\n");
        stringBuilder.append("</script>");
        return stringBuilder.toString();

    }

}
