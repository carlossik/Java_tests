package DataModels;

public class CampaignFlightSearchInput
{
    private String[] advertiserIds;

    private MaxEndDate maxEndDate;

    private String traderUserId;

    private String onlyWithEmptyGoalOrUnknownTrader;

    private String[] ids;

    private MinStartDate minStartDate;

    private String[] bookingCodes;

    private String agencyId;

    private String[] campaignIds;

    private String accountManagerUserId;

    private String bookingCode;

    private String activeOnly;

    private String[] salesUserIds;

    private String salesUserId;

    private String[] traderUserIds;

    private MaxStartDate maxStartDate;

    private String searchText;

    private String campaignReportDay;

    private MinEndDate minEndDate;

    private String advertiserId;

    public String[] getAdvertiserIds ()
    {
        return advertiserIds;
    }

    public void setAdvertiserIds (String[] advertiserIds)
    {
        this.advertiserIds = advertiserIds;
    }

    public MaxEndDate getMaxEndDate ()
    {
        return maxEndDate;
    }

    public void setMaxEndDate (MaxEndDate maxEndDate)
    {
        this.maxEndDate = maxEndDate;
    }

    public String getTraderUserId ()
    {
        return traderUserId;
    }

    public void setTraderUserId (String traderUserId)
    {
        this.traderUserId = traderUserId;
    }

    public String getOnlyWithEmptyGoalOrUnknownTrader ()
    {
        return onlyWithEmptyGoalOrUnknownTrader;
    }

    public void setOnlyWithEmptyGoalOrUnknownTrader (String onlyWithEmptyGoalOrUnknownTrader)
    {
        this.onlyWithEmptyGoalOrUnknownTrader = onlyWithEmptyGoalOrUnknownTrader;
    }

    public String[] getIds ()
    {
        return ids;
    }

    public void setIds (String[] ids)
    {
        this.ids = ids;
    }

    public MinStartDate getMinStartDate ()
    {
        return minStartDate;
    }

    public void setMinStartDate (MinStartDate minStartDate)
    {
        this.minStartDate = minStartDate;
    }

    public String[] getBookingCodes ()
    {
        return bookingCodes;
    }

    public void setBookingCodes (String[] bookingCodes)
    {
        this.bookingCodes = bookingCodes;
    }

    public String getAgencyId ()
    {
        return agencyId;
    }

    public void setAgencyId (String agencyId)
    {
        this.agencyId = agencyId;
    }

    public String[] getCampaignIds ()
    {
        return campaignIds;
    }

    public void setCampaignIds (String[] campaignIds)
    {
        this.campaignIds = campaignIds;
    }

    public String getAccountManagerUserId ()
    {
        return accountManagerUserId;
    }

    public void setAccountManagerUserId (String accountManagerUserId)
    {
        this.accountManagerUserId = accountManagerUserId;
    }

    public String getBookingCode ()
    {
        return bookingCode;
    }

    public void setBookingCode (String bookingCode)
    {
        this.bookingCode = bookingCode;
    }

    public String getActiveOnly ()
    {
        return activeOnly;
    }

    public void setActiveOnly (String activeOnly)
    {
        this.activeOnly = activeOnly;
    }

    public String[] getSalesUserIds ()
    {
        return salesUserIds;
    }

    public void setSalesUserIds (String[] salesUserIds)
    {
        this.salesUserIds = salesUserIds;
    }

    public String getSalesUserId ()
    {
        return salesUserId;
    }

    public void setSalesUserId (String salesUserId)
    {
        this.salesUserId = salesUserId;
    }

    public String[] getTraderUserIds ()
    {
        return traderUserIds;
    }

    public void setTraderUserIds (String[] traderUserIds)
    {
        this.traderUserIds = traderUserIds;
    }

    public MaxStartDate getMaxStartDate ()
    {
        return maxStartDate;
    }

    public void setMaxStartDate (MaxStartDate maxStartDate)
    {
        this.maxStartDate = maxStartDate;
    }

    public String getSearchText ()
    {
        return searchText;
    }

    public void setSearchText (String searchText)
    {
        this.searchText = searchText;
    }

    public String getCampaignReportDay ()
    {
        return campaignReportDay;
    }

    public void setCampaignReportDay (String campaignReportDay)
    {
        this.campaignReportDay = campaignReportDay;
    }

    public MinEndDate getMinEndDate ()
    {
        return minEndDate;
    }

    public void setMinEndDate (MinEndDate minEndDate)
    {
        this.minEndDate = minEndDate;
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
        return "ClassCampaignFlightSearchInput [advertiserIds = "+advertiserIds+", maxEndDate = "+maxEndDate+", traderUserId = "+traderUserId+", onlyWithEmptyGoalOrUnknownTrader = "+onlyWithEmptyGoalOrUnknownTrader+", ids = "+ids+", minStartDate = "+minStartDate+", bookingCodes = "+bookingCodes+", agencyId = "+agencyId+", campaignIds = "+campaignIds+", accountManagerUserId = "+accountManagerUserId+", bookingCode = "+bookingCode+", activeOnly = "+activeOnly+", salesUserIds = "+salesUserIds+", salesUserId = "+salesUserId+", traderUserIds = "+traderUserIds+", maxStartDate = "+maxStartDate+", searchText = "+searchText+", campaignReportDay = "+campaignReportDay+", minEndDate = "+minEndDate+", advertiserId = "+advertiserId+"]";
    }
}