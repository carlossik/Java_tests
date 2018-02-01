package DataModels;

public class MinEndDate
{
    private String month;

    private String year;

    public String getMonth ()
    {
        return month;
    }

    public void setMonth (String month)
    {
        this.month = month;
    }

    public String getYear ()
    {
        return year;
    }

    public void setYear (String year)
    {
        this.year = year;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [month = "+month+", year = "+year+"]";
    }
}