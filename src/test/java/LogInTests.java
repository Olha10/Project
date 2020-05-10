import org.testng.annotations.BeforeGroups;
import pages.LoginPageLocators;

public class LogInTests extends TestBase {
    String login = "Olha10";
    String password = "krava1098";
    LoginPageLocators loginPageLocators = new LoginPageLocators();

    @BeforeGroups (groups = "gitHubPages_tests")
    public void LogInTest () {
        elementsHelper.textInputField(loginPageLocators.loginField,10,login);
       elementsHelper.textInputField(loginPageLocators.passwordField,10,password);
        elementsHelper.clickOnVisibleAndClickableElement(loginPageLocators.signInButton,5);
    }

}
