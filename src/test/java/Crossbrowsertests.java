import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import io.github.bonigarcia.wdm.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

public class CrossBrowserTests {

    WebDriver driver;

    @Test(priority = 1)
    public void openPageInFF () {
        FirefoxDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
        driver = new FirefoxDriver();
        driver.get("https://github.com/login");
        driver.manage().window().maximize();
//     driver.quit();

    }

    @Test (priority = 2)
    public void openPageInOpera () {
        OperaDriverManager.getInstance(DriverManagerType.OPERA).setup();
        driver = new OperaDriver();
        driver.get("https://github.com/");
        driver.manage().window().maximize();
//       driver.quit();
    }

    @Test (priority = 3)
    public void openPageInEX () {
        InternetExplorerDriverManager.getInstance(DriverManagerType.IEXPLORER).setup();
        driver = new InternetExplorerDriver();
        driver.get("https://github.com/");
        driver.manage().window().maximize();
    }


}

