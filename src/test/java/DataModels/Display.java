package DataModels;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Display {
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String GROUP_M;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String MRC;

    public String getGROUP_M ()
    {
        return GROUP_M;
    }

    public void setGROUP_M (String GROUP_M)
    {
        this.GROUP_M = GROUP_M;
    }

    public String getMRC ()
    {
        return MRC;
    }

    public void setMRC (String MRC)
    {
        this.MRC = MRC;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [GROUP_M = "+GROUP_M+", MRC = "+MRC+"]";
    }
}
