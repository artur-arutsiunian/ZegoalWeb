package lib.ui.CRMPageObject.contacts;

import lib.ui.MainPageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MoveToInfoTabInContact extends MainPageObject {

    private final static String
    MOVE_TO_CRM = "//span[text()='CRM']",
    CLICK_ON_CONTACT_TAB = "//span[text()='Contacts']",
    CLICK_ON_FIRST_CONTACT_IN_THE_LIST = "//div[@class='scrollable-list_container__2NtNz']/div/div",
    OPEN_INFO_TAB = "(//span[@class='MuiIconButton-label'])[9]",
    TEXT_INFO_IS_PRESENT = "//span[text()='Info']",
    LIST_OF_SUBNAME_IS_PRESENT = "//div[@class='container_container__2CrLs viewer_expansionContent__1KY8N container_vertical__3ckpY']/div";

    public List<WebElement> waitForElementsAndClick(By by, String error_message, long timeoutInSeconds) {
        List<WebElement> elements = this.waitForElementsPresent(by, error_message, 5);
        elements.get(0).click();
        return elements;
    }

    public MoveToInfoTabInContact(WebDriver driver)
    {
        super(driver);
    }

    public void moveToInfoTabInContactMethod() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(MOVE_TO_CRM),
                "can't click on 'CRM'",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_CONTACT_TAB),
                "can't click on 'contact' tab",
                5
        );
        Thread.sleep(2000);
        this.waitForElementsAndClick(
                By.xpath(CLICK_ON_FIRST_CONTACT_IN_THE_LIST),
                "can't click on first contact on the list",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(OPEN_INFO_TAB),
                "can't open 'Info' tab",
                5
        );
        Thread.sleep(2000);
        this.assertElementHasText(
                By.xpath(TEXT_INFO_IS_PRESENT),
                "Info",
                "can't confirm that header 'Info' is present"
        );
        Thread.sleep(2000);
        this.waitForElementsPresent(
                By.xpath(LIST_OF_SUBNAME_IS_PRESENT),
                "can't confirm that list of subname is present",
                5
        );

        int amount_of_elements = getAmountOfElements(
                By.xpath(LIST_OF_SUBNAME_IS_PRESENT)
        );
        Assert.assertEquals("Incorrect number of subname in 'Info'", 2, amount_of_elements);
    }
}
