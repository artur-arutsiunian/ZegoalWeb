package lib.ui.CRMPageObject.assets;

import lib.ui.MainPageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CreateAsset extends MainPageObject {

    private final static String
    MOVE_TO_CRM = "//span[text()='CRM']",
    LIST_OF_ESSENCE_IS_PRESENT = "//div[@class='MuiTabs-flexContainer']//a",
    COMPANIES_TAB_IS_SELECTED = "//a[@aria-selected='true']",
    COMPANIES_TAB_HAS_CORRECT_TEXT = "//a[@aria-selected='true']//span[text()='Companies']",
    CLICK_ON_ASSET_TAB = "//span[text()='Asset']",
    CLICK_ON_CREATE_BUTTON = "//span[text()='Create']",
    ENTER_NAME_FIELD = "//input[@placeholder='Name']",
    CLICK_ON_LOCATION_FIELD = "(//input[@id='adornment-password'])[1]",
    CLICK_ON_FIRST_LOCATION_IN_THE_LIST = "//div[@class='css-1ov7drx']//div",
    CLICK_ON_CREATE_BUTTON_AFTER_FILL_ALL_FIELDS = "//span[text()='Create']",
    ASSET_NAME_IS_PRESENT = "//span[text()='wheel']";

    public List<WebElement> waitForElementsAndClick(By by, String error_message, long timeoutInSeconds) {
        List<WebElement> elements = this.waitForElementsPresent(by, error_message, 5);
        elements.get(0).click();
        return elements;
    }

    public CreateAsset(WebDriver driver)
    {
        super(driver);
    }

    public void createAssetMethod() throws InterruptedException {
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
                By.xpath(CLICK_ON_ASSET_TAB),
                "can't click on 'asset' tab",
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
                "wheel",
                "can't enter asset name",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_LOCATION_FIELD),
                "can't click on 'Location' field",
                5
        );
        Thread.sleep(5000);
        this.waitForElementsAndClick(
                By.xpath(CLICK_ON_FIRST_LOCATION_IN_THE_LIST),
                "can't click on first location in the list",
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
                By.xpath(ASSET_NAME_IS_PRESENT),
                "wheel",
                "can't confirm that asset has correct name"
        );
    }
}
