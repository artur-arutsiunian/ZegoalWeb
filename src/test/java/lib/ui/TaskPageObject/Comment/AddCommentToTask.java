package lib.ui.TaskPageObject.Comment;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCommentToTask extends MainPageObject {

    private final static String
    CHOOSE_TASK = "(//span[@class='status-cell_link-cell__w93Tz'])[2]",
    CLICK_ON_CREATE_COMMENT = "(//span[@class='MuiIconButton-label'])[5]",
    ENTER_COMMENT = "//textarea[@class='add-comment_commentTextArea__304HA']",
    ADD_BUTTON = "//span[text()='Add']",
    COMMENT_IS_PRESENT_ON_THE_PAGE = "//span[text()='i add comment']";

    public AddCommentToTask(WebDriver driver)
    {
        super(driver);
    }

    public void addCommentMethod() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CHOOSE_TASK),
                "can't click on task",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_CREATE_COMMENT),
                "can't click on add comment",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndSendKeys(
                By.xpath(ENTER_COMMENT),
                "i add comment",
                "can't enter comment",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(ADD_BUTTON),
                "can't click on 'add' button",
                5
        );
        Thread.sleep(5000);
        this.assertElementHasText(
                By.xpath(COMMENT_IS_PRESENT_ON_THE_PAGE),
                "i add comment",
                "can't confirm that comment present on the page"
        );
    }
}
