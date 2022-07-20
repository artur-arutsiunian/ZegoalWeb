package lib.ui.CRMPageObject.contacts;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DeleteContact extends MainPageObject {

    private final static String
    MOVE_TO_CRM = "//span[text()='CRM']",
    CLICK_ON_CONTACT_TAB = "//span[text()='Contacts']",
    ENTER_NAME_IN_SEARCH_FIELD = "//input[@placeholder='Search']",
    CLICK_ON_CONTACT = "//div[@class='scrollable-list_container__2NtNz']/div/div/div",
    CLICK_ON_DELETE_BUTTON = "(//span[@class='MuiIconButton-label'])[7]",
    CLICK_ON_YES_BUTTON = "(//span[text()='Yes'])[3]",
    CLEAR_SEARCH_FIELD = "(//span[@class='MuiIconButton-label'])[6]",
    ENTER_NAME_IN_SEARCH_FIELD_AGAIN = "//input[@placeholder='Search']",
    LIST_IS_EMPTY = "//span[text()='Empty list']";

    public List<WebElement> waitForElementsAndClick(By by, String error_message, long timeoutInSeconds) {
        List<WebElement> elements = this.waitForElementsPresent(by, error_message, 5);
        elements.get(0).click();
        return elements;
    }

    public DeleteContact(WebDriver driver)
    {
        super(driver);
    }

    public void deleteContactMethod() throws InterruptedException {
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
        this.waitForElementAndSendKeys(
                By.xpath(ENTER_NAME_IN_SEARCH_FIELD),
                "contact zegoal",
                "can't enter name in 'search' field'",
                5
        );
        Thread.sleep(2000);
        this.waitForElementsAndClick(
                By.xpath(CLICK_ON_CONTACT),
                "can't click on contact",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_DELETE_BUTTON),
                "can't click on delete button",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_YES_BUTTON),
                "can't click on 'Yes' button",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLEAR_SEARCH_FIELD),
                "can't click on 'x' button",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndSendKeys(
                By.xpath(ENTER_NAME_IN_SEARCH_FIELD_AGAIN),
                "contact zegoal",
                "can't enter name in 'search field' again",
                5
        );
        Thread.sleep(2000);
        this.assertElementHasText(
                By.xpath(LIST_IS_EMPTY),
                "Empty list",
                "can't confirm that list is empty"
        );
    }
}
