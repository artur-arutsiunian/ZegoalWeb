package lib.ui.CRMPageObject.locations;

import lib.ui.MainPageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CreateLocation extends MainPageObject {

    private final static String
    MOVE_TO_CRM = "//span[text()='CRM']",
    LIST_OF_ESSENCE_IS_PRESENT = "//div[@class='MuiTabs-flexContainer']//a",
    COMPANIES_TAB_IS_SELECTED = "//a[@aria-selected='true']",
    COMPANIES_TAB_HAS_CORRECT_TEXT = "//a[@aria-selected='true']//span[text()='Companies']",
    CLICK_ON_LOCATIONS_TAB = "//span[text()='Locations']",
    CLICK_ON_CREATE_BUTTON = "//span[text()='Create']",
    ENTER_NAME_FIELD = "//textarea[@placeholder='Name']",
    CLICK_ON_ADDRESS_FIELD = "//input[@name='address']",
    CLICK_ON_MAP = "//div[@aria-label='Map']",
    CLICK_ON_COMPANY_FIELD = "(//input[@id='adornment-password'])[1]",
    CLICK_ON_FIRST_COMPANY_IN_THE_LIST = "//div[@class='css-1ov7drx']//div",
    CLICK_ON_CREATE_BUTTON_AFTER_FILL_ALL_FIELDS = "//span[text()='Create']",
    TWO_SUBTABS_PRESENT_ON_THE_PAGE_AFTER_CREATION = "//div[@class='MuiTabs-flexContainer']//button";

    public List<WebElement> waitForElementsAndClick(By by, String error_message, long timeoutInSeconds) {
        List<WebElement> elements = this.waitForElementsPresent(by, error_message, 5);
        elements.get(0).click();
        return elements;
    }

    public CreateLocation(WebDriver driver)
    {
        super(driver);
    }

    public void createLocationMethod() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(MOVE_TO_CRM),
                "can't click on 'CRM'",
                5
        );
        Thread.sleep(2000);
        this.waitForElementsPresent(
                By.xpath(LIST_OF_ESSENCE_IS_PRESENT),
                "can't find list of essence",
                5
        );

        int amount_of_elements = getAmountOfElements(
                By.xpath(LIST_OF_ESSENCE_IS_PRESENT)
        );
        Assert.assertEquals("Incorrect number of essence", 4, amount_of_elements);

        Thread.sleep(2000);
        this.assertElementHasAttribute(
                By.xpath(COMPANIES_TAB_IS_SELECTED),
                "aria-selected",
                "true",
                "can't proof that there is selected tab"
        );
        Thread.sleep(2000);
        this.assertElementHasText(
                By.xpath(COMPANIES_TAB_HAS_CORRECT_TEXT),
                "Companies",
                "can't proof that 'companies' tab has correct text"
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_LOCATIONS_TAB),
                "can't click on 'locations' tab",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_CREATE_BUTTON),
                "can't click on 'Create' button",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndSendKeys(
                By.xpath(ENTER_NAME_FIELD),
                "Testing",
                "can't enter location name",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_ADDRESS_FIELD),
                "can't click on 'Address' field",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClickOnScreenByNotInteractableElement(
                By.xpath(CLICK_ON_MAP),
                "can't click on map",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_COMPANY_FIELD),
                "can't click on 'company' field",
                5
        );
        Thread.sleep(15000);
        this.waitForElementsAndClick(
                By.xpath(CLICK_ON_FIRST_COMPANY_IN_THE_LIST),
                "can't click on first company in the list",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_CREATE_BUTTON_AFTER_FILL_ALL_FIELDS),
                "can't click on 'Create' button",
                5
        );
        Thread.sleep(2000);
        this.waitForElementsPresent(
                By.xpath(TWO_SUBTABS_PRESENT_ON_THE_PAGE_AFTER_CREATION),
                "can't find list of subtabs",
                5
        );

        int amount_of_subtabs = getAmountOfElements(
                By.xpath(TWO_SUBTABS_PRESENT_ON_THE_PAGE_AFTER_CREATION)
        );
        Assert.assertEquals("Incorrect number of subtabs", 2, amount_of_subtabs);
    }
}
