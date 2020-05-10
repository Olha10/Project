import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTabsTests extends LogInTests {

    @Test(priority = 1, groups = "gitHubPages_tests")
    public void checkHeaderTabs() {
        Assert.assertTrue(elementsHelper.isElementClickable(headerTabsLocators.headerTabPullRequests, 5), "pullRequestsButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(headerTabsLocators.headerTabPullRequests,1),"Pull requests");

        Assert.assertTrue(elementsHelper.isElementClickable(headerTabsLocators.headerTabIssues,1), "issuesYouCreatedButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(headerTabsLocators.headerTabIssues,1),"Issues");

        Assert.assertTrue(elementsHelper.isElementClickable(headerTabsLocators.headerTabMarketplace,1), " marketplaceButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(headerTabsLocators.headerTabMarketplace,1),"Marketplace");

        Assert.assertTrue(elementsHelper.isElementClickable(headerTabsLocators.headerTabExplore,1), "exploreButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(headerTabsLocators.headerTabExplore,1),"Explore");
    }
}
