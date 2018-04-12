package DBDataModel;

import java.util.List;
public interface CampaignFlightDAO
{
      List<campaign_flight>  GetCampaignFlightDetails(String strSQL);
}