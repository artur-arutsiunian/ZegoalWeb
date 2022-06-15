package lib.ui.CRMPageObject.companies;

import lib.ui.MainPageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateCompany extends MainPageObject {

    private final static String
    MOVE_TO_CRM = "//span[text()='CRM']",
    LIST_OF_ESSENCE_IS_PRESENT = "//div[@class='MuiTabs-flexContainer']//a",
    COMPANIES_TAB_IS_SELECTED = "//a[@aria-selected='true']",
    COMPANIES_TAB_HAS_CORRECT_TEXT = "//a[@aria-selected='true']//span[text()='Companies']",
    CLICK_ON_CREATE_BUTTON = "//span[text()='Create']",
    ENTER_LOCATION_NAME = "//input[@placeholder='Name']",
    CLICK_ON_ADDRESS_FIELD = "//input[@name='address']",
    CLICK_ON_MAP = "//div[@aria-label='Map']",
    CLICK_ON_CREATE_BUTTON_AFTER_FILL_ALL_FIELDS = "//span[text()='Create']",
    COMPANY_NAME_IS_PRESENT = "(//span[text()='Artur'])[2]";

    public CreateCompany(WebDriver driver)
    {
        super(driver);
    }

    public void createCompanyMethod() throws InterruptedException {
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
                By.xpath(CLICK_ON_CREATE_BUTTON),
                "can't click on 'Create' button",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndSendKeys(
                By.xpath(ENTER_LOCATION_NAME),
                "Artur",
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
                By.xpath(CLICK_ON_CREATE_BUTTON_AFTER_FILL_ALL_FIELDS),
                "can't click on 'Create' button",
                5
        );
        Thread.sleep(2000);
        this.assertElementHasText(
                By.xpath(COMPANY_NAME_IS_PRESENT),
                "Artur",
                "can't confirm that company has correct name"
        );
    }
}