package stepdefinitions;

import cucumber.api.java.en.Then;

public class AccountSteps {

    @Then("^User Account page is opened$")
    public void userAccountPageIsOpened() throws Throwable {
        System.out.println("Account page");
    }
}
