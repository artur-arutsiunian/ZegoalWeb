package lib.ui.CRMPageObject.companies;

import lib.ui.MainPageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EditCompany extends MainPageObject {

    private final static String
    MOVE_TO_CRM = "//span[text()='CRM']",
    LIST_OF_COMPANIES_IS_PRESENT = "//div[@class='scrollable-list_container__2NtNz']/div/div",
    CLICK_ON_FIRST_COMPANY_IN_THE_LIST = "//div[@class='scrollable-list_container__2NtNz']/div/div",
    CLICK_ON_EDIT_BUTTON = "(//span[@class='MuiIconButton-label'])[8]",
    CLEAR_EMAIL_FIELD = "//input[@placeholder='Email']",
    INPUT_EMAIL = "//input[@placeholder='Email']",
    CLICK_ON_SAVE_BUTTON = "//span[text()='Save']",
    COMPANY_EMAIL_IS_CHANGED = "//input[@value='new@mail.com']";

    public List<WebElement> waitForElementsAndClick(By by, String error_message, long timeoutInSeconds) {
        List<WebElement> elements = this.waitForElementsPresent(by, error_message, 5);
        elements.get(0).click();
        return elements;
    }

    public EditCompany(WebDriver driver)
    {
        super(driver);
    }

    public void editCompanyMethod() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(MOVE_TO_CRM),
                "can't click on 'CRM'",
                5
        );
        Thread.sleep(2000);
        this.waitForElementsPresent(
                By.xpath(LIST_OF_COMPANIES_IS_PRESENT),
                "can't find list of companies",
                5
        );

        int amount_of_elements = getAmountOfElements(
                By.xpath(LIST_OF_COMPANIES_IS_PRESENT)
        );
        Assert.assertEquals("Incorrect number of companies", 31, amount_of_elements);

        Thread.sleep(2000);
        this.waitForElementsAndClick(
                By.xpath(CLICK_ON_FIRST_COMPANY_IN_THE_LIST),
                "can't click on first company in the list",
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
                By.xpath(CLEAR_EMAIL_FIELD),
                "can't clear name field",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndSendKeys(
                By.xpath(INPUT_EMAIL),
                "new@mail.com",
                "can't input company name",
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
                By.xpath(COMPANY_EMAIL_IS_CHANGED),
                "value",
                "new@mail.com",
                "can't confirm that company name is changed"
        );
    }
}
