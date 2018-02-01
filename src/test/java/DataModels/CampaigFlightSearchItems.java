package DataModels;

public class CampaigFlightSearchItems {
    private String operationalUnitId;

    private CampaigFlightSearchRoot root;

    private String advertiserAccountId;

    private String operationsBreakdownDeeplink;

    private String agencyId;

    private String advertiserId;

    public String getOperationalUnitId ()
    {
        return operationalUnitId;
    }

    public void setOperationalUnitId (String operationalUnitId)
    {
        this.operationalUnitId = operationalUnitId;
    }

    public CampaigFlightSearchRoot getRoot ()
    {
        return root;
    }

    public void setRoot (CampaigFlightSearchRoot root)
    {
        this.root = root;
    }

    public String getAdvertiserAccountId ()
    {
        return advertiserAccountId;
    }

    public void setAdvertiserAccountId (String advertiserAccountId)
    {
        this.advertiserAccountId = advertiserAccountId;
    }

    public String getOperationsBreakdownDeeplink ()
    {
        return operationsBreakdownDeeplink;
    }

    public void setOperationsBreakdownDeeplink (String operationsBreakdownDeeplink)
    {
        this.operationsBreakdownDeeplink = operationsBreakdownDeeplink;
    }

    public String getAgencyId ()
    {
        return agencyId;
    }

    public void setAgencyId (String agencyId)
    {
        this.agencyId = agencyId;
    }

    public String getAdvertiserId ()
    {
        return advertiserId;
    }

    public void setAdvertiserId (String advertiserId)
    {
        this.advertiserId = advertiserId;
    }

    @Override
    public String toString()
    {
        return "ClassCampaigFlightSearchItems [operationalUnitId = "+operationalUnitId+", root = "+root+", advertiserAccountId = "+advertiserAccountId+", operationsBreakdownDeeplink = "+operationsBreakdownDeeplink+", agencyId = "+agencyId+", advertiserId = "+advertiserId+"]";
    }
}