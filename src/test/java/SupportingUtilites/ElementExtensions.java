package SupportingUtilites;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.*;

public class  ElementExtensions
{
    public static void enterText(WebElement element,String strText)
    {
        if (strText != null)
        {
            element.clear();
            element.sendKeys(strText);
            element.sendKeys(Keys.TAB);
        }
    }

    public static void mouseClick(WebElement element, WebDriver driver)
    {
        //Click the Element
        Actions action = new  Actions(driver);
        action.moveToElement(element).build().perform();
        action.click(element).perform();
    }

    public static void selectText(WebElement element, String strText)
    {
        if (!strText.equals(""))
        {
            Select  select = new Select (element);
            select.selectByVisibleText(strText);
        }
    }

    public static void selectValue(WebElement element, String strValue)
    {
        if (!strValue.equals(""))
        {
            Select select = new Select(element);
            select.selectByValue(strValue);
        }
    }
}
