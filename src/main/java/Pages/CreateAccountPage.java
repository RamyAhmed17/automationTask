package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountPage {

    private WebDriver driver;
    public CreateAccountPage (WebDriver driver)
    {
        this.driver = driver;
    }

    private By firstNameField = By.id("firstname");
    private By lastNameField = By.id("lastname");
    private By emailField = By.id("email_address");
    private By passwordField = By.id("password");
    private By confirmPasswordField = By.id("confirmation");
    private By emailValidation = By.xpath("//input[@type='email']/following-sibling::div");
    private By registerButton = By.xpath("//div[@class='input-box']/button[@type='submit']");

    public void enterFirstName (String fName)
    {
        driver.findElement(firstNameField).sendKeys(fName);
    }
    public void enterLastTime (String lName)
    {
        driver.findElement(lastNameField).sendKeys(lName);
    }
    public void enterEmail (String email)
    {
        driver.findElement(emailField).sendKeys();
    }
    public void enterPassword (String password)
    {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void setConfirmPasswordField (String passwordAgain)
    {
        driver.findElement(confirmPasswordField).sendKeys(passwordAgain);
    }
    public void scrollDownward()
    {
        WebElement myElement = driver.findElement(registerButton); //to scroll to this element, we created an element to find the button
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script, myElement);
    }
    public String getValidationText()
    {
        return driver.findElement(emailValidation).getText();

    }

    public RegisterConfirmation clickRegister ()
    {
        driver.findElement(registerButton).click();
        return new RegisterConfirmation(driver);
    }





}
