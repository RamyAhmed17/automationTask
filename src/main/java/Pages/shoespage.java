package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class shoespage {

    private WebDriver driver;

    public shoespage(WebDriver driver) {
        this.driver = driver;

    }

    private By SortByList = By.xpath("//*[@id='top']/body/div[2]/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/select");
    private By PriceOption = By.xpath(" //*[@id='top']/body/div[2]/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/select/option[3]");

    private By SortArrowIcon = By.xpath("//*[@id='top']/body/div[2]/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/a");
    private By CertainShoes = By.xpath("//*[@id='top']/body/div[2]/div/div[2]/div/div[2]/div[2]/div[3]/ul/li[5]/div/div[2]/a");
    private By pageHeader = By.xpath("//div/div[2]/h1");
    private By bar = By.xpath("//*[@id='top']/body/div[2]/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div");
    public void selectFromDDL(int index){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Select DDElement = new Select(driver.findElement(SortByList));
        DDElement.selectByIndex(index);
    }
    public void scrollDown()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement myElement = driver.findElement(SortByList);
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script, myElement);
    }
    public Certainproductpage chooseAproduct(){

        driver.findElement(CertainShoes).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return new Certainproductpage(driver);
    }
    public void scrollToSheos() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement myElement = driver.findElement(bar);
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script, myElement);

    }

    public String getHeader (){
        return driver.findElement(pageHeader).getText();
    }
}

