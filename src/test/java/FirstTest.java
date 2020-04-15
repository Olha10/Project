import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HeaderTabs;
import pages.LoginPage;
import pages.YourProfilePage;
import pages.YourRepositoriesPage;


public class FirstTest {

   WebDriver driver;
   ElementsHelper elements = new ElementsHelper(driver);
   LoginPage loginPage = new LoginPage();
   HeaderTabs headerTabs = new HeaderTabs();
   YourProfilePage yourProfilePage = new YourProfilePage();
   YourRepositoriesPage yourRepositoriesPage = new YourRepositoriesPage();



   @Test (priority = 1)
   public void logInPAge () {
      ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
      driver = new ChromeDriver();
      driver.get("https://github.com/login");
      driver.manage().window().maximize();
      driver.findElement(loginPage.loginField).sendKeys("Olha10");
      driver.findElement(loginPage.passwordField).sendKeys("krava1098");
      driver.findElement(loginPage.signInButton).click();
   }

    @Test (priority = 2)
    public void checkHeaderTabs () {

       boolean pullRequestsButtonIsDisplayed = driver.findElement(headerTabs.headerTabPullRequests).isDisplayed();
       Assert.assertTrue(pullRequestsButtonIsDisplayed, "pullRequestsButton should be displayed");

       boolean issuesYouCreatedIsDisplayed = driver.findElement(headerTabs.headerTabIssues).isDisplayed();
       Assert.assertTrue(issuesYouCreatedIsDisplayed, "issuesYouCreatedButton should be displayed");

       boolean marketplaceButtonIsDisplayed = driver.findElement(headerTabs.headerTabMarketplace).isDisplayed();
       Assert.assertTrue(marketplaceButtonIsDisplayed, " marketplaceButton should be displayed");

       boolean exploreButtonIsDisplayed = driver.findElement(headerTabs.headerTabExplore).isDisplayed();
       Assert.assertTrue(exploreButtonIsDisplayed, "exploreButton should be displayed");
    }

    @Test (priority = 3)
    public void yourProfilePage () {
       driver.findElement(headerTabs.profileAndMoreMenuButton).click();

       driver.findElement(yourProfilePage.yourProfileButton).click();

       boolean overviewButtonIsDisplayed = driver.findElement(yourProfilePage.overviewProfileButton).isDisplayed();
       Assert.assertTrue(overviewButtonIsDisplayed, "OverviewButton should be displayed");

       boolean repositoriesButtonInYourProfileIsDisplayed = driver.findElement(yourProfilePage.repositoriesButton).isDisplayed();
       Assert.assertTrue(repositoriesButtonInYourProfileIsDisplayed, "repositoriesButton should be displayed");

       boolean editProfileButtonIsDisplayed = driver.findElement(yourProfilePage.editProfileButton).isDisplayed();
       Assert.assertTrue(editProfileButtonIsDisplayed, "editProfileButton should be displayed");
    }

    @Test (priority = 4)
    public void yourRepositoriesPage () {
       driver.findElement(headerTabs.profileAndMoreMenuButton).click();
       driver.findElement(yourRepositoriesPage.yourRepositoriesButton).click();

       boolean searchYourRepositoryIsDisplayed = driver.findElement(yourRepositoriesPage.searchYourRepository).isDisplayed();
       Assert.assertTrue(searchYourRepositoryIsDisplayed, "Repo filter should be displayed");

       boolean typeOptionsIsSelected = driver.findElement(yourRepositoriesPage.typeOptions).isSelected();
       Assert.assertFalse(typeOptionsIsSelected, "typeButton should not be selected");

       boolean languageOptionsIsSelected = driver.findElement(yourRepositoriesPage.languageOptions).isSelected();
       Assert.assertFalse(languageOptionsIsSelected, "languageOptions should not be selected");
    }



      /*driver.findElement(By.cssSelector("[aria-label='View profile and more']")).click();
      boolean yourProjectsButtonIsDisplayed = driver.findElement(By.cssSelector("[data-ga-click='Header, go to projects, text:your projects']")).isDisplayed();
      Assert.assertTrue(yourProjectsButtonIsDisplayed,"yourProjectsButton is Displayed");
      driver.findElement(By.cssSelector("[data-ga-click='Header, go to projects, text:your projects']")).click();
      boolean newProjectButtonIsDisplayed = driver.findElement(By.xpath("//a[@class='btn btn-primary d-block d-md-inline-block float-md-right text-center']")).isDisplayed();
      Assert.assertTrue(newProjectButtonIsDisplayed,"newProjectButton is Displayed");
      boolean fieldQueryIsDisplayed = driver.findElement(By.id("query")).isDisplayed();
      Assert.assertTrue(fieldQueryIsDisplayed,"fieldQuery is Displayed");

      driver.findElement(By.cssSelector("[aria-label='View profile and more']")).click();
      boolean yourStarsButtonIsDisplayed = driver.findElement(By.cssSelector("[data-ga-click='Header, go to starred repos, text:your stars']")).isDisplayed();
      Assert.assertTrue(yourStarsButtonIsDisplayed,"yourStarsButton is Displayed");
      driver.findElement(By.cssSelector("[data-ga-click='Header, go to starred repos, text:your stars'")).click();
      boolean filtersMenuIsDisplayed = driver.findElement(By.cssSelector("[aria-label='Show filters']")).isDisplayed();
      Assert.assertTrue(filtersMenuIsDisplayed,"filtersMenu is Displayed");

      driver.findElement(By.cssSelector("[aria-label='View profile and more']")).click();
      boolean yourGistsButtonIsDisplayed = driver.findElement(By.cssSelector("[data-ga-click='Header, your gists, text:your gists']")).isDisplayed();
      Assert.assertTrue(yourGistsButtonIsDisplayed,"yourGistsButton is Displayed");
      driver.findElement(By.cssSelector("[data-ga-click='Header, your gists, text:your gists']")).click();
      boolean gistsTabAllGists = driver.findElement(By.cssSelector("[aria-label='All gists']")).isDisplayed();
      Assert.assertTrue(gistsTabAllGists, "All Gists is Displayed");

      driver.findElement(By.cssSelector("[data-ga-click='Header, go to GitHub, text:Back to GitHub']")).click();
      driver.findElement(By.cssSelector("[aria-label='View profile and more']")).click();
      driver.findElement(By.xpath("//button[@class='dropdown-item btn-link']")).click();
//      boolean disableButtonIsDisplayed = driver.findElement(By.name("selected_slug")).isDisplayed();
//      Assert.assertTrue(disableButtonIsDisplayed,"disableButton is Displayed");
      driver.findElement(By.xpath("//button[@class='Box-btn-octicon m-0 btn-octicon position-absolute right-0 top-0']")).click();
      driver.findElement(By.cssSelector("[aria-label='View profile and more']")).click();


      boolean settingsButtonIsDisplayed = driver.findElement(By.cssSelector("[data-ga-click='Header, go to settings, icon:settings']")).isDisplayed();
      Assert.assertTrue(settingsButtonIsDisplayed,"settingsButton is Displayed");
   driver.findElement(By.cssSelector("[data-ga-click='Header, go to settings, icon:settings']")).click();
   boolean contributionsCheckBox = driver.findElement(By.cssSelector("[id='user_show_private_contribution_count']")).isSelected();
   Assert.assertFalse(contributionsCheckBox, "contributionsCheckBox is not Selected");
//      driver.quit();
   }*/



}

