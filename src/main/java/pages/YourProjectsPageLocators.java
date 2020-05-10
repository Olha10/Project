package pages;

import org.openqa.selenium.By;

public class YourProjectsPageLocators {
    public By newProjectButton = (By.cssSelector("[class='btn btn-primary d-block d-md-inline-block float-md-right text-center'] "));
    public By queryField = (By.id("query"));
    public By sortMenuButton = (By.cssSelector("[class='btn-link select-menu-button icon-only']"));
    public By sortByNewest = (By.xpath("//div[contains(text(),'Newest')]"));
    public By sortByOldest = (By.xpath("//div[contains(text(),'Oldest')]"));
    public By sortByRecentlyUpdated = (By.xpath("//div[contains(text(),'Recently updated')]"));
    public By sortByLeastRecentlyUpdated = (By.xpath("//div[contains(text(),'Least recently updated')]"));
    public By sortByName = (By.xpath("//div[contains(text(),'Name')]"));
}
