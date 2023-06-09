package Flutter.properties;

public class TEXT_PROPERTY implements Property{


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
    public String toString() {
        return "TEXT_PROPERTY{" +
                "propertyName='" + propertyName + '\'' +
                ", propertyValue='" + propertyValue + '\'' +
                '}';
    }

    public String toHtml()
    {
        return propertyValue.replace("\"","");
    }
}
