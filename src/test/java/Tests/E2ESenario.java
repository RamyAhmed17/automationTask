package Tests;

import Pages.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class E2ESenario extends BaseTest {

    @Test

    public void e2eScenario() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        loginPage.scrollDown();
        loginPage.enterMail("testpro@g.com");
        loginPage.enterPassword("1234567");
        DashboardPage dashboardPage = loginPage.submitCredentials();

        softAssert.assertEquals(dashboardPage.confirmDashboard(),"MY DASHBOARD");

      homepage homepage =  dashboardPage.navigateToHome();

      Thread.sleep(7000);

        shoespage shoespage = homepage.selectOptionInDropdown("Shoes");
        softAssert.assertEquals(shoespage.getHeader(),"Shoes");
        shoespage.scrollDown();
        shoespage.selectFromDDL(2);
        shoespage.scrollToSheos();

        Certainproductpage certainproductpage = shoespage.chooseAproduct();

        certainproductpage.scrollDown();
        certainproductpage.chooseColor();
        certainproductpage.chooseSize();
          cartpage cartpage = certainproductpage.AddToCart();

        softAssert.assertEquals(cartpage.getConfirmationMessage(),"Dorian Perforated Oxford was added to your shopping cart.");



    }
}
