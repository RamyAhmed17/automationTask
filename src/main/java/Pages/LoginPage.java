package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By emailField = By.xpath("//li/div[1]/input[@type='email']");
    private By passwordField = By.xpath("//li/div[1]/input[@type='password']");
    private By emailFieldValidation = By.xpath("//input[@type='email']/following-sibling::div");
    private By loginBtn = By.xpath("//div[@class='buttons-set']/button[@type='submit']");
    private By createAnAccountBtn = By.xpath("//a[@title='Create an Account']");

    public void scrollDown()
    {
        WebElement myElement = driver.findElement(emailField);
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script, myElement);
    }

    public void enterMail(String email)
    {
        driver.findElement(emailField).sendKeys(email);
    }
    public void enterPassword(String password)
    {
        driver.findElement(passwordField).sendKeys(password);
    }
    public String getValidation()
    {
        return driver.findElement(emailFieldValidation).getText();

    }
    public DashboardPage submitCredentials()
    {
        driver.findElement(loginBtn).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return new DashboardPage(driver);
    }
    public CreateAccountPage createAccount()
    {
        driver.findElement(createAnAccountBtn).click();
        return new CreateAccountPage(driver);
    }


}
