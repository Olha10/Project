import org.testng.annotations.BeforeGroups;

public class LogInPageTests extends TestBase {
    String login = "Olha10";
    String password = "krava1098";

    @BeforeGroups(groups = "gitHubPages_tests")
    public void logInPageTest() {
        elementsHelper.textInputField(loginPage.loginField, 10, login);
        elementsHelper.textInputField(loginPage.loginField, 10, password);
        elementsHelper.clickOnVisibleAndClickableElement(loginPage.signInButton, 10);
    }
}
