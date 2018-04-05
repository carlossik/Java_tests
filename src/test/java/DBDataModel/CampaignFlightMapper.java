package DBDataModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class CampaignFlightMapper implements RowMapper<campaign_flight>  {

    public campaign_flight mapRow(ResultSet rs, int rowNum) throws SQLException {
        campaign_flight objCamFlg = new campaign_flight();
        objCamFlg.setcampaign_flight_name(rs.getString("campaign_flight_name"));
        return objCamFlg;
    }
}
