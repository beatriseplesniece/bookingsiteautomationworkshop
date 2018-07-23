package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
    @Given("^I have opened home page$")
    public void iHaveOpenedHomePage() throws Throwable {
        System.out.println("Open homepage");
    }

    @When("^I select My account drop down menu$")
    public void iSelectMyAccountDropDownMenu() throws Throwable {
        selectMyAccountDropDownMenu();
    }

    @And("^I select Log in button$")
    public void iSelectLogInButton() throws Throwable {
        selectLogInButton();
    }

    @And("^I enter valid Email address$")
    public void iEnterValidEmailAddress() throws Throwable {
        enterValidEmailAddress();
    }

    @And("^I enter valid Password$")
    public void iEnterValidPassword() throws Throwable {
        enterValidPassword();
    }

    @And("^I tap on check box to remember my log in$")
    public void iTapOnCheckBoxToRememberMyLogIn() throws Throwable {
        tapOnCheckBoxToRememberMyLogIn();
    }

    @And("^I select Log in button to access account$")
    public void iSelectLogInButtonToAccessAccount() throws Throwable {
        selectLogInButtonToAccessAccount();
    }

    @Then("^Existing user Account page is opened$")
    public void existingUserAccountPageIsOpened() throws Throwable {
        System.out.println("Existing user Account page is opened");
    }
}
