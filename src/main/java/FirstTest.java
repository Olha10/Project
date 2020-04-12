import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

import java.util.List;


public class FirstTest {

   WebDriver driver;

  @Test (priority = 1)
   public void openPage () {
      ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
      driver = new ChromeDriver();
      driver.get("https://github.com/login");
      driver.manage().window().maximize();
      driver.findElement(By.cssSelector("[id='login_field']")).sendKeys("Olha10");
      driver.findElement(By.cssSelector("[id='password']")).sendKeys("krava1098");
      driver.findElement(By.cssSelector("[name='commit']")).click();
//      driver.quit();
   }
   @Test (priority = 2)
   public void checkButtons () {
       ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
       driver = new ChromeDriver();
       driver.get("https://github.com");
       driver.manage().window().maximize();
       boolean buttonFirstIsDisplayed = driver.findElement(By.cssSelector("body.logged-out.env-production.page-responsive.f4:nth-child(2) div.position-relative.js-header-wrapper:nth-child(1) header.Header-old.header-logged-out.js-details-container.Details.position-relative.f4.py-2 div.container-xl.d-lg-flex.flex-items-center.p-responsive div.HeaderMenu.HeaderMenu--logged-out.position-fixed.top-0.right-0.bottom-0.height-fit.position-lg-relative.d-lg-flex.flex-justify-between.flex-items-center.flex-auto nav.mt-0.px-3.px-lg-0.mb-5.mb-lg-0 ul.d-lg-flex.list-style-none li.d-block.d-lg-flex.flex-lg-nowrap.flex-lg-items-center.border-bottom.border-lg-bottom-0.mr-0.mr-lg-3.edge-item-fix.position-relative.flex-wrap.flex-justify-between.d-flex.flex-items-center:nth-child(1) details.HeaderMenu-details.details-overlay.details-reset.width-full > summary.HeaderMenu-summary.HeaderMenu-link.px-0.py-3.border-0.no-wrap.d-block.d-lg-inline-block")).isDisplayed();
       boolean buttonSecondIsDisplayed = driver.findElement(By.cssSelector("body.logged-out.env-production.page-responsive.f4:nth-child(2) div.position-relative.js-header-wrapper:nth-child(1) header.Header-old.header-logged-out.js-details-container.Details.position-relative.f4.py-2 div.container-xl.d-lg-flex.flex-items-center.p-responsive div.HeaderMenu.HeaderMenu--logged-out.position-fixed.top-0.right-0.bottom-0.height-fit.position-lg-relative.d-lg-flex.flex-justify-between.flex-items-center.flex-auto nav.mt-0.px-3.px-lg-0.mb-5.mb-lg-0 ul.d-lg-flex.list-style-none li.border-bottom.border-lg-bottom-0.mr-0.mr-lg-3:nth-child(2) > a.HeaderMenu-link.no-underline.py-3.d-block.d-lg-inline-block")).isDisplayed();
       boolean buttonThirdIsDisplayed = driver.findElement(By.cssSelector("body.logged-out.env-production.page-responsive.f4:nth-child(2) div.position-relative.js-header-wrapper:nth-child(1) header.Header-old.header-logged-out.js-details-container.Details.position-relative.f4.py-2 div.container-xl.d-lg-flex.flex-items-center.p-responsive div.HeaderMenu.HeaderMenu--logged-out.position-fixed.top-0.right-0.bottom-0.height-fit.position-lg-relative.d-lg-flex.flex-justify-between.flex-items-center.flex-auto nav.mt-0.px-3.px-lg-0.mb-5.mb-lg-0 ul.d-lg-flex.list-style-none li.d-block.d-lg-flex.flex-lg-nowrap.flex-lg-items-center.border-bottom.border-lg-bottom-0.mr-0.mr-lg-3.edge-item-fix.position-relative.flex-wrap.flex-justify-between.d-flex.flex-items-center:nth-child(3) details.HeaderMenu-details.details-overlay.details-reset.width-full > summary.HeaderMenu-summary.HeaderMenu-link.px-0.py-3.border-0.no-wrap.d-block.d-lg-inline-block")).isDisplayed();
       boolean buttonFourthIsDisplayed = driver.findElement(By.cssSelector("body.logged-out.env-production.page-responsive.f4:nth-child(2) div.position-relative.js-header-wrapper:nth-child(1) header.Header-old.header-logged-out.js-details-container.Details.position-relative.f4.py-2 div.container-xl.d-lg-flex.flex-items-center.p-responsive div.HeaderMenu.HeaderMenu--logged-out.position-fixed.top-0.right-0.bottom-0.height-fit.position-lg-relative.d-lg-flex.flex-justify-between.flex-items-center.flex-auto nav.mt-0.px-3.px-lg-0.mb-5.mb-lg-0 ul.d-lg-flex.list-style-none li.border-bottom.border-lg-bottom-0.mr-0.mr-lg-3:nth-child(4) > a.HeaderMenu-link.no-underline.py-3.d-block.d-lg-inline-block")).isDisplayed();
       boolean buttonFifthIsDisplayed = driver.findElement(By.cssSelector("body.logged-out.env-production.page-responsive.f4:nth-child(2) div.position-relative.js-header-wrapper:nth-child(1) header.Header-old.header-logged-out.js-details-container.Details.position-relative.f4.py-2 div.container-xl.d-lg-flex.flex-items-center.p-responsive div.HeaderMenu.HeaderMenu--logged-out.position-fixed.top-0.right-0.bottom-0.height-fit.position-lg-relative.d-lg-flex.flex-justify-between.flex-items-center.flex-auto nav.mt-0.px-3.px-lg-0.mb-5.mb-lg-0 ul.d-lg-flex.list-style-none li.d-block.d-lg-flex.flex-lg-nowrap.flex-lg-items-center.border-bottom.border-lg-bottom-0.mr-0.mr-lg-3.edge-item-fix.position-relative.flex-wrap.flex-justify-between.d-flex.flex-items-center:nth-child(5) details.HeaderMenu-details.details-overlay.details-reset.width-full > summary.HeaderMenu-summary.HeaderMenu-link.px-0.py-3.border-0.no-wrap.d-block.d-lg-inline-block")).isDisplayed();
//       boolean buttonFirstThreeIsDisplayed = driver.findElement(By.className("HeaderMenu-summary HeaderMenu-link px-0 py-3 border-0 no-wrap d-block d-lg-inline-block")).isDisplayed();
//       List <WebElement> buttonFirstThreeIsDisplayed = driver.findElements(By.cssSelector("HeaderMenu-link no-underline py-3 d-block d-lg-inline-block"));
//       System.out.println ("elements");
//       boolean buttonFirstThreeIsDisplayed = driver.findElement(By.className("HeaderMenu-summary HeaderMenu-link px-0 py-3 border-0 no-wrap d-block d-lg-inline-block")).isDisplayed();
//       boolean buttonSecondTwoIsDisplayed = driver.findElement(By.className("HeaderMenu-link no-underline py-3 d-block d-lg-inline-block")).isDisplayed();
       if (buttonFirstIsDisplayed && buttonSecondIsDisplayed &&  buttonThirdIsDisplayed && buttonFourthIsDisplayed && buttonFifthIsDisplayed)
       {
           System.out.println("Buttons are present on the page");
       }
       else
       {
           System.out.println("Buttons are not present on the page");
       }
   }


   @Test (priority = 5)
    public void openPage2 () {
      FirefoxDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
     driver = new FirefoxDriver();
     driver.get("https://github.com/login");
     driver.manage().window().maximize();
//     driver.quit();

   }

   @Test (priority = 3)
   public void openPage3 () {
       OperaDriverManager.getInstance(DriverManagerType.OPERA).setup();
       driver = new OperaDriver();
       driver.get("https://github.com/");
       driver.manage().window().maximize();
//       driver.quit();
  }

  @Test (priority = 4)
    public void openPage4 () {
      InternetExplorerDriverManager.getInstance(DriverManagerType.IEXPLORER).setup();
      driver = new InternetExplorerDriver();
      driver.get("https://github.com/");
      driver.manage().window().maximize();
  }

}

