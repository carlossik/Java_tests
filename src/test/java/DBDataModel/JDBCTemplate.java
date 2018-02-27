package DBDataModel;

import javax.sql.DataSource;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTemplate implements CampaignFlightDAO, RecordCountDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }


    public List<campaign_flight> GetCampaignFlightDetails(String strSQL) {

        return jdbcTemplateObject.query(strSQL, new CampaignFlightMapper());
    }

    public List<campaign_flight> GetCampaignFlightDetailsWithNoGoalDetails(String strSQL) {

        return jdbcTemplateObject.query(strSQL, new CampaignFlightMapper());
    }

    public RecordCount GetRecordDetails(String strSQL) {
        List <RecordCount>  objRecordCount = jdbcTemplateObject.query(strSQL, new RecordCountMapper());
        return objRecordCount.get(0);
    }
}



