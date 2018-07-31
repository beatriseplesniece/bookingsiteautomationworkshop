package pages.login;

import com.codeborne.selenide.SelenideElement;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPageObject {


    private SelenideElement getEmailField() {
        return $("test");
    }

    private SelenideElement getPasswordField() {
        return $("test");
    }

    private SelenideElement getLoginButton() {
        return $("test");
    }

    private SelenideElement getCheckbox() { return $("Test"); }

    private SelenideElement getLogoutButton() {
        return $("Test");
    }

    public void enterEmail(String email) {
        getEmailField().sendKeys(email);
    }

    public void enterPassword(String password) {
        getPasswordField().sendKeys(password);
    }


    public AccountPageObject selectLoginButton() {
        getLoginButton().click();
        return page(AccountPageObject.class);
    }

    public AccountPageObject selectLogoutButton() {
        getLogoutButton().click();
        return page(AccountPageObject.class);
    }

    public AccountPageObject selectCheckbox(){
        getCheckbox().click();
        return page(AccountPageObject.class);
    }
}
