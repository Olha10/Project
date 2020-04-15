package pages;

import org.openqa.selenium.By;

public class YourRepositoriesPage {
    public By yourRepositoriesButton = (By.cssSelector("[data-ga-click='Header, go to repositories, text:your repositories']"));
    public  By searchYourRepository = (By.cssSelector("[id='your-repos-filter']"));
    public By typeOptions = (By.cssSelector("[id='type-options']"));
    public By languageOptions = (By.cssSelector("[id='language-options']"));

}
