package Flutter.properties;

public class PADDING_PROPERTY implements Property{

    String propertyName;
    String propertyValue;


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


}
