package DataModels;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
public class Values {
    private Display Display;

    private Video Video;

    public Display getDisplay ()
    {
        return Display;
    }

    public void setDisplay (Display Display)
    {
        this.Display = Display;
    }

    public Video getVideo ()
    {
        return Video;
    }

    public void setVideo (Video Video)
    {
        this.Video = Video;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Display = "+Display+", Video = "+Video+"]";
    }
}
