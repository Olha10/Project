package pages;

import org.openqa.selenium.By;

public class ViewProfileDetailsMenuLocators {
    public By yourProfileButton = (By.cssSelector("[data-ga-click='Header, go to profile, text:your profile']"));
    public By signOutButton = (By.xpath("//button[@class='dropdown-item dropdown-signout']"));
}
