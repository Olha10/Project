import Helpers.ElementsHelper;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.OperaDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Parameters;
import pages.*;

public class TestBase {
    WebDriver driver;
    ElementsHelper elementsHelper;
    public String testUrl = ("https://github.com/login");
    LoginPageLocators loginPageLocators = new LoginPageLocators();
    HeaderTabsLocators headerTabsLocators = new HeaderTabsLocators();
    YourProfilePageLocators yourProfilePageLocators = new YourProfilePageLocators();
    YourRepositoriesPageLocators yourRepositoriesPage = new YourRepositoriesPageLocators();
    YourProjectsPageLocators yourProjectsPageLocators = new YourProjectsPageLocators();
    YourStarsPageLocators yourStarsPageLocators = new YourStarsPageLocators();
    YourGistsPageLocators yourGistsPageLocators = new YourGistsPageLocators();
    FeaturePreviewPageLocators featurePreviewPageLocators = new FeaturePreviewPageLocators();
    HelpPageLocators helpPageLocators = new HelpPageLocators();
    SettingsPageLocators settingsPageLocators = new SettingsPageLocators();



    @BeforeGroups(groups = "gitHubPages_tests")
    @Parameters("browser")
    public void setUp (Browsers browser){

        switch (browser) {
            case CHROME:
            ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
            driver = new ChromeDriver();
            break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case OPERA:
                OperaDriverManager.getInstance(DriverManagerType.OPERA).setup();
                driver = new OperaDriver();
                break;
            case EDGE:
                // EDGE driver
                break;
            default:
                throw new RuntimeException("Invalid specified browser:" + browser + ",expected one of 'CHROME', 'FIREFOX', 'OPERA', 'EDGE'");
        }
        elementsHelper = new ElementsHelper(driver);
        driver.get(testUrl);
        driver.manage().window().maximize();
        }

    @AfterGroups (groups = "gitHubPages_tests")
    public void AfterTests () {
        driver.quit();
    }
}

