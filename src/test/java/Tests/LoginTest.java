package Tests;

import Pages.DashboardPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends BaseTest {

    @Test
    public void validLogin() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();

        loginPage.scrollDown();
        loginPage.enterMail("testpro@g.com");
        loginPage.enterPassword("1234567");
        DashboardPage dashboardPage = loginPage.submitCredentials();

        Thread.sleep(10000);
        softAssert.assertEquals(dashboardPage.confirmDashboard(), "MY DASHBOARD");
        softAssert.assertAll();
    }

    @Test

    public void invalidLogin() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();

        loginPage.scrollDown();
        loginPage.enterMail("");
        loginPage.enterPassword("1234567");
          loginPage.submitCredentials();

        softAssert.assertEquals(loginPage.getValidation(), "This is a required field.");
        softAssert.assertAll();
    }
}
