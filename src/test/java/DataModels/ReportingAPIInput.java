package DataModels;

public class ReportingAPIInput {
    private int flightId;

    private boolean locked;

    public int getFlightId ()
    {
        return flightId;
    }

    public void setFlightId (int flightId)
    {
        this.flightId = flightId;
    }

    public boolean getLocked ()
    {
        return locked;
    }

    public void setLocked (boolean locked)
    {
        this.locked = locked;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [flightId = "+flightId+", locked = "+locked+"]";
    }
}
