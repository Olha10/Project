package pages;

import org.openqa.selenium.By;

public class FeaturePreviewPageLocators {
    public By noFeaturesAvailableText = (By.cssSelector("[class='f2']"));
    public By catFeaturesImage = (By.xpath("//div[@class='text-center']//*[local-name()='svg']"));
    public By featurePreviewCloseButton = (By.xpath("//button[@class='Box-btn-octicon m-0 btn-octicon position-absolute right-0 top-0']//*[local-name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]"));
}
