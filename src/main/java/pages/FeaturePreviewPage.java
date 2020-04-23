package pages;

import org.openqa.selenium.By;

public class FeaturePreviewPage {

    public By featurePreviewButton = (By.cssSelector("[class='dropdown-item btn-link']"));
    public By disableButton = (By.xpath("//button[@class='btn']"));
    public By notificationsImage = (By.cssSelector("[class='width-fit border border-black-fade rounded-2']"));
    public By featurePreviewCloseButton = (By.xpath("//button[@class='Box-btn-octicon m-0 btn-octicon position-absolute right-0 top-0']//*[local-name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]"));

}
