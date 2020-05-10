package pages;

import org.openqa.selenium.By;

public class YourRepositoriesPageLocators {
    public  By searchInputYourRepository = (By.cssSelector("[id='your-repos-filter']"));
    public By typeOptions = (By.xpath("//details[@id='type-options']//summary[@class='btn']"));
    public By languageOptions = (By.cssSelector("[id='language-options']"));
    public By newButton = (By.cssSelector("[class='text-center btn btn-primary ml-3']"));
    public By selectLanguageAll = (By.xpath("//details[@id='language-options']//label[1]"));
    public By selectLanguageJava = (By.xpath("//details[@id='language-options']//label[2]"));
    public By repoSearchResults = (By.xpath("//div[@class='user-repo-search-results-summary TableObject-item TableObject-item--primary v-align-top']"));
    public By selectTypeAll = (By.xpath("//details[@id='type-options']//label[1]"));
    public By selectTypePublic = (By.xpath("//details[@id='type-options']//label[2]"));
    public By selectTypePrivate = (By.xpath("//label[3]"));
    public By selectTypeSources = (By.xpath("//label[4]"));
    public By selectTypeForks = (By.xpath("//label[5]"));
    public By selectTypeArchived = (By.xpath("//label[6]"));
    public By selectTypeMirrors = (By.xpath("//label[7]"));
}
