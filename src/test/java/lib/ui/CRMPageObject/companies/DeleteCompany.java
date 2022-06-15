package lib.ui.CRMPageObject.companies;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteCompany extends MainPageObject {

    private final static String
    MOVE_TO_CRM = "//span[text()='CRM']",
    ENTER_NAME_IN_SEARCH_FIELD = "//input[@placeholder='Search']",
    CLICK_ON_COMPANY = "//span[text()='Artur']",
    CLICK_ON_DELETE_BUTTON = "(//span[@class='MuiIconButton-label'])[7]",
    CLICK_ON_YES_BUTTON = "(//span[text()='Yes'])[3]",
    CLEAR_SEARCH_FIELD = "(//span[@class='MuiIconButton-label'])[6]",
    ENTER_NAME_IN_SEARCH_FIELD_AGAIN = "//input[@placeholder='Search']",
    LIST_IS_EMPTY = "//span[text()='Empty list']";

    public DeleteCompany(WebDriver driver)
    {
        super(driver);
    }

    public void deleteCompanyMethod() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(MOVE_TO_CRM),
                "can't click on 'CRM'",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndSendKeys(
                By.xpath(ENTER_NAME_IN_SEARCH_FIELD),
                "Artur",
                "can't enter name in 'search' field'",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_COMPANY),
                "can't click on company",
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
                "Artur",
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
