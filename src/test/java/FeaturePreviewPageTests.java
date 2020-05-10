import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FeaturePreviewPageLocators;

public class FeaturePreviewPageTests extends LogInTests {
    FeaturePreviewPageLocators featurePreviewPageLocators = new FeaturePreviewPageLocators();

    @Test(priority = 1, groups = "gitHubPages_tests")
    public void featurePreviewPage() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabsLocators.profileAndMoreMenuButton, 10);

        elementsHelper.clickOnVisibleAndClickableElement(viewProfileDetailsMenuLocators.featurePreviewButton, 10);

        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(featurePreviewPageLocators.noFeaturesAvailableText, 10), "No features available");

        Assert.assertTrue(elementsHelper.isElementVisible(featurePreviewPageLocators.catFeaturesImage, 10));

        elementsHelper.clickOnVisibleAndClickableElement(featurePreviewPageLocators.featurePreviewCloseButton, 10);
    }
}
