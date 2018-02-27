package DataModels;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties
public class VcpmPerformanceValuesInCost {
    private Values values;

    public Values getValues ()
    {
        return values;
    }

    public void setValues (Values values)
    {
        this.values = values;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [values = "+values+"]";
    }
}
