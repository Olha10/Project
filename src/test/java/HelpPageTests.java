import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HelpPage;

public class HelpPageTests extends LogInTests {
    HelpPage helpPage = new HelpPage();

    @Test(priority = 1, groups = "gitHubPages_tests")
    public void helpPage() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.profileAndMoreMenuButton, 10);
        elementsHelper.clickOnVisibleAndClickableElement(viewProfileDetailsMenuLocators.helpPageButton, 10);

        elementsHelper.textInputField(helpPage.searchHelp,10,"Marketplace");

        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(helpPage.linkMarketplaceSupport, 15), "GitHub Marketplace support");

        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(helpPage.linkMarketplaceTermOfService, 10), "GitHub Marketplace Terms of Service");

        Assert.assertTrue(elementsHelper.isElementClickable(helpPage.contactUsButton, 10), "contactUsButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(helpPage.contactUsButton, 10), "Contact us");

        driver.navigate().back();
        driver.navigate().back();
    }
}
