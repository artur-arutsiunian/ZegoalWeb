package lib.ui.CRMPageObject.contacts;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EditContact extends MainPageObject {

    private final static String
    MOVE_TO_CRM = "//span[text()='CRM']",
    CLICK_ON_CONTACT_TAB = "//span[text()='Contacts']",
    CLICK_ON_FIRST_CONTACT_IN_THE_LIST = "//div[@class='scrollable-list_container__2NtNz']/div/div",
    CLICK_ON_EDIT_BUTTON = "(//span[@class='MuiIconButton-label'])[8]",
    CLICK_ON_DROP_DOWN_IN_LOCATION_FIELD = "//div[@class='chips-with-outside-input_dropdown__5EN-b']",
    INPUT_LOCATION_IN_SEARCH_FIELD = "//input[@placeholder='Search']",
    CANCEL_CHECKBOX = "//input[@type='checkbox']",
    APPLY_CHECKBOX = "//input[@type='checkbox']",
    CLICK_CLOSE_SIDE_BAR = "(//button[@class='MuiButtonBase-root MuiIconButton-root'])[11]",
    CLICK_ON_SAVE_BUTTON = "//span[text()='Save']",
    OPEN_INFO_TAB = "(//span[@class='MuiIconButton-label'])[9]",
    CONTACT_LOCATION_IS_CHANGED = "//span[text()='г.Брест, ул.Воровского, д.27']";

    public List<WebElement> waitForElementsAndClick(By by, String error_message, long timeoutInSeconds) {
        List<WebElement> elements = this.waitForElementsPresent(by, error_message, 5);
        elements.get(0).click();
        return elements;
    }

    public EditContact(WebDriver driver)
    {
        super(driver);
    }

    public void editContactMethod() throws InterruptedException {
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
                "can't click on first contact in the list",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_EDIT_BUTTON),
                "can't click on edit button",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_DROP_DOWN_IN_LOCATION_FIELD),
                "can't click on drop down button in location field",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndSendKeys(
                By.xpath(INPUT_LOCATION_IN_SEARCH_FIELD),
                "г.Брест, ул.Воровского, д.27",
                "can't input location in search field",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CANCEL_CHECKBOX),
                "can't cancel checkbox",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(APPLY_CHECKBOX),
                "can't apply checkbox",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_CLOSE_SIDE_BAR),
                "can't click on 'X' on side bar",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_SAVE_BUTTON),
                "can't click on 'save' button",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(OPEN_INFO_TAB),
                "can't click on 'Info tab'",
                5
        );
        Thread.sleep(2000);
        this.assertElementHasText(
                By.xpath(CONTACT_LOCATION_IS_CHANGED),
                "г.Брест, ул.Воровского, д.27",
                "can't confirm that contact location is changed"
        );
    }
}
