import org.testng.Assert;
import org.testng.annotations.Test;
import pages.YourStarsPageLocators;

public class YourStarsPageTests extends LogInTests {
    YourStarsPageLocators yourStarsPageLocators = new YourStarsPageLocators();

    @Test(priority = 1, groups = "gitHubPages_tests")
    public void filtersMenuTest() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabsLocators.profileAndMoreMenuButton, 5);
        elementsHelper.clickOnVisibleAndClickableElement(viewProfileDetailsMenuLocators.yourStarsButton, 5);
        elementsHelper.clickOnVisibleAndClickableElement(yourStarsPageLocators.filtersMenu, 5);
        Assert.assertTrue(elementsHelper.isElementVisible(yourStarsPageLocators.searchButtonFiltersMenu, 10));
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourStarsPageLocators.sortRecentlyStarredFiltersMenu, 10), "Recently starred");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourStarsPageLocators.sortRecentlyActiveFiltersMenu, 10), "Recently active");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourStarsPageLocators.sortMostStarsFiltersMenu, 10), "Most stars");
        elementsHelper.clickOnVisibleAndClickableElement(yourStarsPageLocators.sortRecentlyStarredFiltersMenu, 5);
    }

    @Test(priority = 2, groups = "gitHubPages_tests")
    public void starIconTest() {
        Assert.assertTrue(elementsHelper.isElementVisible(yourStarsPageLocators.starIcon, 5), "StarIcon should be visible");
    }
}
