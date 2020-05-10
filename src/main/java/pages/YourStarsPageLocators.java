package pages;

import org.openqa.selenium.By;

public class YourStarsPageLocators {
    public By filtersMenu = (By.cssSelector("[aria-label='Show filters']"));
    public By starIcon = (By.cssSelector("[class='octicon octicon-star blankslate-icon']"));
    public By searchButtonFiltersMenu = (By.xpath("//button[@class='btn']"));
    public By sortRecentlyStarredFiltersMenu = (By.cssSelector("[class='filter-item selected']"));
    public By sortRecentlyActiveFiltersMenu = (By.xpath("//a[contains(text(),'Recently active')]"));
    public By sortMostStarsFiltersMenu = (By.xpath("//a[contains(text(),'Most stars')]"));

}

