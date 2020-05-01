import org.testng.Assert;
import org.testng.annotations.Test;

public class YourProjectsPageTests extends LogInTests {

    @Test(priority = 1, groups = "gitHubPages_tests")
    public void newProjectButtonTest() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabsLocators.profileAndMoreMenuButton, 5);
        elementsHelper.clickOnVisibleAndClickableElement(yourProjectsPageLocators.yourProjectsButton, 5);

        Assert.assertTrue(elementsHelper.isElementClickable(yourProjectsPageLocators.newProjectButton, 5), "newProjectButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourProjectsPageLocators.newProjectButton, 5), "New project");
    }

    @Test(priority = 2, groups = "gitHubPages_tests")
    public void fieldQueryTest() {

        Assert.assertTrue(elementsHelper.isElementVisible(yourProjectsPageLocators.queryField, 5), "fieldQuery should be visible");
    }

    @Test(priority = 3, groups = "gitHubPages_tests")
    public void sortMenuTest() {

        elementsHelper.clickOnVisibleAndClickableElement(yourProjectsPageLocators.sortMenuButton, 5);

        Assert.assertTrue(elementsHelper.isElementClickable(yourProjectsPageLocators.sortByNewest, 10));
        Assert.assertTrue(elementsHelper.isElementClickable(yourProjectsPageLocators.sortByOldest, 5));
        Assert.assertTrue(elementsHelper.isElementClickable(yourProjectsPageLocators.sortByRecentlyUpdated, 5));
        Assert.assertTrue(elementsHelper.isElementClickable(yourProjectsPageLocators.sortByRecentlyUpdated, 5));
        Assert.assertTrue(elementsHelper.isElementClickable(yourProjectsPageLocators.sortByLeastRecentlyUpdated, 5));
        Assert.assertTrue(elementsHelper.isElementClickable(yourProjectsPageLocators.sortByName, 5));

        elementsHelper.clickOnVisibleAndClickableElement(yourProjectsPageLocators.sortMenuButton, 5);


    }
}
