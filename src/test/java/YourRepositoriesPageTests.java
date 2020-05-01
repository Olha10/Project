import org.testng.Assert;
import org.testng.annotations.Test;

public class YourRepositoriesPageTests extends LogInTests {

    @Test(priority = 1, groups = "gitHubPages_tests")
    public void repoSearchInputTest() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabsLocators.profileAndMoreMenuButton, 5);
        elementsHelper.clickOnVisibleAndClickableElement(yourRepositoriesPage.yourRepositoriesButton, 5);


        elementsHelper.clickOnVisibleAndClickableElement(yourRepositoriesPage.searchInputYourRepository, 10);
        driver.findElement(yourRepositoriesPage.searchInputYourRepository).sendKeys("Project");
        Assert.assertTrue(elementsHelper.isElementVisible(yourRepositoriesPage.repoSearchResults, 15));
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(yourRepositoriesPage.repoSearchResults, 10), "1 result for repositories matching Project");
    }

    @Test(priority = 2, groups = "gitHubPages_tests")
    public void typeOptionsTest() {
        elementsHelper.clickOnVisibleAndClickableElement(yourRepositoriesPage.typeOptions, 10);
        Assert.assertTrue(elementsHelper.isElementVisible(yourRepositoriesPage.selectTypeAll, 10));
        Assert.assertTrue(elementsHelper.isElementVisible(yourRepositoriesPage.selectTypePublic, 5));
        Assert.assertTrue(elementsHelper.isElementVisible(yourRepositoriesPage.selectTypePrivate, 5));
        Assert.assertTrue(elementsHelper.isElementVisible(yourRepositoriesPage.selectTypeSources, 5));
        Assert.assertTrue(elementsHelper.isElementVisible(yourRepositoriesPage.selectTypeForks, 5));
        Assert.assertTrue(elementsHelper.isElementVisible(yourRepositoriesPage.selectTypeArchived, 5));
        Assert.assertTrue(elementsHelper.isElementVisible(yourRepositoriesPage.selectTypeMirrors, 5));
        elementsHelper.clickOnVisibleAndClickableElement(yourRepositoriesPage.typeOptions, 5);
    }

    @Test(priority = 3, groups = "gitHubPages_tests")
    public void languageOptionsTest() {
        elementsHelper.clickOnVisibleAndClickableElement(yourRepositoriesPage.languageOptions, 5);
        Assert.assertTrue(elementsHelper.isElementVisible(yourRepositoriesPage.selectLanguageAll, 5), "label All should be visible");
        Assert.assertTrue(elementsHelper.isElementVisible(yourRepositoriesPage.selectLanguageJava, 5), "label Java should be visible");
        elementsHelper.clickOnVisibleAndClickableElement(yourRepositoriesPage.languageOptions, 5);
    }

    @Test(priority = 4, groups = "gitHubPages_tests")
    public void newButtonTest() {
        Assert.assertTrue(elementsHelper.isElementClickable(yourRepositoriesPage.newButton, 5), "New button should be clickable");
    }


}
