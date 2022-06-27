package lib.ui.PlanningPageObject.timeline;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTaskToTable extends MainPageObject {

    private final static String
    MOVE_TO_PLANNING = "//span[text()='Planning']",
    MOVE_TASK = "(//span[text()='97'])",
    TASK_WAS_MOVED = "(//span[text()='97'])[1]";

    public WebElement moveToElement(By by, String error_message, long timeoutInSeconds){
        WebElement element = waitForElementPresent(by, error_message, timeoutInSeconds);
        WebElement element2 = driver.findElement(By.xpath("//tr/td[@data-date='2022-06-27T06:00:00']"));
        Actions actions = new Actions(driver);
        actions
                .dragAndDrop(element,element2)
                .build()
                .perform();
        return element;
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
        this.moveToElement(
                By.xpath(MOVE_TASK),
                "can't move task",
                5
        );

        Thread.sleep(5000);
        this.assertElementHasText(
                By.xpath(TASK_WAS_MOVED),
                "97",
                "can't confirm that task was moved to the table"
        );
    }
}