package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DashboardPage {

    private WebDriver driver;

    public DashboardPage ( WebDriver driver)
    {
        this.driver =driver ;

    }
    private By logo = By.className("logo");
    private By dashbordText = By.xpath("//h1[text()='My Dashboard']");


    public homepage navigateToHome (){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(logo).click();
        return new homepage(driver);
    }
    public String confirmDashboard (){
     return    driver.findElement(dashbordText).getText();
    }

    public void calmDown()
    {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

}
