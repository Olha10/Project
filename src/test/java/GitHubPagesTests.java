import org.testng.Assert;
import org.testng.annotations.Test;


public class GitHubPagesTests extends LogInTests {


    @Test(priority = 1, groups = "gitHubPages_tests")
    public void yourProfilePage() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabsLocators.profileAndMoreMenuButton, 5);
        elementsHelper.clickOnVisibleAndClickableElement(yourProfilePageLocators.yourProfileButton, 5);

        Assert.assertTrue(elementsHelper.isElementClickable(yourProfilePageLocators.overviewProfileButton, 1), "OverviewButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourProfilePageLocators.overviewProfileButton, 1), "Overview");

        Assert.assertTrue(elementsHelper.isElementClickable(yourProfilePageLocators.repositoriesButton, 1), "repositoriesButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourProfilePageLocators.repositoriesButton, 1), "Repositories 1");

        Assert.assertTrue(elementsHelper.isElementClickable(yourProfilePageLocators.editProfileButton, 1), "editProfileButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourProfilePageLocators.editProfileButton, 1), "Edit profile");
    }

    @Test(priority = 2, groups = "gitHubPages_tests")
    public void yourRepositoriesPage() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabsLocators.profileAndMoreMenuButton, 5);
        elementsHelper.clickOnVisibleAndClickableElement(yourRepositoriesPage.yourRepositoriesButton, 5);


        Assert.assertTrue(elementsHelper.isElementVisible(yourRepositoriesPage.searchInputYourRepository, 1), "Repo filter should be visible");

        Assert.assertTrue(elementsHelper.isElementClickable(yourRepositoriesPage.newButton, 1), "New button should be clickable");

//        Assert.assertTrue(elementsHelper.isElementVisible(yourRepositoriesPage.typeOptions,5), "typeButton should  be visible");
//
        elementsHelper.clickOnVisibleAndClickableElement(yourRepositoriesPage.languageOptions, 5);
//        Assert.assertTrue(elementsHelper.isElementSelected(yourRepositoriesPage.selectLanguageAll,5));
        Assert.assertTrue(elementsHelper.isElementVisible(yourRepositoriesPage.selectLanguageAll, 1), "label All should be visible");
        Assert.assertTrue(elementsHelper.isElementVisible(yourRepositoriesPage.selectLanguageJava, 1), "label Java should be visible");
        elementsHelper.clickOnVisibleAndClickableElement(yourRepositoriesPage.languageOptions, 5);
//        elementsHelper.clickOnVisibleAndClickableElement(yourRepositoriesPage.typeOptions,5);
    }

    @Test(priority = 3, groups = "gitHubPages_tests")
    public void yourProjectsPage() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabsLocators.profileAndMoreMenuButton, 5);
        elementsHelper.clickOnVisibleAndClickableElement(yourProjectsPageLocators.yourProjectsButton, 5);

        Assert.assertTrue(elementsHelper.isElementClickable(yourProjectsPageLocators.newProjectButton, 5), "newProjectButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourProjectsPageLocators.newProjectButton, 1), "New project");

        Assert.assertTrue(elementsHelper.isElementVisible(yourProjectsPageLocators.queryField, 1), "fieldQuery should be visible");

        Assert.assertTrue(elementsHelper.isElementClickable(yourProjectsPageLocators.sortButton, 1), "sortButton should  be clickable");

    }

    @Test(priority = 4, groups = "gitHubPages_tests")
    public void yourStarsPage() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabsLocators.profileAndMoreMenuButton, 5);
        elementsHelper.clickOnVisibleAndClickableElement(yourStarsPageLocators.yourStarsButton, 5);

        Assert.assertTrue(elementsHelper.isElementVisible(yourStarsPageLocators.filtersMenu, 1), "filtersMenu should be visible");

        Assert.assertTrue(elementsHelper.isElementVisible(yourStarsPageLocators.starIcon, 1), "StarIcon should be visible");
    }

    @Test(priority = 5, groups = "gitHubPages_tests")
    public void yourGistsPage() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabsLocators.profileAndMoreMenuButton, 10);
        elementsHelper.clickOnVisibleAndClickableElement(yourGistsPageLocators.yourGistsButton, 10);

        Assert.assertTrue(elementsHelper.isElementClickable(yourGistsPageLocators.allGistsButton, 5), "All Gists button should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourGistsPageLocators.allGistsButton, 1), "All gists 0");

        Assert.assertTrue(elementsHelper.isElementVisible(yourGistsPageLocators.allGistsHeaderTab, 1), "allGistsHeaderTab should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourGistsPageLocators.allGistsHeaderTab, 1), "All gists");

        elementsHelper.clickOnVisibleAndClickableElement(yourGistsPageLocators.backToGitHubHeaderTab, 10);
    }

    @Test(priority = 6, groups = "gitHubPages_tests")

    public void featurePreviewPage() {

        elementsHelper.clickOnVisibleAndClickableElement(headerTabsLocators.profileAndMoreMenuButton, 10);

        elementsHelper.clickOnVisibleAndClickableElement(featurePreviewPageLocators.featurePreviewButton, 10);

        Assert.assertTrue(elementsHelper.isElementVisible(featurePreviewPageLocators.noFeaturesAvailableText, 10));
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(featurePreviewPageLocators.noFeaturesAvailableText, 1), "No features available");

        Assert.assertTrue(elementsHelper.isElementVisible(featurePreviewPageLocators.catFeaturesImage, 5));

        elementsHelper.clickOnVisibleAndClickableElement(featurePreviewPageLocators.featurePreviewCloseButton, 10);
    }

    @Test(priority = 7, groups = "gitHubPages_tests")

    public void helpPage() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabsLocators.profileAndMoreMenuButton, 10);
        elementsHelper.clickOnVisibleAndClickableElement(helpPageLocators.helpPageButton, 5);

        Assert.assertTrue(elementsHelper.isElementVisible(helpPageLocators.searchHelp, 5), "searchHelp should be visible");

        Assert.assertTrue(elementsHelper.isElementClickable(helpPageLocators.contactUsButton, 1), "contactUsButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(helpPageLocators.contactUsButton, 1), "Contact us");

        driver.navigate().back();
    }

    @Test(priority = 8, groups = "gitHubPages_tests")

    public void settingsPage() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabsLocators.profileAndMoreMenuButton, 5);
        elementsHelper.clickOnVisibleAndClickableElement(settingsPageLocators.settingsButton, 5);

        Assert.assertTrue(elementsHelper.isElementClickable(settingsPageLocators.contributionsCheckBox, 5), "contributionsCheckBox should  be clickable");

        Assert.assertTrue(elementsHelper.isElementClickable(settingsPageLocators.jobsProfileCheckBox, 5), "jobsProfileCheckBox should  be clickable");

        Assert.assertTrue(elementsHelper.isElementVisible(settingsPageLocators.saveTrendingSettingsButton, 5), "saveTrendingSettingsButton should  be visible");
//        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(settingsPage.saveTrendingSettingsButton,1),"Save Trending settings");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(settingsPageLocators.saveJobsProfileButton, 5), "Save jobs profile");
    }


}

