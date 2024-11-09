package Tests;

import Pages.CreateAccountPage;
import Pages.RegisterConfirmation;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Registertest  extends BaseTest{
    @Test
    public void validregisteration(){
        SoftAssert softAssert = new SoftAssert();
        CreateAccountPage createAccountPage = loginPage.createAccount();

        createAccountPage.enterFirstName("ramy");
        createAccountPage.enterLastTime("qc");
        createAccountPage.enterEmail("qa@test.com");

        createAccountPage.scrollDownward();
        createAccountPage.enterPassword("1234567");
        createAccountPage.setConfirmPasswordField("1234567");


        RegisterConfirmation confirmationpage = createAccountPage.clickRegister();

        softAssert.assertEquals(confirmationpage.getConfirmMessage(),"Thank you for registering with Tealium Ecommerce.");
        softAssert.assertAll();
    }

    @Test
    public void invalidregisteration(){
        SoftAssert softAssert = new SoftAssert();
        CreateAccountPage createAccountPage = loginPage.createAccount();

        createAccountPage.enterFirstName("ramy");
        createAccountPage.enterLastTime("qc");
        createAccountPage.enterEmail("");

        createAccountPage.scrollDownward();
        createAccountPage.enterPassword("1234567");
        createAccountPage.setConfirmPasswordField("1234567");




        softAssert.assertEquals(createAccountPage.getValidationText(),"This is a required field.");
        softAssert.assertAll();
    }


}
