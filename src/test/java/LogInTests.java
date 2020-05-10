import org.testng.annotations.BeforeGroups;

public class LogInTests extends TestBase {
    String login = "Olha10";
    String pasword = "krava1098";

    @BeforeGroups(groups = "gitHubPages_tests")
    public void LogInTest() {
        elementsHelper.textInputField(loginPageLocators.loginField, 10, login);
        elementsHelper.textInputField(loginPageLocators.passwordField, 10, pasword);
        elementsHelper.clickOnVisibleAndClickableElement(loginPageLocators.signInButton, 10);
    }
}
