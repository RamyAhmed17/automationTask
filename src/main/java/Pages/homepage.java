package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class homepage {

    private WebDriver driver;

    public homepage ( WebDriver driver)
    {
        this.driver =driver ;

    }

    private By AccessoriesTab = By.xpath("//ol/li[3]/a[text()='Accessories']");
    private By ShoesSubcategory = By.xpath("//a[text()='Shoes']");

public void hoverOverAccessories () {
    Actions actions = new Actions(driver);
    WebElement elementToHover = driver.findElement(AccessoriesTab);
    actions.moveToElement(elementToHover).perform();


}
public shoespage chooseCategory() {
    driver.findElement(ShoesSubcategory).click();
    return new shoespage(driver);
}
    public shoespage selectOptionInDropdown(String optionText) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(AccessoriesTab));

        Actions actions = new Actions(driver);
        actions.moveToElement(dropdownElement).perform();



        By shoesOptionLocator = By.xpath("//li[@class='level1 nav-3-3']/a[contains(text(), 'Shoes')]");
        WebElement optionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(shoesOptionLocator));
        optionElement.click();
        wait.until(driver -> {
            try {
                Thread.sleep(5000); // We are using a try block to simulate a 5-second wait
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return true;
        });
        return new shoespage(driver);
    }


}
