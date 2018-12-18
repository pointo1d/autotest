package uk.cmcsuk.autotest;

import cucumber.api.PendingException;
//import cucumber.api.java.*;
import cucumber.api.java.en.*;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.When;
//import cucumber.api.java.en.Then;
//import static org.junit.Assert.*;
//
//import org.openqa.selenium.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
//import environment;

public class Stepdefs {
@Given("^that I search for the \"([^\"]*)\"$")
public void that_I_search_for_the(String arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^at least one item is found$")
public void at_least_one_item_is_found() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I add the item to the cart$")
public void i_add_the_item_to_the_cart() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^the cart is updated with the item$")
public void the_cart_is_updated_with_the_item() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^that I have a non-empty cart$")
public void that_I_have_a_non_empty_cart() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I expect the contents of the cart to be unchanged$")
public void i_expect_the_contents_of_the_cart_to_be_unchanged() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^that I request to create an account$")
public void that_I_request_to_create_an_account() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I enter my details$")
public void i_enter_my_details() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}
    
    /*
    private WebDriver driver;
    String baseUrl = "http://automationpractice.com/index.php";

    @Before
    public void beforeScenario() {
        System.setProperty(
            "webdriver.gecko.driver", "/opt/gecko/bin/geckodriver"
        );
        driver = new FirefoxDriver();
    }

    @Given("^the home page renders$")
    public void the_home_page_renders() throws Exception {
        driver.get(baseUrl);
        assertNotEquals("", driver, null);
    }

    @Given("^that I navigate to the login page$")
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

    @When("^I attempt to login$")
    public void i_attempt_to_login() throws Exception {
        //throw new PendingException();
    }

    @Then("^I expect to be logged (.*)$")
    public void i_expect_the_attempt_to_be_successful(String str) throws Exception {
        switch (str) {
            case "in":
                assertEquals("Logged in", driver.getTitle(), "");
                break;
            case "out":
                assertEquals("Logged out", driver.getTitle(), "");
                break;
            default:
        }
    }

    @When("^I attempt to logout$")
    public void i_attempt_to_logout() throws Exception {
        //throw new PendingException();
    }

    @After
    public void afterScenario() {
        System.out.println("This will run after the every Scenario");
        driver.close();
    }
*/
}

//// END OF FILE
