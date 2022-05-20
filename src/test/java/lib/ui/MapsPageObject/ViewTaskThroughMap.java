package lib.ui.MapsPageObject;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ViewTaskThroughMap extends MainPageObject {

    private final static String
    MOVE_TO_MAP = "//span[text()='Maps']",
    CHOOSE_USER = "(//span[text()='andrew andrew'])[2]",
    CLICK_ON_VIEW_TASK = "//span[text()='View tasks']",
    ASSIGNEE_PRESENT_ON_THE_PAGE = "(//div[@title='andrew andrew'])[2]";

    public ViewTaskThroughMap(WebDriver driver)
    {
        super(driver);
    }

    public void moveToTaskThroughMap() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(MOVE_TO_MAP),
                "can't click on 'Maps'",
                5
        );
        this.waitForElementAndClick(
                By.xpath(CHOOSE_USER),
                "can't click on user",
                5
        );
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_VIEW_TASK),
                "can't click on 'view task'",
                5
        );
        this.assertElementHasText(
                By.xpath(ASSIGNEE_PRESENT_ON_THE_PAGE),
                "andrew andrew",
                "can't proof that assignee is chosen"
        );
    }
}
