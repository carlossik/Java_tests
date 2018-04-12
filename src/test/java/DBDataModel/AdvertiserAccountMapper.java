package DBDataModel;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdvertiserAccountMapper implements RowMapper<Advertiser_Account> {

    public Advertiser_Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        Advertiser_Account objAdvAcc = new Advertiser_Account();
        objAdvAcc.setAdvertiserName(rs.getString("AdvertiserName"));
        return objAdvAcc;
    }
}
