package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartpage {

    private WebDriver driver;
    public cartpage(WebDriver driver)
    {
        this.driver = driver;
    }

    private By message =By.xpath("//span[contains(text(), 'was added to your shopping cart.')]");

    public String getConfirmationMessage () {
        return driver.findElement(message).getText();
    }

}
