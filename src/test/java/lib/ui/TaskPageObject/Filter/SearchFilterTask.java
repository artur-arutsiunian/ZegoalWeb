package lib.ui.TaskPageObject.Filter;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchFilterTask extends MainPageObject {

    private final static String
    SEARCH_FIELD = "//input[@placeholder='Search']",
    TASK_PRESENT_ON_THE_PAGE = "//span[text()='100']",
    DELETE_DATA_FROM_THE_FIELD = "(//span[@class='MuiIconButton-label'])[5]",
    TASK_IS_NOT_PRESENT_ON_THE_PAGE = "//span[text()='100']";

    public SearchFilterTask(WebDriver driver)
    {
        super(driver);
    }

    public void inputDataInsideField() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndSendKeys(
                By.xpath(SEARCH_FIELD),
                "100",
                "can't enter data in search field",
                5
        );
        Thread.sleep(2000);
        this.waitForElementPresent(
                By.xpath(TASK_PRESENT_ON_THE_PAGE),
                "can't find task with id=100",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(DELETE_DATA_FROM_THE_FIELD),
                "can't delete data from the filed",
                5
        );
        Thread.sleep(2000);
        this.waitForElementNotPresent(
                By.xpath(TASK_IS_NOT_PRESENT_ON_THE_PAGE),
                "Can't assure that task isn't present on the page",
                5
        );
    }
}