package pages;

import org.openqa.selenium.By;

public class ViewProfileDetailsMenuLocators {
    public By yourStarsButton = (By.cssSelector("[data-ga-click='Header, go to starred repos, text:your stars'"));
    public By signOutButton = (By.xpath("//button[@class='dropdown-item dropdown-signout']"));
}

