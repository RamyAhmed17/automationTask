package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Certainproductpage {

    private WebDriver driver;

    public Certainproductpage(WebDriver driver)
    {
        this.driver =driver ;

    }

    private By color =By.id("option20");
    private By size = By.id("option98");
    private By AddToCartBtn = By.xpath("//div[@class='product-options-bottom']/div[2]/div[2]/button[1]");

    public void chooseColor(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(color).click();

    }
    public void chooseSize(){
        driver.findElement(size).click();

    }
    public cartpage AddToCart(){
        driver.findElement(AddToCartBtn).click();
        return new cartpage(driver);
    }
    public void scrollDown(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement myElement = driver.findElement(color);
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script, myElement);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

}
