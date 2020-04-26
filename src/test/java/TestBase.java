import Helpers.ElementsHelper;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;

public class TestBase {
    WebDriver driver;
    ElementsHelper elementsHelper;
    public String testUrl = ("https://github.com/login");

    @BeforeGroups(groups = "gitHubPages_tests")
    public void BeforeTests (){

        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
        elementsHelper = new ElementsHelper(driver);
        driver.get(testUrl);
        driver.manage().window().maximize();
    }
    @AfterGroups (groups = "gitHubPages_tests")
    public void AfterTests () {
        driver.quit();
    }
}

