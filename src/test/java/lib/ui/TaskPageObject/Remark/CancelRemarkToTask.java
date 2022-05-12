package lib.ui.TaskPageObject.Remark;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CancelRemarkToTask extends MainPageObject {

    private final static String
    CHOOSE_TASK = "(//span[@class='status-cell_link-cell__w93Tz'])[2]",
    CLICK_ON_CREATE_REMARK = "(//span[@class='MuiIconButton-label'])[6]",
    CANCEL_ADD_REMARK = "(//span[@class='MuiIconButton-label'])[10]",
    BACK_TO_MAIN_PAGE = "(//span[@class='MuiIconButton-label'])[4]",
    TASK_TAB_IS_SELECTED = "//a[@aria-selected='true']",
    TASK_TAB_HAS_CORRECT_TEXT = "//a[@aria-selected='true']//span[text()='Individual']";

    public CancelRemarkToTask(WebDriver driver)
    {
        super(driver);
    }

    public void RepeatCyclesForBackToMainPage() throws InterruptedException {
        int number_of_tapping_numbers=0;
        while(number_of_tapping_numbers<1){
            this.waitForElementAndClick(By.xpath(BACK_TO_MAIN_PAGE),"Cannot back to main page",5);
            ++number_of_tapping_numbers;}
    }

    public void cancelRemarkMethod() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementAndClick(
                By.xpath(CHOOSE_TASK),
                "can't click on task",
                5
        );
        Thread.sleep(5000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_CREATE_REMARK),
                "can't click on add comment",
                5
        );
        Thread.sleep(5000);
        this.waitForElementAndClick(
                By.xpath(CANCEL_ADD_REMARK),
                "can't click on 'x' button",
                5
        );
        Thread.sleep(5000);
        this.waitForElementAndClick(
                By.xpath(BACK_TO_MAIN_PAGE),
                "can't click on 'x' second time",
                5
        );
        Thread.sleep(3000);
        RepeatCyclesForBackToMainPage();

        Thread.sleep(5000);
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