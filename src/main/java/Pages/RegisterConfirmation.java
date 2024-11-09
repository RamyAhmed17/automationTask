package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterConfirmation {
    private WebDriver driver;

    public RegisterConfirmation(WebDriver driver) {
        this.driver = driver;
    }

    private By confirmation = By.xpath("//ul/li[1]/span[text()='Thank you for registering with Tealium Ecommerce.']");

    public String getConfirmMessage()
    {
        return driver.findElement(confirmation).getText();
    }
}
