import org.testng.Assert;
import org.testng.annotations.Test;

public class HelpPageTests extends LogInTests {

    @Test(priority = 1,groups = "gitHubPages_tests")
    public void helpPage () {

        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.profileAndMoreMenuButton,10);
        elementsHelper.clickOnVisibleAndClickableElement(helpPage.helpPageButton,5);

        elementsHelper.clickOnVisibleAndClickableElement(helpPage.searchHelp,5);
        driver.findElement(helpPage.searchHelp).sendKeys("Marketplace");

        Assert.assertTrue(elementsHelper.isElementVisible(helpPage.linkMarketplaceSupport,5),"link should be visible");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(helpPage.linkMarketplaceSupport,5),"GitHub Marketplace support");

        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(helpPage.linkMarketplaceTermOfService,5),"GitHub Marketplace Terms of Service");


        Assert.assertTrue(elementsHelper.isElementClickable(helpPage.contactUsButton,5), "contactUsButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(helpPage.contactUsButton,5),"Contact us");


    }
}
