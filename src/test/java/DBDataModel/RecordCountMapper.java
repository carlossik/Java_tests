package DBDataModel;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;


public class RecordCountMapper implements RowMapper<RecordCount> {

    public RecordCount mapRow(ResultSet rs, int rowNum) throws SQLException {
        RecordCount objRecCnt = new RecordCount();
        objRecCnt.setCount(rs.getInt("count"));
        return objRecCnt;
    }
}


