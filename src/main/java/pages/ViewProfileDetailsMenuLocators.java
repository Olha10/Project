package pages;

import org.openqa.selenium.By;

public class ViewProfileDetailsMenuLocators {
    public By settingsButton = (By.cssSelector("[data-ga-click='Header, go to settings, icon:settings']"));
    public By signOutButton = (By.xpath("//button[@class='dropdown-item dropdown-signout']"));
}
