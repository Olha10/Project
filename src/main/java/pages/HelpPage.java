package pages;

import org.openqa.selenium.By;

public class HelpPage {
    public By searchHelp = (By.cssSelector("[class='ais-SearchBox-input']"));
    public By contactUsButton = (By.cssSelector("[class='btn-mktg']"));
    public By linkMarketplaceSupport = (By.xpath("//li[1]//div[1]//a[1]//div[1]"));
    public By linkMarketplaceTermOfService = (By.xpath("//li[2]//div[1]//a[1]//div[1]"));
}
