package pages;

import org.openqa.selenium.By;

public class ViewProfileDetailsMenuLocators {
    public By yourRepositoriesButton = (By.cssSelector("[data-ga-click='Header, go to repositories, text:your repositories']"));
    public By signOutButton = (By.xpath("//button[@class='dropdown-item dropdown-signout']"));
}
