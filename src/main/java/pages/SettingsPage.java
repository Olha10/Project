package pages;

import org.openqa.selenium.By;

public class SettingsPage {

    public By settingsButton = (By.cssSelector("[data-ga-click='Header, go to settings, icon:settings']"));
    public By contributionsCheckBox = (By.cssSelector("[id='user_show_private_contribution_count']"));
    public By jobsProfileCheckBox = (By.cssSelector("[id='user_profile_hireable']"));
    public By saveTrendingSettingsButton = (By.cssSelector("[data-disable-with='Save Trending settings']"));

}
