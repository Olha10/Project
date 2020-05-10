package pages;

import org.openqa.selenium.By;

public class ViewProfileDetailsMenuLocators {
    public By yourProfileButton = (By.cssSelector("[data-ga-click='Header, go to profile, text:your profile']"));
    public By yourRepositoriesButton = (By.cssSelector("[data-ga-click='Header, go to repositories, text:your repositories']"));
    public By yourProjectsButton = (By.cssSelector("[data-ga-click='Header, go to projects, text:your projects']"));
    public By yourStarsButton = (By.cssSelector("[data-ga-click='Header, go to starred repos, text:your stars'"));
    public By yourGistsButton = (By.cssSelector("[data-ga-click='Header, your gists, text:your gists']"));
    public By featurePreviewButton = (By.cssSelector("[class='dropdown-item btn-link']"));
    public By helpPageButton = (By.cssSelector("[data-ga-click='Header, go to help, text:help']"));
    public By settingsButton = (By.cssSelector("[data-ga-click='Header, go to settings, icon:settings']"));
    public By signOutButton = (By.xpath("//button[@class='dropdown-item dropdown-signout']"));
}
