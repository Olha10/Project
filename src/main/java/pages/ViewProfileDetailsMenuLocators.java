package pages;

import org.openqa.selenium.By;

public class ViewProfileDetailsMenuLocators {
    public By yourProjectsButton = (By.cssSelector("[data-ga-click='Header, go to projects, text:your projects']"));
    public By signOutButton = (By.xpath("//button[@class='dropdown-item dropdown-signout']"));
}
