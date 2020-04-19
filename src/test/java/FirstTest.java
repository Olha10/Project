import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;


public class FirstTest {

    WebDriver driver;
    ElementsHelper elementsHelper;
    LoginPage loginPage = new LoginPage();
    HeaderTabs headerTabs = new HeaderTabs();
    YourProfilePage yourProfilePage = new YourProfilePage();
    YourRepositoriesPage yourRepositoriesPage = new YourRepositoriesPage();
    YourProjectsPage yourProjectsPage = new YourProjectsPage();
    YourStarsPage yourStarsPage = new YourStarsPage();
    YourGistsPage yourGistsPage = new YourGistsPage();
    FeaturePreviewPage featurePreviewPage = new FeaturePreviewPage();
    HelpPage helpPage = new HelpPage();
    SettingsPage settingsPage = new SettingsPage();



    @Test(priority = 1)
    public void logInPage() {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
        elementsHelper = new ElementsHelper(driver);
        driver.get("https://github.com/login");
        driver.manage().window().maximize();
        driver.findElement(loginPage.loginField).sendKeys("Olha10");
        driver.findElement(loginPage.passwordField).sendKeys("krava1098");
        driver.findElement(loginPage.signInButton).click();
    }

    @Test(priority = 2)
    public void checkHeaderTabs() {

        boolean pullRequestsButtonIsDisplayed = driver.findElement(headerTabs.headerTabPullRequests).isDisplayed();
        Assert.assertTrue(pullRequestsButtonIsDisplayed, "pullRequestsButton should be displayed");

        boolean issuesYouCreatedIsDisplayed = driver.findElement(headerTabs.headerTabIssues).isDisplayed();
        Assert.assertTrue(issuesYouCreatedIsDisplayed, "issuesYouCreatedButton should be displayed");

        boolean marketplaceButtonIsDisplayed = driver.findElement(headerTabs.headerTabMarketplace).isDisplayed();
        Assert.assertTrue(marketplaceButtonIsDisplayed, " marketplaceButton should be displayed");

        boolean exploreButtonIsDisplayed = driver.findElement(headerTabs.headerTabExplore).isDisplayed();
        Assert.assertTrue(exploreButtonIsDisplayed, "exploreButton should be displayed");
    }

    @Test(priority = 3)
    public void yourProfilePage() {
        driver.findElement(headerTabs.profileAndMoreMenuButton).click();
        driver.findElement(yourProfilePage.yourProfileButton).click();

        boolean overviewButtonIsDisplayed = driver.findElement(yourProfilePage.overviewProfileButton).isDisplayed();
        Assert.assertTrue(overviewButtonIsDisplayed, "OverviewButton should be displayed");

        boolean repositoriesButtonInYourProfileIsDisplayed = driver.findElement(yourProfilePage.repositoriesButton).isDisplayed();
        Assert.assertTrue(repositoriesButtonInYourProfileIsDisplayed, "repositoriesButton should be displayed");

        boolean editProfileButtonIsDisplayed = driver.findElement(yourProfilePage.editProfileButton).isDisplayed();
        Assert.assertTrue(editProfileButtonIsDisplayed, "editProfileButton should be displayed");
    }

    @Test(priority = 4)
    public void yourRepositoriesPage() {
        driver.findElement(headerTabs.profileAndMoreMenuButton).click();
        driver.findElement(yourRepositoriesPage.yourRepositoriesButton).click();

        boolean searchYourRepositoryIsDisplayed = driver.findElement(yourRepositoriesPage.searchYourRepository).isDisplayed();
        Assert.assertTrue(searchYourRepositoryIsDisplayed, "Repo filter should be displayed");

        boolean typeOptionsIsSelected = driver.findElement(yourRepositoriesPage.typeOptions).isSelected();
        Assert.assertFalse(typeOptionsIsSelected, "typeButton should not be selected");

        boolean languageOptionsIsSelected = driver.findElement(yourRepositoriesPage.languageOptions).isSelected();
        Assert.assertFalse(languageOptionsIsSelected, "languageOptions should not be selected");
    }

    @Test(priority = 5)
    public void yourProjectsPage() {
        driver.findElement(headerTabs.profileAndMoreMenuButton).click();
        driver.findElement(yourProjectsPage.yourProjectsButton).click();

        boolean newProjectButtonIsDisplayed = driver.findElement(yourProjectsPage.newProjectButton).isDisplayed();
        Assert.assertTrue(newProjectButtonIsDisplayed, "newProjectButton should be displayed");

        boolean fieldQueryIsDisplayed = driver.findElement(yourProjectsPage.queryField).isDisplayed();
        Assert.assertTrue(fieldQueryIsDisplayed, "fieldQuery should be displayed");

        boolean sortButtonIsSelected = driver.findElement(yourProjectsPage.sortButton).isSelected();
        Assert.assertFalse(sortButtonIsSelected, "sortButton should not be selected");

    }

    @Test(priority = 6)
    public void yourStarsPage() {
        driver.findElement(headerTabs.profileAndMoreMenuButton).click();
        driver.findElement(yourStarsPage.yourStarsButton).click();

        boolean filtersMenuIsDisplayed = driver.findElement(yourStarsPage.filtersMenu).isDisplayed();
        Assert.assertTrue(filtersMenuIsDisplayed, "filtersMenu should be Displayed");

    }

    @Test(priority = 7)
    public void yourGistsPage() {
        driver.findElement(headerTabs.profileAndMoreMenuButton).click();
        driver.findElement(yourGistsPage.yourGistsButton).click();
//       elements.isELementPresence(yourGistsPage.allGistsButton,10);

        boolean allGistsButtonIsDisplayed = driver.findElement(yourGistsPage.allGistsButton).isDisplayed();
        Assert.assertTrue(allGistsButtonIsDisplayed, "All Gists button should be Displayed");

        boolean allGistsHeaderTabIsDisplayed = driver.findElement(yourGistsPage.allGistsHeaderTab).isDisplayed();
        Assert.assertTrue(allGistsHeaderTabIsDisplayed, "allGistsHeaderTab should be displayed");

        driver.findElement(yourGistsPage.backToGitHubHeaderTab).click();
    }

    @Test(priority = 8)

    public void featurePreviewPage() {
        driver.findElement(headerTabs.profileAndMoreMenuButton).click();
        driver.findElement(featurePreviewPage.featurePreviewButton).click();

        boolean disableButtonIsDisplayed = driver.findElement(featurePreviewPage.disableButton).isDisplayed();
        Assert.assertTrue(disableButtonIsDisplayed, "disableButton should be displayed");

        Assert.assertTrue(elementsHelper.isElementVisible(featurePreviewPage.notificationsImage, 5), "notificationsImage should be visible");
        driver.findElement(featurePreviewPage.featurePreviewCloseButton).click();
    }

    @Test(priority = 9)

    public void helpPage() {
        driver.findElement(headerTabs.profileAndMoreMenuButton).click();
        driver.findElement(helpPage.helpPageButton).click();

        boolean searchHelpIsDisplayed = driver.findElement(helpPage.searchHelp).isDisplayed();
        Assert.assertTrue(searchHelpIsDisplayed, "searchHelp should be displayed");

        boolean contactUsButtonIsDisplayed = driver.findElement(helpPage.contactUsButton).isDisplayed();
        Assert.assertTrue(contactUsButtonIsDisplayed, "contactUsButton should be displayed");

        driver.navigate().back();
    }

    @Test(priority = 10)

    public void settingsPage() {
        driver.findElement(headerTabs.profileAndMoreMenuButton).click();
        driver.findElement(settingsPage.settingsButton).click();

        boolean contributionsCheckBoxIsSelected = driver.findElement(settingsPage.contributionsCheckBox).isSelected();
        Assert.assertFalse(contributionsCheckBoxIsSelected, "contributionsCheckBox should not be selected");

        boolean jobsProfileCheckBoxIsSelected = driver.findElement(settingsPage.jobsProfileCheckBox).isSelected();
        Assert.assertFalse(jobsProfileCheckBoxIsSelected, "jobsProfileCheckBox should not be selected");

        boolean saveTrendingSettingsButtonIsDisplayed = driver.findElement(settingsPage.saveTrendingSettingsButton).isDisplayed();
        Assert.assertTrue(saveTrendingSettingsButtonIsDisplayed, "saveTrendingSettingsButton should  be displayed");

    }

    @Test(priority = 11)
    public void signOut() {
        Assert.assertTrue(elementsHelper.isElementVisible(headerTabs.profileAndMoreMenuButton, 5), "profileAndMoreMenuButton should be visible");
        driver.findElement(headerTabs.profileAndMoreMenuButton).click();
        Assert.assertTrue(elementsHelper.isElementClickable(loginPage.signOutButton, 5), "signOutButton should be clickable");
        driver.findElement(loginPage.signOutButton).click();
    }

}

