package lib.ui.TaskPageObject;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteTask extends MainPageObject {

    private final static String
    CHOOSE_TASK = "(//span[@class='status-cell_link-cell__w93Tz'])[6]",
    DELETE_TASK = "(//span[@class='MuiIconButton-label'])[8]",
    CONFIRM_DELETE = "//span[text()='Delete']",
    TASK_TAB_IS_SELECTED = "//a[@aria-selected='true']",
    TASK_TAB_HAS_CORRECT_TEXT = "//a[@aria-selected='true']//span[text()='Individual']";

    public DeleteTask(WebDriver driver)
    {
        super(driver);
    }

    public void deleteTaskMethod() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CHOOSE_TASK),
                "can't click on task",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(DELETE_TASK),
                "can't click on 'delete' task",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CONFIRM_DELETE),
                "can't click 'delete'",
                5
        );
        Thread.sleep(2000);
        this.assertElementHasAttribute(
                By.xpath(TASK_TAB_IS_SELECTED),
                "aria-selected",
                "true",
                "can't confirm that task tab is selected"
        );
        Thread.sleep(5000);
        this.assertElementHasText(
                By.xpath(TASK_TAB_HAS_CORRECT_TEXT),
                "Individual",
                "can't proof that task has correct text"
        );
    }
}
