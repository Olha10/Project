package pages;

import org.openqa.selenium.By;

public class SettingsPageLocators {
    public By contributionsCheckBox = (By.xpath("//input[@id='user_show_private_contribution_count']"));
    public By jobsProfileCheckBox = (By.cssSelector("[id='user_profile_hireable']"));
    public By saveTrendingSettingsButton = (By.cssSelector("[data-disable-with='Save Trending settings']"));
    public By saveJobsProfileButton = (By.xpath("//button[contains(text(),'Save jobs profile')]"));
    public By updateContributionsButton = (By.xpath("//button[contains(text(),'Update contributions')]"));
}
