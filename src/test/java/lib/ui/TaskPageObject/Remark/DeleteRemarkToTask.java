package lib.ui.TaskPageObject.Remark;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteRemarkToTask extends MainPageObject {

    private final static String
    CHOOSE_TASK = "(//span[@class='status-cell_link-cell__w93Tz'])[2]",
    CLICK_ON_REMARK = "(//span[@class='status-cell_link-cell__w93Tz'])[2]",
    CLICK_ON_DELETE_REMARK = "(//span[@class='MuiIconButton-label'])[5]",
    CONFIRM_DELETE = "(//span[text()='Yes'])[3]",
    CONFIRM_ABSENCE_OF_REMARK = "(//span[text()='N/A'])[2]";

    public DeleteRemarkToTask(WebDriver driver)
    {
        super(driver);
    }

    public void deleteRemarkMethod() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CHOOSE_TASK),
                "can't click on task",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_REMARK),
                "can't find remark on the page",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_DELETE_REMARK),
                "can't find 'delete' on the page",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CONFIRM_DELETE),
                "can't find 'yes' button",
                5
        );
        Thread.sleep(2000);
        this.assertElementHasText(
                By.xpath(CONFIRM_ABSENCE_OF_REMARK),
                "N/A",
                "can't confirm that there is no remark has been created"
        );
    }
}
