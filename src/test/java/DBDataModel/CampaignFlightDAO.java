package DBDataModel;

import DBDataModel.*;
import javax.sql.DataSource;
import java.util.List;

public interface CampaignFlightDAO
{
    public List<campaign_flight>  GetCampaignFlightDetails(String strSQL);
}