import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;

public class LogInPageTests extends TestBase {

    @BeforeGroups(groups = "gitHubPages_tests")
    public void logInPageTest() {

        Assert.assertTrue(elementsHelper.isElementPresence(loginPage.loginField,10),"Login field should be presence");
        driver.findElement(loginPage.loginField).sendKeys("Olha10");
        driver.findElement(loginPage.passwordField).sendKeys("krava1098");
        elementsHelper.clickOnVisibleAndClickableElement(loginPage.signInButton,1);
    }

    @AfterGroups (groups = "gitHubPages_tests")
    public void SignOutTest () {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.profileAndMoreMenuButton,10);

        elementsHelper.isElementPresence(loginPage.signOutButton,10);
        elementsHelper.clickOnVisibleAndClickableElement(loginPage.signOutButton,5);
    }
}
