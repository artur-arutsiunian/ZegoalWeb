package lib.ui.Task;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditTaskPageObject extends MainPageObject {

    private final static String
    CHOOSE_TASK = "(//span[@class='status-cell_link-cell__w93Tz'])[1]",
    CLICK_ON_EDIT_TASK = "(//span[@class='MuiIconButton-label'])[7]",
    CLEAR_ASSIGNEE_FIELD = "(//span[@class='MuiIconButton-label'])[5]",
    CLICK_ON_ASSIGNEE_FIELD = "(//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedStart'])[1]",
    CHOOSE_ASSIGNEE = "(//span[@class='MuiIconButton-label'])[18]",
    SAVE_BUTTON = "//span[text()='Save']",
    ASSIGNEE_WHICH_WAS_CHANGED_PRESENT_ON_THE_PAGE = "//div[text()='Brad Rouse']";

    public EditTaskPageObject(WebDriver driver)
    {
        super(driver);
    }

    public void editTaskMethod() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CHOOSE_TASK),
                "can't click on task",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_EDIT_TASK),
                "can't click on 'edit' task",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLEAR_ASSIGNEE_FIELD),
                "can't click on 'X' in assignee field",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_ASSIGNEE_FIELD),
                "can't click on assignee field",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CHOOSE_ASSIGNEE),
                "can't choose assignee",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(SAVE_BUTTON),
                "can't click on 'save' button",
                5
        );
        Thread.sleep(2000);
        this.waitForElementPresent(
                By.xpath(ASSIGNEE_WHICH_WAS_CHANGED_PRESENT_ON_THE_PAGE),
                "can't find assignee which was changed",
                5
        );
    }
}
