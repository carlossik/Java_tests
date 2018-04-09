package DBDataModel;
import java.util.List;
public interface AdvertiserAccountDAO
{
      List<Advertiser_Account> GetAdvertiserAccount(String strSQL);
}