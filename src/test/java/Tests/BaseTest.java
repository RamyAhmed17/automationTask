package Tests;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    private WebDriver driver;
    protected LoginPage loginPage;
    @BeforeMethod
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ecommerce.tealiumdemo.com/customer/account/login/");
        loginPage = new LoginPage(driver);
    }

    @AfterMethod
    public void reset(){
        driver.quit();
    }

}