import org.testng.Assert;
import org.testng.annotations.Test;

public class YourProfilePageTests extends LogInPageTests {
    @Test(priority = 1, groups = "gitHubPages_tests")
    public void yourProfileNavButtons() {

        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.profileAndMoreMenuButton,5);
        elementsHelper.clickOnVisibleAndClickableElement(yourProfilePage.yourProfileButton,5);

        elementsHelper.clickOnVisibleAndClickableElement(yourProfilePage.overviewProfileNavButton,5);
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourProfilePage.overviewProfileNavButton, 5), "Overview");

        elementsHelper.clickOnVisibleAndClickableElement(yourProfilePage.repositoriesProfileNavButton,5);
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourProfilePage.repositoriesProfileNavButton, 5), "Repositories 1");

       elementsHelper.clickOnVisibleAndClickableElement(yourProfilePage.projectsProfileNavButton,5);
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourProfilePage.projectsProfileNavButton, 5), "Projects 0");

        elementsHelper.clickOnVisibleAndClickableElement(yourProfilePage.packagesProfileNavButton,5);
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourProfilePage.packagesProfileNavButton, 5), "Packages 0");

        elementsHelper.clickOnVisibleAndClickableElement(yourProfilePage.starsProfileNavButton,5);
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourProfilePage.starsProfileNavButton, 5), "Stars 0");

        elementsHelper.clickOnVisibleAndClickableElement(yourProfilePage.followersProfileNavButton,5);
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourProfilePage.followersProfileNavButton, 5), "Followers 0");

        elementsHelper.clickOnVisibleAndClickableElement(yourProfilePage.followingProfileNavButton,5);
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourProfilePage.followingProfileNavButton, 5), "Following 0");

    }

    @Test (priority = 2, groups = "gitHubPages_tests")
    public void yourProfileButtons (){

        Assert.assertTrue(elementsHelper.isElementClickable(yourProfilePage.editProfileButton,5), "editProfileButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourProfilePage.editProfileButton, 5), "Edit profile");

    }
}
