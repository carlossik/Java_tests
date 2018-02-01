package DataModels;

public class Oauth
{
    private String update_time;

    private String redirect_uris;

    private String name;

    private String oauth_client_id;

    private String create_time;

    private String last_update_by;

    private String allowed_grant_types;

    private String secret;

    private String random_id;

    public String getUpdate_time ()
    {
        return update_time;
    }

    public void setUpdate_time (String update_time)
    {
        this.update_time = update_time;
    }

    public String getRedirect_uris ()
    {
        return redirect_uris;
    }

    public void setRedirect_uris (String redirect_uris)
    {
        this.redirect_uris = redirect_uris;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getOauth_client_id ()
    {
        return oauth_client_id;
    }

    public void setOauth_client_id (String oauth_client_id)
    {
        this.oauth_client_id = oauth_client_id;
    }

    public String getCreate_time ()
    {
        return create_time;
    }

    public void setCreate_time (String create_time)
    {
        this.create_time = create_time;
    }

    public String getLast_update_by ()
    {
        return last_update_by;
    }

    public void setLast_update_by (String last_update_by)
    {
        this.last_update_by = last_update_by;
    }

    public String getAllowed_grant_types ()
    {
        return allowed_grant_types;
    }

    public void setAllowed_grant_types (String allowed_grant_types)
    {
        this.allowed_grant_types = allowed_grant_types;
    }

    public String getSecret ()
    {
        return secret;
    }

    public void setSecret (String secret)
    {
        this.secret = secret;
    }

    public String getRandom_id ()
    {
        return random_id;
    }

    public void setRandom_id (String random_id)
    {
        this.random_id = random_id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [update_time = "+update_time+", redirect_uris = "+redirect_uris+", name = "+name+", oauth_client_id = "+oauth_client_id+", create_time = "+create_time+", last_update_by = "+last_update_by+", allowed_grant_types = "+allowed_grant_types+", secret = "+secret+", random_id = "+random_id+"]";
    }
}

