package pages;

import org.openqa.selenium.By;

public class YourProfilePage {
    public By overviewProfileNavButton = (By.cssSelector("[class='UnderlineNav-body'] [aria-current='page']"));
    public By repositoriesProfileNavButton = (By.cssSelector("[class='UnderlineNav-body'] [href='/Olha10?tab=repositories']"));
    public By editProfileButton = (By.cssSelector("[class='d-none d-md-block'] [class='hide-sm hide-md']"));
    public By projectsProfileNavButton = (By.cssSelector("[aria-label='User profile'] [href='/Olha10?tab=projects'] "));
    public By packagesProfileNavButton = (By.cssSelector("[aria-label='User profile'] [href='/Olha10?tab=packages']"));
    public By starsProfileNavButton = (By.cssSelector("[aria-label='User profile'] [href='/Olha10?tab=stars']"));
    public By followersProfileNavButton = (By.cssSelector("[aria-label='User profile'] [href='/Olha10?tab=followers']"));
    public By followingProfileNavButton = (By.cssSelector("[href='/Olha10?tab=following']"));
}
