package pages;

import org.openqa.selenium.By;

public class YourGistsPageLocators {

    public By yourGistsButton = (By.cssSelector("[data-ga-click='Header, your gists, text:your gists']"));
    public By allGistsButton = (By.cssSelector("[aria-label='All gists']"));
    public By allGistsHeaderTab = (By.cssSelector("[data-ga-click='Header, go to all gists, text:all gists']"));
    public By backToGitHubHeaderTab = (By.cssSelector("[data-ga-click='Header, go to GitHub, text:Back to GitHub']"));
    public By header3GistsPage = (By.xpath("//h3[contains(text(),'t have any gists yet.')]"));
    public By subtitleGistsPage = (By.xpath("//p[contains(text(),'Your public gists will show up here on your profil')]"));
}
