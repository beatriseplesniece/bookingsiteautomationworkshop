package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import general.User;
import pages.header.NavigationPageObject;
import pages.login.LoginPageObject;

public class LoginSteps {

    private LoginPageObject login = new LoginPageObject();
    private SignupSteps signup = new SignupSteps();
    private NavigationPageObject homepage = new NavigationPageObject();
    private User user = new User();

    @Given("^I have created account$")
    public void iHaveCreatedAccount() throws Throwable {
        signup.iCreateNewAccount();
    }

    @When("^I select My account menu$")
    public void iSelectMyAccountMenu() throws Throwable {
        homepage.selectMyAccountButton();
    }

    @And("^I select Log in button$")
    public void iSelectLogInButton() throws Throwable {
        login.selectLoginButton();
    }

    @And("^I enter valid Email address$")
    public void iEnterValidEmailAddress() throws Throwable {
        login.enterEmail(user.getEmailAddress());
    }

    @And("^I enter valid Password$")
    public void iEnterValidPassword() throws Throwable {
       login.enterPassword(user.getPassword());
    }

    @And("^I tap on check box to remember my log in$")
    public void iTapOnCheckBoxToRememberMyLogIn() throws Throwable {
       login.selectCheckbox();
    }

    @And("^I select Log in button to access account$")
    public void iSelectLogInButtonToAccessAccount() throws Throwable {
        login.selectLoginButton();
    }

}
