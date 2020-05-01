import org.testng.Assert;
import org.testng.annotations.Test;

public class FeaturePreviewPageTests extends LogInTests {

    @Test(priority = 1, groups = "gitHubPages_tests")

    public void featurePreviewPage() {

        elementsHelper.clickOnVisibleAndClickableElement(headerTabsLocators.profileAndMoreMenuButton, 10);

        elementsHelper.clickOnVisibleAndClickableElement(featurePreviewPageLocators.featurePreviewButton, 10);

        Assert.assertTrue(elementsHelper.isElementVisible(featurePreviewPageLocators.noFeaturesAvailableText, 10));
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(featurePreviewPageLocators.noFeaturesAvailableText, 1), "No features available");

        Assert.assertTrue(elementsHelper.isElementVisible(featurePreviewPageLocators.catFeaturesImage, 5));

        elementsHelper.clickOnVisibleAndClickableElement(featurePreviewPageLocators.featurePreviewCloseButton, 10);
    }
}
