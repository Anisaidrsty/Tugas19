package stepDevinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import org.junit.Assert;
import org.openqa.selenium.logging.LoggingHandler;
import pages.HomePage;
import pages.LoginPage;

public class LoginStepDef {

    @Then("user stays on login page")
    @Given("user on the home page")
    public void onTheLoginPage(){
        LoginPage loginPage = new LoginPage();
        Assert.assertTrue(loginPage.isPageDisplayed());

    }

    @When("user input {string} as username")
    public void inputUsername(String username){
        LoginPage loginPage = new LoginPage();
        loginPage.setInputUsername(username);
    }

    @And("user input {string} as password")
    public void inputPassword(String password){
        LoginPage loginPage = new LoginPage();
        loginPage.setInputPassword(password);

    }

    @Then("user will redirect to home page")
    public void verifyTheHomePage(){
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.verifyPageIsDisplayed());
    }
}
