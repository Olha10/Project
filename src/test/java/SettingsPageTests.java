import org.testng.Assert;
import org.testng.annotations.Test;

public class SettingsPageTests extends LogInTests {

    @Test(priority = 1, groups = "gitHubPages_tests")

    public void checkBoxSettingsTests() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabsLocators.profileAndMoreMenuButton, 5);
        elementsHelper.clickOnVisibleAndClickableElement(settingsPageLocators.settingsButton, 5);

        Assert.assertTrue(elementsHelper.isElementClickable(settingsPageLocators.contributionsCheckBox, 5), "contributionsCheckBox should  be clickable");

        Assert.assertTrue(elementsHelper.isElementClickable(settingsPageLocators.jobsProfileCheckBox, 5), "jobsProfileCheckBox should  be clickable");
    }

        @Test(priority = 2, groups = "gitHubPages_tests")

        public void settingsButtonTests() {

        Assert.assertTrue(elementsHelper.isElementVisible(settingsPageLocators.saveTrendingSettingsButton, 5), "saveTrendingSettingsButton should  be visible");

        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(settingsPageLocators.saveJobsProfileButton, 5), "Save jobs profile");

        Assert.assertTrue(elementsHelper.isElementClickable(settingsPageLocators.updateContributionsButton,5));
    }
}
