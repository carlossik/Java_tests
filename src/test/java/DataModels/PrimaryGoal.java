package DataModels;


public class PrimaryGoal
{
    private String id;

    private String weight;

    private String performanceGoalType;

    private String value;

    private String displayOrder;

    private String decimalPlaces;

    private String displayFormatType;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getWeight ()
    {
        return weight;
    }

    public void setWeight (String weight)
    {
        this.weight = weight;
    }

    public String getPerformanceGoalType ()
    {
        return performanceGoalType;
    }

    public void setPerformanceGoalType (String performanceGoalType)
    {
        this.performanceGoalType = performanceGoalType;
    }

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    public String getDisplayOrder ()
    {
        return displayOrder;
    }

    public void setDisplayOrder (String displayOrder)
    {
        this.displayOrder = displayOrder;
    }

    public String getDecimalPlaces ()
    {
        return decimalPlaces;
    }

    public void setDecimalPlaces (String decimalPlaces)
    {
        this.decimalPlaces = decimalPlaces;
    }

    public String getDisplayFormatType ()
    {
        return displayFormatType;
    }

    public void setDisplayFormatType (String displayFormatType)
    {
        this.displayFormatType = displayFormatType;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", weight = "+weight+", performanceGoalType = "+performanceGoalType+", value = "+value+", displayOrder = "+displayOrder+", decimalPlaces = "+decimalPlaces+", displayFormatType = "+displayFormatType+"]";
    }
}

