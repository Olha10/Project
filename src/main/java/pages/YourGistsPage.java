package pages;

import org.openqa.selenium.By;

public class YourGistsPage {

    public By yourGistsButton = (By.cssSelector("[data-ga-click='Header, your gists, text:your gists']"));
    public By allGistsButton = (By.cssSelector("[aria-label='All gists']"));
    public By allGistsHeaderTab = (By.cssSelector("[data-ga-click='Header, go to all gists, text:all gists']"));
    public By backToGitHubHeaderTab = (By.cssSelector("[data-ga-click='Header, go to GitHub, text:Back to GitHub']"));
}
