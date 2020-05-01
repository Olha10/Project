import org.testng.Assert;
import org.testng.annotations.Test;


public class GitHubPagesTests extends LogInTests {

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

    @Test(priority = 2, groups = "gitHubPages_tests")
    public void yourRepositoriesPage() {
       elementsHelper.clickOnVisibleAndClickableElement(headerTabs.profileAndMoreMenuButton,5);
       elementsHelper.clickOnVisibleAndClickableElement(yourRepositoriesPage.yourRepositoriesButton,5);


        Assert.assertTrue(elementsHelper.isElementVisible(yourRepositoriesPage.searchYourRepository,1), "Repo filter should be visible");

        Assert.assertTrue(elementsHelper.isElementClickable(yourRepositoriesPage.newButton,1),"New button should be clickable");

//        Assert.assertTrue(elementsHelper.isElementVisible(yourRepositoriesPage.typeOptions,5), "typeButton should  be visible");
//
        elementsHelper.clickOnVisibleAndClickableElement(yourRepositoriesPage.languageOptions,5);
//        Assert.assertTrue(elementsHelper.isElementSelected(yourRepositoriesPage.selectLanguageAll,5));
        Assert.assertTrue(elementsHelper.isElementVisible(yourRepositoriesPage.selectLanguageAll,1),"label All should be visible");
        Assert.assertTrue(elementsHelper.isElementVisible(yourRepositoriesPage.selectLanguageJava,1),"label Java should be visible");
        elementsHelper.clickOnVisibleAndClickableElement(yourRepositoriesPage.languageOptions,5);
//        elementsHelper.clickOnVisibleAndClickableElement(yourRepositoriesPage.typeOptions,5);
    }

    @Test(priority = 3, groups = "gitHubPages_tests")
    public void yourProjectsPage() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.profileAndMoreMenuButton,5);
        elementsHelper.clickOnVisibleAndClickableElement(yourProjectsPage.yourProjectsButton,5);

        Assert.assertTrue(elementsHelper.isElementClickable(yourProjectsPage.newProjectButton,5), "newProjectButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourProjectsPage.newProjectButton,1),"New project");

        Assert.assertTrue(elementsHelper.isElementVisible(yourProjectsPage.queryField,1), "fieldQuery should be visible");

        Assert.assertTrue(elementsHelper.isElementClickable(yourProjectsPage.sortButton,1), "sortButton should  be clickable");

    }

    @Test(priority = 4, groups = "gitHubPages_tests")
    public void yourStarsPage() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.profileAndMoreMenuButton,5);
        elementsHelper.clickOnVisibleAndClickableElement(yourStarsPage.yourStarsButton,5);

        Assert.assertTrue(elementsHelper.isElementVisible(yourStarsPage.filtersMenu,1), "filtersMenu should be visible");

        Assert.assertTrue(elementsHelper.isElementVisible(yourStarsPage.starIcon,1),"StarIcon should be visible");
    }

    @Test(priority = 5, groups = "gitHubPages_tests")
    public void yourGistsPage() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.profileAndMoreMenuButton,10);
        elementsHelper.clickOnVisibleAndClickableElement(yourGistsPage.yourGistsButton,10);

        Assert.assertTrue(elementsHelper.isElementClickable(yourGistsPage.allGistsButton,5), "All Gists button should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourGistsPage.allGistsButton,1),"All gists 0");

        Assert.assertTrue(elementsHelper.isElementVisible(yourGistsPage.allGistsHeaderTab,1), "allGistsHeaderTab should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourGistsPage.allGistsHeaderTab,1),"All gists");

        elementsHelper.clickOnVisibleAndClickableElement(yourGistsPage.backToGitHubHeaderTab,10);
    }

    @Test(priority = 6, groups = "gitHubPages_tests")

    public void featurePreviewPage() {

        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.profileAndMoreMenuButton,10);

        elementsHelper.clickOnVisibleAndClickableElement(featurePreviewPage.featurePreviewButton,10);

        Assert.assertTrue(elementsHelper.isElementVisible(featurePreviewPage.noFeaturesAvailableText,10));
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(featurePreviewPage.noFeaturesAvailableText,1),"No features available");

       Assert.assertTrue(elementsHelper.isElementVisible(featurePreviewPage.catFeaturesImage,5));

        elementsHelper.clickOnVisibleAndClickableElement(featurePreviewPage.featurePreviewCloseButton,10);
    }

    @Test(priority = 7, groups = "gitHubPages_tests")

    public void helpPage() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.profileAndMoreMenuButton,10);
        elementsHelper.clickOnVisibleAndClickableElement(helpPage.helpPageButton,5);

        Assert.assertTrue(elementsHelper.isElementVisible(helpPage.searchHelp,5), "searchHelp should be visible");

        Assert.assertTrue(elementsHelper.isElementClickable(helpPage.contactUsButton,1), "contactUsButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(helpPage.contactUsButton,1),"Contact us");

        driver.navigate().back();
    }

    @Test(priority = 8, groups = "gitHubPages_tests")

    public void settingsPage() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.profileAndMoreMenuButton,5);
        elementsHelper.clickOnVisibleAndClickableElement(settingsPage.settingsButton,5);

        Assert.assertTrue(elementsHelper.isElementClickable(settingsPage.contributionsCheckBox,5), "contributionsCheckBox should  be clickable");

        Assert.assertTrue(elementsHelper.isElementClickable(settingsPage.jobsProfileCheckBox,5), "jobsProfileCheckBox should  be clickable");

        Assert.assertTrue(elementsHelper.isElementVisible(settingsPage.saveTrendingSettingsButton,5), "saveTrendingSettingsButton should  be visible");
//        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(settingsPage.saveTrendingSettingsButton,1),"Save Trending settings");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(settingsPage.saveJobsProfileButton,5),"Save jobs profile");
    }

}

