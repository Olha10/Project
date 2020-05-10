import org.testng.annotations.BeforeGroups;
import pages.LoginPageLocators;

public class LogInTests extends TestBase {
<<<<<<< HEAD
=======
    LoginPageLocators loginPageLocators = new LoginPageLocators();
>>>>>>> master
    String login = "Olha10";
    String password = "krava1098";

    @BeforeGroups(groups = "gitHubPages_tests")
    public void LogInTest() {
<<<<<<< HEAD
        elementsHelper.textInputField(loginPage.loginField, 10, login);
        elementsHelper.textInputField(loginPage.passwordField, 10, password);
        elementsHelper.clickOnVisibleAndClickableElement(loginPage.signInButton, 5);
=======
        elementsHelper.textInputField(loginPageLocators.loginField, 10, login);
        elementsHelper.textInputField(loginPageLocators.passwordField, 10, password);
        elementsHelper.clickOnVisibleAndClickableElement(loginPageLocators.signInButton, 5);
>>>>>>> master
    }

}
