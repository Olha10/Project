import org.testng.Assert;
import org.testng.annotations.Test;
import pages.YourGistsPageLocators;

public class YourGistsPageTests extends LogInTests {
    YourGistsPageLocators yourGistsPageLocators = new YourGistsPageLocators();

    @Test(priority = 1, groups = "gitHubPages_tests")
    public void yourGistsPageTest() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabsLocators.profileAndMoreMenuButton, 10);
        elementsHelper.clickOnVisibleAndClickableElement(viewProfileDetailsMenuLocators.yourGistsButton, 10);

        Assert.assertTrue(elementsHelper.isElementClickable(yourGistsPageLocators.allGistsButton, 10), "All Gists button should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourGistsPageLocators.allGistsButton, 10), "All gists 0");

        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourGistsPageLocators.allGistsHeaderTab, 10), "All gists");

        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourGistsPageLocators.header3GistsPage, 10), "You don’t have any gists yet.");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourGistsPageLocators.subtitleGistsPage, 10),
                "Your public gists will show up here on your profile. Create a gist to get started.");

        elementsHelper.clickOnVisibleAndClickableElement(yourGistsPageLocators.backToGitHubHeaderTab, 10);
    }
}
