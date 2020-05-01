import org.testng.Assert;
import org.testng.annotations.Test;

public class YourGistsPageTests extends LogInTests {

    @Test(priority = 1, groups = "gitHubPages_tests")
    public void yourGistsPageTest() {

        elementsHelper.clickOnVisibleAndClickableElement(headerTabsLocators.profileAndMoreMenuButton, 10);
        elementsHelper.clickOnVisibleAndClickableElement(yourGistsPageLocators.yourGistsButton, 10);

        Assert.assertTrue(elementsHelper.isElementClickable(yourGistsPageLocators.allGistsButton, 5), "All Gists button should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourGistsPageLocators.allGistsButton, 1), "All gists 0");

        Assert.assertTrue(elementsHelper.isElementVisible(yourGistsPageLocators.allGistsHeaderTab, 1), "allGistsHeaderTab should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourGistsPageLocators.allGistsHeaderTab, 1), "All gists");

        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourGistsPageLocators.header3GistsPage, 5), "You don’t have any gists yet.");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourGistsPageLocators.subtitleGistsPage, 5),
                "Your public gists will show up here on your profile. Create a gist to get started.");

        elementsHelper.clickOnVisibleAndClickableElement(yourGistsPageLocators.backToGitHubHeaderTab, 10);
    }
}
