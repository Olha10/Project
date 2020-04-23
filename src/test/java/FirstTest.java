import io.github.bonigarcia.wdm.*;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
        Assert.assertTrue(elementsHelper.isElementPresence(loginPage.loginField,5),"Login field should be presence");
        driver.findElement(loginPage.loginField).sendKeys("Olha10");
        driver.findElement(loginPage.passwordField).sendKeys("krava1098");
        elementsHelper.clickOnVisibleAndClickableElement(loginPage.signInButton,1);
    }

    @Test(priority = 2)
    public void checkHeaderTabs() {

        Assert.assertTrue(elementsHelper.isElementClickable(headerTabs.headerTabPullRequests, 5), "pullRequestsButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(headerTabs.headerTabPullRequests,1),"Pull requests");

        Assert.assertTrue(elementsHelper.isElementClickable(headerTabs.headerTabIssues,1), "issuesYouCreatedButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(headerTabs.headerTabIssues,1),"Issues");

        Assert.assertTrue(elementsHelper.isElementClickable(headerTabs.headerTabMarketplace,1), " marketplaceButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(headerTabs.headerTabMarketplace,1),"Marketplace");

        Assert.assertTrue(elementsHelper.isElementClickable(headerTabs.headerTabExplore,1), "exploreButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(headerTabs.headerTabExplore,1),"Explore");
    }

    @Test(priority = 3)
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

    @Test(priority = 4)
    public void yourRepositoriesPage() {
       elementsHelper.clickOnVisibleAndClickableElement(headerTabs.profileAndMoreMenuButton,5);
       elementsHelper.clickOnVisibleAndClickableElement(yourRepositoriesPage.yourRepositoriesButton,5);


        Assert.assertTrue(elementsHelper.isElementVisible(yourRepositoriesPage.searchYourRepository,1), "Repo filter should be visible");

        Assert.assertTrue(elementsHelper.isElementVisible(yourRepositoriesPage.typeOptions,5), "typeButton should  be visible");

        Assert.assertTrue(elementsHelper.isElementVisible(yourRepositoriesPage.languageOptions,5), "languageOptions should  be visible");
    }

    @Test(priority = 5)
    public void yourProjectsPage() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.profileAndMoreMenuButton,5);
        elementsHelper.clickOnVisibleAndClickableElement(yourProjectsPage.yourProjectsButton,5);

        Assert.assertTrue(elementsHelper.isElementClickable(yourProjectsPage.newProjectButton,5), "newProjectButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourProjectsPage.newProjectButton,1),"New project");

        Assert.assertTrue(elementsHelper.isElementVisible(yourProjectsPage.queryField,1), "fieldQuery should be visible");

        Assert.assertTrue(elementsHelper.isElementClickable(yourProjectsPage.sortButton,1), "sortButton should  be clickable");

    }

    @Test(priority = 6)
    public void yourStarsPage() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.profileAndMoreMenuButton,5);
        elementsHelper.clickOnVisibleAndClickableElement(yourStarsPage.yourStarsButton,5);

        Assert.assertTrue(elementsHelper.isElementVisible(yourStarsPage.filtersMenu,1), "filtersMenu should be visible");

        Assert.assertTrue(elementsHelper.isElementVisible(yourStarsPage.starIcon,1),"StarIcon should be visible");
    }

    @Test(priority = 7)
    public void yourGistsPage() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.profileAndMoreMenuButton,10);
        elementsHelper.clickOnVisibleAndClickableElement(yourGistsPage.yourGistsButton,10);

        Assert.assertTrue(elementsHelper.isElementClickable(yourGistsPage.allGistsButton,5), "All Gists button should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourGistsPage.allGistsButton,1),"All gists 0");

        Assert.assertTrue(elementsHelper.isElementVisible(yourGistsPage.allGistsHeaderTab,1), "allGistsHeaderTab should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourGistsPage.allGistsHeaderTab,1),"All gists");

        elementsHelper.clickOnVisibleAndClickableElement(yourGistsPage.backToGitHubHeaderTab,10);
    }

    @Test(priority = 8)

    public void featurePreviewPage() {

        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.profileAndMoreMenuButton,10);

        elementsHelper.clickOnVisibleAndClickableElement(featurePreviewPage.featurePreviewButton,10);
        
        Assert.assertTrue(elementsHelper.isElementClickable(featurePreviewPage.disableButton, 5), "disableButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(featurePreviewPage.disableButton,1),"Disable");

        Assert.assertTrue(elementsHelper.isElementVisible(featurePreviewPage.notificationsImage, 5), "notificationsImage should be visible");

        elementsHelper.clickOnVisibleAndClickableElement(featurePreviewPage.featurePreviewCloseButton,10);
    }

    @Test(priority = 9)

    public void helpPage() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.profileAndMoreMenuButton,10);
        elementsHelper.clickOnVisibleAndClickableElement(helpPage.helpPageButton,5);

        Assert.assertTrue(elementsHelper.isElementVisible(helpPage.searchHelp,5), "searchHelp should be visible");

        Assert.assertTrue(elementsHelper.isElementClickable(helpPage.contactUsButton,1), "contactUsButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(helpPage.contactUsButton,1),"Contact us");

        driver.navigate().back();
    }

    @Test(priority = 10)

    public void settingsPage() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.profileAndMoreMenuButton,5);
        elementsHelper.clickOnVisibleAndClickableElement(settingsPage.settingsButton,5);

        Assert.assertTrue(elementsHelper.isElementClickable(settingsPage.contributionsCheckBox,5), "contributionsCheckBox should  be clickable");

        Assert.assertTrue(elementsHelper.isElementClickable(settingsPage.jobsProfileCheckBox,5), "jobsProfileCheckBox should  be clickable");

        Assert.assertTrue(elementsHelper.isElementVisible(settingsPage.saveTrendingSettingsButton,5), "saveTrendingSettingsButton should  be visible");
//        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(settingsPage.saveTrendingSettingsButton,1),"Save Trending settings");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(settingsPage.saveJobsProfileButton,5),"Save jobs profile");
    }

    @Test(priority = 11)
    public void signOut() {
       elementsHelper.clickOnVisibleAndClickableElement(headerTabs.profileAndMoreMenuButton,10);

        elementsHelper.clickOnVisibleAndClickableElement(loginPage.signOutButton,10);

    }

}

