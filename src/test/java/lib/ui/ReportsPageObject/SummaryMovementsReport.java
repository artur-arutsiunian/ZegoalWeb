package lib.ui.ReportsPageObject;

import lib.ui.MainPageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SummaryMovementsReport extends MainPageObject {

    private final static String
    MOVE_TO_REPORTS = "//span[text()='Reports']",
    CLICK_ON_FILTER = "(//span[@class='MuiIconButton-label'])[7]",
    CLICK_ON_TYPE = "(//div[@aria-haspopup='listbox'])[1]",
    CHOOSE_TYPE = "//li[@data-value='summary_movement']",
    CLICK_ON_DATE_PERIOD = "//div[@id='mui-component-select-date_period']",
    CLICK_ON_MONTH = "//li[text()='Month']",
    CLICK_ON_MONTH_FIELD = "//div[@id='mui-component-select-date_interval']",
    CHOOSE_MONTH = "//li[text()='April 2022']",
    CLICK_ON_USERS = "//span[text()='Users']",
    CHOOSE_USER = "//div[text()='andrew andrew']",
    COMPLETE_REPORT_CREATION = "(//button[@class='MuiButtonBase-root MuiIconButton-root'])[9]",
    CLICK_ON_APPLY_BUTTON = "//span[text()='Apply']",
    LIST_OF_COLUMNS_IS_PRESENT = "//th[@class='MuiTableCell-root MuiTableCell-head header_head__t2hQM']",
    USER_IS_PRESENT = "//span[text()='andrew andrew']";

    public SummaryMovementsReport(WebDriver driver)
    {
        super(driver);
    }

    public void summaryMovementReportMethod() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(MOVE_TO_REPORTS),
                "can't click on 'Reports",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_FILTER),
                "can't click on filter",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_TYPE),
                "can't click on 'type'",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CHOOSE_TYPE),
                "can't choose type",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_DATE_PERIOD),
                "can't click on 'date period",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_MONTH),
                "Can't click on month",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_MONTH_FIELD),
                "can't click on month field",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CHOOSE_MONTH),
                "Can't choose month",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_USERS),
                "can't click on 'users'",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CHOOSE_USER),
                "can't choose user",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(COMPLETE_REPORT_CREATION),
                "can't click on complete button",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_APPLY_BUTTON),
                "can't click on 'Apply' button",
                5
        );
        Thread.sleep(2000);
        this.waitForElementsPresent(
                By.xpath(LIST_OF_COLUMNS_IS_PRESENT),
                "can't find list of columns",
                5
        );

        int amount_of_elements = getAmountOfElements(
                By.xpath(LIST_OF_COLUMNS_IS_PRESENT)
        );
        Assert.assertEquals("Incorrect number of columns", 6, amount_of_elements);

        Thread.sleep(2000);
        this.assertElementHasText(
                By.xpath(USER_IS_PRESENT),
                "andrew andrew",
                "can't find 'andrew andrew' user"
        );
    }
}
