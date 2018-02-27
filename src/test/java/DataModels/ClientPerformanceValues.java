package DataModels;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class ClientPerformanceValues {
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String ROAS;

    @JsonIgnoreProperties(ignoreUnknown = true)
    private String ECPC;

    @JsonIgnoreProperties(ignoreUnknown = true)
    private String ECPCV;

    @JsonIgnoreProperties(ignoreUnknown = true)
    private String ECPA;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String ECPM;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String CTR;

    public String getROAS ()
    {
        return ROAS;
    }

    public void setROAS (String ROAS)
    {
        this.ROAS = ROAS;
    }

    public String getECPC ()
    {
        return ECPC;
    }

    public void setECPC (String ECPC)
    {
        this.ECPC = ECPC;
    }

    public String getECPCV ()
    {
        return ECPCV;
    }

    public void setECPCV (String ECPCV)
    {
        this.ECPCV = ECPCV;
    }

    public String getECPA ()
    {
        return ECPA;
    }

    public void setECPA (String ECPA)
    {
        this.ECPA = ECPA;
    }

    public String getECPM ()
    {
        return ECPM;
    }

    public void setECPM (String ECPM)
    {
        this.ECPM = ECPM;
    }

    public String getCTR ()
    {
        return CTR;
    }

    public void setCTR (String CTR)
    {
        this.CTR = CTR;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ROAS = "+ROAS+", ECPC = "+ECPC+", ECPCV = "+ECPCV+", ECPA = "+ECPA+", ECPM = "+ECPM+", CTR = "+CTR+"]";
    }
}
