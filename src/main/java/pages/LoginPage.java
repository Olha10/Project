package pages;

import org.openqa.selenium.By;

public class LoginPage {

    public By loginField = (By.cssSelector("[id='login_field']"));
    public By passwordField = (By.cssSelector("[id='password']"));
    public By signInButton = (By.cssSelector("[name='commit']"));
    public By signOutButton = (By.cssSelector("[class='dropdown-item dropdown-signout']"));

}
