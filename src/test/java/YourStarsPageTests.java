import org.testng.Assert;
import org.testng.annotations.Test;

public class YourStarsPageTests extends LogInTests {

    @Test(priority = 1, groups = "gitHubPages_tests")
    public void filtersMenuTest() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabsLocators.profileAndMoreMenuButton, 5);
        elementsHelper.clickOnVisibleAndClickableElement(yourStarsPageLocators.yourStarsButton, 5);

       elementsHelper.clickOnVisibleAndClickableElement(yourStarsPageLocators.filtersMenu, 5);

       Assert.assertTrue(elementsHelper.isElementVisible(yourStarsPageLocators.searchButtonFiltersMenu,10));

       Assert.assertTrue(elementsHelper.isElementVisible(yourStarsPageLocators.sortRecentlyStarredFiltersMenu,5));
       Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourStarsPageLocators.sortRecentlyStarredFiltersMenu,5),"Recently starred");

       Assert.assertTrue(elementsHelper.isElementVisible(yourStarsPageLocators.sortRecentlyActiveFiltersMenu,5));
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourStarsPageLocators.sortRecentlyActiveFiltersMenu,5),"Recently active");

        Assert.assertTrue(elementsHelper.isElementVisible(yourStarsPageLocators.sortMostStarsFiltersMenu,5));
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourStarsPageLocators.sortMostStarsFiltersMenu,5),"Most stars");

        elementsHelper.clickOnVisibleAndClickableElement(yourStarsPageLocators.sortRecentlyStarredFiltersMenu, 5);
    }
        @Test(priority = 2, groups = "gitHubPages_tests")
        public void starIconTest() {

        Assert.assertTrue(elementsHelper.isElementVisible(yourStarsPageLocators.starIcon, 5), "StarIcon should be visible");
    }
}
