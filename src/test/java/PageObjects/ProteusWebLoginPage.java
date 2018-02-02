package PageObjects;
import SupportingUtilites.BrowserFactory;
import org.openqa.selenium.support.PageFactory;
import SupportingUtilites.ElementExtensions;
import SupportingUtilites.GeneralUtilites;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;


@lombok.experimental.ExtensionMethod({ElementExtensions.class})
public class ProteusWebLoginPage extends BrowserFactory
{
    private BrowserFactory browserFactory;

    public ProteusWebLoginPage(BrowserFactory browserFactory)
    {
        this.browserFactory = browserFactory;
        PageFactory.initElements(browserFactory.getDriver(),this );
    }



     @FindBy (how =  How.ID , using = "username")
     @CacheLookup
     public WebElement txtUserName;

     @FindBy (how = How.ID , using = "password")
     @CacheLookup
     public WebElement txtPassword ;


     @FindBy (how = How.XPATH, using = "/html/body/section/div/div/form/div/div[4]/div[2]/div/button")
     @CacheLookup
     public WebElement btnLogIn ;

     @FindBy (how = How.ID, using = "remember_me")
     @CacheLookup
     public WebElement chbxRememberMe;


     @FindBy (how = How.XPATH, using = "/html/body/section/div/div/form/div/div[4]/a")
     @CacheLookup
     public WebElement lnkForgottenPassword;


    @FindBy (how = How.XPATH, using = "/html/body/section/div/div/form/div/div[4]/div[1]/div")
    public WebElement txtInvalidUsernamePassword ;


    public void loginToApplication(String username, String password)
    {
        GeneralUtilites.wait(1);
        enterText(txtUserName,username);
        enterText(txtPassword,password);
        if (chbxRememberMe.isSelected())
          mouseClick(chbxRememberMe);
         mouseClick(btnLogIn );
    }

    public boolean CheckInvalidUsernamePassword()
    {
        GeneralUtilites.wait(1);
        return txtInvalidUsernamePassword.isDisplayed();
    }
}

