package pages;

import org.openqa.selenium.By;

public class YourRepositoriesPage {
    public By yourRepositoriesButton = (By.cssSelector("[data-ga-click='Header, go to repositories, text:your repositories']"));
    public  By searchYourRepository = (By.cssSelector("[id='your-repos-filter']"));
    public By typeOptions = (By.cssSelector("//details[@id='type-options']//summary[@class='btn']"));
    public By languageOptions = (By.cssSelector("[id='language-options']"));
    public By newButton = (By.cssSelector("[class='text-center btn btn-primary ml-3']"));
    public By selectLanguageAll = (By.xpath("//details[@id='language-options']//label[1]"));
    public By selectLanguageJava = (By.xpath("//details[@id='language-options']//label[2]"));
}
