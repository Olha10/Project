import org.testng.Assert;
import org.testng.annotations.BeforeGroups;

public class LogInTests extends TestBase {

    @BeforeGroups (groups = "gitHubPages_tests")
    public void LogInTest () {
        Assert.assertTrue(elementsHelper.isElementPresent(loginPageLocators.loginField,10),"Login field should be presence");
        driver.findElement(loginPageLocators.loginField).sendKeys("Olha10");
        driver.findElement(loginPageLocators.passwordField).sendKeys("krava1098");
        elementsHelper.clickOnVisibleAndClickableElement(loginPageLocators.signInButton,5);
    }

}
