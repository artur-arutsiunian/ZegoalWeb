package lib.ui.TaskPageObject.Remark;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemarkToTask extends MainPageObject {

    private final static String
    CHOOSE_TASK = "(//span[@class='status-cell_link-cell__w93Tz'])[2]",
    CONFIRM_ABSENCE_OF_REMARK = "(//span[text()='N/A'])[2]",
    CLICK_ON_CREATE_REMARK = "(//span[@class='MuiIconButton-label'])[6]",
    ENTER_NAME = "//textarea[@placeholder='Name']",
    COMPLETE_CREATE_REMARK = "(//span[@class='MuiIconButton-label'])[11]",
    REMARK_EXISTS_ON_THE_PAGE = "(//div[@class='container_container__2CrLs'])[2]";

    public AddRemarkToTask(WebDriver driver)
    {
        super(driver);
    }

    public void addRemarkMethod() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CHOOSE_TASK),
                "can't click on task",
                5
        );
        Thread.sleep(2000);
        this.waitForElementPresent(
                By.xpath(CONFIRM_ABSENCE_OF_REMARK),
                "can't confirm that there is no remark has been created",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_CREATE_REMARK),
                "can't click on add remark",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndSendKeys(
                By.xpath(ENTER_NAME),
                "remark 555",
                "can't enter name of remark",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(COMPLETE_CREATE_REMARK),
                "can't find complete check",
                5
        );
        Thread.sleep(2000);
        this.waitForElementPresent(
                By.xpath(REMARK_EXISTS_ON_THE_PAGE),
                "can't find remark on the page",
                5
        );
    }
}
