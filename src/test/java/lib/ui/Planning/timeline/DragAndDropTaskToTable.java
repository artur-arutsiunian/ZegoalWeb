package lib.ui.Planning.timeline;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTaskToTable extends MainPageObject {

    private final static String
            MOVE_TO_PLANNING = "//span[text()='Planning']",
            MOVE_TASK = "//span[text()='23new']",
            TASK_WAS_MOVED_AND_LOCATED_IN_THE_TABLE = "//a[@class='fc-timeline-event fc-h-event fc-event fc-event-draggable fc-event-resizable fc-event-start fc-event-today']",
            TASK_WAS_MOVED_AND_HAS_CORRECT_TEXT = "//a[@class='fc-timeline-event fc-h-event fc-event fc-event-draggable fc-event-resizable fc-event-start fc-event-today']//span[text()='23new']";

    public void moveToElementForDrop(By by, String error_message, long timeoutInSeconds){
        WebElement element = waitForElementPresent(by, error_message, timeoutInSeconds);
        WebElement element2 = driver.findElement(By.xpath("//tr/td[@data-date='2022-06-28T06:00:00']"));
        Actions actions = new Actions(driver);
        actions
                .dragAndDrop(element,element2)
                .build()
                .perform();
    }

    public DragAndDropTaskToTable(WebDriver driver)
    {
        super(driver);
    }

    public void dragAndDropTaskToTableMethod() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(MOVE_TO_PLANNING),
                "can't click on 'Planning'",
                5
        );
        Thread.sleep(10000);
        this.moveToElementForDrop(
                By.xpath(MOVE_TASK),
                "can't move task",
                5
        );
        Thread.sleep(5000);
        this.assertElementHasAttribute(
                By.xpath(TASK_WAS_MOVED_AND_LOCATED_IN_THE_TABLE),
                "class",
                "fc-timeline-event fc-h-event fc-event fc-event-draggable fc-event-resizable fc-event-start fc-event-today",
                "can't confirm that task was moved to the table"
        );
        Thread.sleep(5000);
        this.assertElementHasText(
                By.xpath(TASK_WAS_MOVED_AND_HAS_CORRECT_TEXT),
                "23new",
                "can't confirm that task was moved to the table and has correct text"
        );
    }
}

