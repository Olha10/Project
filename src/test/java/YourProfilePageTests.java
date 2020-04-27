import org.testng.Assert;
import org.testng.annotations.Test;

public class YourProfilePageTests extends LogInPageTests {
    @Test(priority = 1, groups = "gitHubPages_tests")
    public void yourProfilePage() {

        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.profileAndMoreMenuButton,5);
        elementsHelper.clickOnVisibleAndClickableElement(yourProfilePage.yourProfileButton,5);

        Assert.assertTrue(elementsHelper.isElementClickable(yourProfilePage.overviewProfileButton,1), "OverviewButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourProfilePage.overviewProfileButton, 1), "Overview");

        Assert.assertTrue(elementsHelper.isElementClickable(yourProfilePage.repositoriesButton,1), "repositoriesButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourProfilePage.repositoriesButton, 1), "Repositories 1");

        Assert.assertTrue(elementsHelper.isElementClickable(yourProfilePage.editProfileButton,1), "editProfileButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourProfilePage.editProfileButton, 1), "Edit profile");
    }
}
