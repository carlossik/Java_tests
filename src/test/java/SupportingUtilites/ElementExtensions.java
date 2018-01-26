package SupportingUtilites;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;


public class  ElementExtensions
{
    public static void enterText(WebElement element, String strText)
    {
        if (strText != null)
        {
            //Get the Elements's id
          //  String strControl = element.getAttribute("id");

            //Clear the Text in the Element
            element.clear();

            //Enter the Text in the Element
            element.sendKeys(strText);
            element.sendKeys(Keys.TAB);

            //Log the Step Result as Pass in Extent Report
            //    ExtentManager.Pass(string.Format("Entered text <font color='blue'>'{0}'</font> in control <font color='red'>{1}</font>", strText, element.GetAttribute("id")));
        }
    }

    public static void mouseClick(WebElement element, WebDriver driver)
    {

        String control = element.getText();
        if (control == "")
            control = element.getAttribute("id");

        //Click the Element
        Actions action = new  Actions(driver);
        action.moveToElement(element).build().perform();
        action.click(element).perform();
        //Log the Step Result as Pass in Extent Report
        // ExtentManager.Pass(string.Format("Clicked on control <font color='red'>{0}</font>", control));
    }

    public static void selectText(WebElement element, String strText)
    {
        if (!strText.equals(""))
        {
            //Get the Elements's id
            String control = element.getAttribute("id");
            //Select the Option from Dropdown list

            Select  select = new Select (element);
            select.selectByVisibleText(strText);
            //  Log the Step Result as Pass in Extent Report
            //   ExtentManager.Pass(string.Format("Selected value <font color='blue'>'{0}'</font> in control <font color='red'>{1}</font>", strText, control));
        }
    }

    public static void selectValue(WebElement element, String strValue)
    {
        if (!strValue.equals(""))
        {
            //Get the Elements's id
            String control = element.getAttribute("id");

            //Select the Option from Dropdown list
            Select select = new Select(element);
            select.selectByValue(strValue);

            //Log the Step Result as Pass in Extent Report
            //    ExtentManager.Pass(string.Format("Selected value <font color='blue'>'{0}'</font> in control <font color='red'>{1}</font>", select.SelectedOption, control));
        }
    }

}
