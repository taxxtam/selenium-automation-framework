package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void googleSearchTest() {

        LoginPage page = new LoginPage(driver);
        page.search("Selenium Automation");

        System.out.println("Test Executed Successfully");
    }
}
