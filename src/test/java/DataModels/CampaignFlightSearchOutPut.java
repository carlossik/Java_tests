package DataModels;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CampaignFlightSearchOutPut {

    @JsonProperty("count")
    private String count;

    @JsonProperty("items")
    private CampaigFlightSearchItems[] items;

    public String getCount ()
    {
        return count;
    }

    public void setCount (String count)
    {
        this.count = count;
    }

    public CampaigFlightSearchItems[] getItems ()
    {
        return items;
    }

    public void setItems (CampaigFlightSearchItems[] items)
    {
        this.items = items;
    }

    @Override
    public String toString()
    {
        return "ClassCampaignFlightSearchOutPut [count = "+count+", items = "+items+"]";
    }
}