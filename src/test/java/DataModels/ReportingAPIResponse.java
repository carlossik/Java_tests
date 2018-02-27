package DataModels;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReportingAPIResponse {
    @JsonProperty("FlightId")
    public FlightId FlightId;

    public FlightId getFlightId ()
    {
        return FlightId;
    }

    public void setFlightId (FlightId FlightId)
    {
        this.FlightId = FlightId;
    }

    @Override
    public String toString()
    {
        return "ReportingAPIResponse [FlightId = "+FlightId+"]";
    }

}
