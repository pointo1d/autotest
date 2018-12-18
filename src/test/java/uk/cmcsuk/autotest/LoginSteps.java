package uk.cmcsuk.autotest;

import cucumber.api.PendingException;
import cucumber.api.java.*;
import cucumber.api.java.en.*;
import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginSteps {
    WebDriver driver;

    private void logIn() {
        throw new PendingException();
    }

    private void logOut() {
        throw new PendingException();
    }

    private boolean isLoggedIn() {
        return driver.getTitle() == "My account - My Store";
    }

    private boolean isLoggedOut() {
        return driver.getTitle() == "My Store";
    }

    @Before
    public void standUp() {
        System.setProperty(
            "webdriver.gecko.driver", "/opt/gecko/bin/geckodriver"
        );
        System.setProperty(
            FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null"
        );
        driver = new FirefoxDriver();
    }

    @Given("^the home page renders$")
    public void the_home_page_renders() throws Exception {
    System.out.println("the_home_page_renders()");
        driver.get("http://automationpractice.com/index.php");
        assertEquals("Correct home page title", driver.getTitle(), "My Store");
    }

    @Given("^I navigate to the login page$")
    public void that_I_navigate_to_the_login_page() throws Exception {
        driver.findElement(By.linkText("Sign in")).click();
        assertEquals(
            "Login page title correct", driver.getTitle(), "Login - My Store"
        );
    }

    @Given("^I enter my personal details$")
    public void that_I_enter_my_details() throws Exception {
        //throw new PendingException();
    }

    @When("^I attempt to create the account$")
    public void i_attempt_to_create_the_account() throws Exception {
        //throw new PendingException();
    }

    @Then("^I expect the account to be created$")
    public void i_expect_the_attempt_to_succeed() throws Exception {
        //throw new PendingException();
    }

    @When("^I enter my login details$")
    public void i_enter_my_login_details() throws Exception {
        //throw new PendingException();
    }

    @When("^I am logged (.*)$")
    public boolean i_am_logged(String str) throws Exception {
        switch (str) {
            case "in":
                return isLoggedIn();
            case "out":
                return isLoggedOut();
            default:
                fail("Unknown authentication state: " + str);
                return false;
        }
    }

    @Then("^I expect to be logged (.*)$")
    public void i_expect_to_be_logged(String str) throws Exception {
        assertEquals("Logged " + str, i_am_logged(str), true);
    }

    @When("^I log (.*)$")
    public void i_log(String str) throws Exception {
        //throw new PendingException();
        switch (str) {
            case "in":
                logIn();
                break;
            case "out":
                logOut();
                break;
            default:
        }
    }

    @When("^I attempt to log (.*)$")
    public void i_attempt_to_log(String str) throws Exception {
        switch (str) {
            case "in":
                break;
            case "out":
                break;
            default:
        }
    }

    @After
    public void tearDown() {
        driver.close();
    }
}

//// END OF FILE
