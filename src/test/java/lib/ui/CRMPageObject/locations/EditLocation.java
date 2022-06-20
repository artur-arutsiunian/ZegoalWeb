package lib.ui.CRMPageObject.locations;

import lib.ui.MainPageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EditLocation extends MainPageObject {

    private final static String
    MOVE_TO_CRM = "//span[text()='CRM']",
    CLICK_ON_LOCATIONS_TAB = "//span[text()='Locations']",
    LIST_OF_LOCATIONS_IS_PRESENT = "//div[@class='scrollable-list_container__2NtNz']/div/div",
    CLICK_ON_FIRST_LOCATION_IN_THE_LIST = "//div[@class='scrollable-list_container__2NtNz']/div/div",
    CLICK_ON_EDIT_BUTTON = "(//span[@class='MuiIconButton-label'])[8]",
    CLEAR_NAME_FIELD = "//textarea[@placeholder='Name']",
    INPUT_NAME = "//textarea[@placeholder='Name']",
    CLICK_ON_SAVE_BUTTON = "//span[text()='Save']",
    LOCATION_NAME_IS_CHANGED = "//input[@value='CAT']";

    public List<WebElement> waitForElementsAndClick(By by, String error_message, long timeoutInSeconds) {
        List<WebElement> elements = this.waitForElementsPresent(by, error_message, 5);
        elements.get(0).click();
        return elements;
    }

    public EditLocation(WebDriver driver)
    {
        super(driver);
    }

    public void editLocationMethod() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(MOVE_TO_CRM),
                "can't click on 'CRM'",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_LOCATIONS_TAB),
                "can't click on 'locations' tab",
                5
        );
        Thread.sleep(2000);
        this.waitForElementsPresent(
                By.xpath(LIST_OF_LOCATIONS_IS_PRESENT),
                "can't find list of locations",
                5
        );

        int amount_of_elements = getAmountOfElements(
                By.xpath(LIST_OF_LOCATIONS_IS_PRESENT)
        );
        Assert.assertEquals("Incorrect number of locations", 31, amount_of_elements);

        Thread.sleep(2000);
        this.waitForElementsAndClick(
                By.xpath(CLICK_ON_FIRST_LOCATION_IN_THE_LIST),
                "can't click on first location in the list",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_EDIT_BUTTON),
                "can't click on edit button",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClear(
                By.xpath(CLEAR_NAME_FIELD),
                "can't clear 'name' field",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndSendKeys(
                By.xpath(INPUT_NAME),
                "CAT",
                "can't input location name",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_SAVE_BUTTON),
                "can't click on 'save' button",
                5
        );
        Thread.sleep(2000);
        this.assertElementHasAttribute(
                By.xpath(LOCATION_NAME_IS_CHANGED),
                "value",
                "CAT",
                "can't confirm that location name is changed"
        );
    }
}
