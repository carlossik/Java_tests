package DBDataModel;

import javax.sql.DataSource;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTemplate implements CampaignFlightDAO, RecordCountDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public List<campaign_flight> GetCampaignFlightDetails(String strSQL) {
        List <campaign_flight> objCampFlits = jdbcTemplateObject.query(strSQL, new CampaignFlightMapper());
        return objCampFlits;
    }

    public RecordCount GetRecordDetails(String strSQL) {
        List <RecordCount>  objRecordCount = jdbcTemplateObject.query(strSQL, new RecordCountMapper());
        return objRecordCount.get(0);
    }
}



