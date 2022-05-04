package lib.ui.Task;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddLabelToTaskPageObject extends MainPageObject {

    private final static String
    CHOOSE_TASK = "(//span[@class='status-cell_link-cell__w93Tz'])[1]",
    CLICK_ON_LABEL_FIELD = "(//div[text()='N/A'])[1]",
    ADD_LABEL = "//li[text()='Фиолетовая метка']",
    LABEL_PRESENT_ON_THE_PAGE = "//div[text()='Фиолетовая метка']";

    public AddLabelToTaskPageObject(WebDriver driver)
    {
        super(driver);
    }

    public void addLabelMethod() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CHOOSE_TASK),
                "can't click on task",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_LABEL_FIELD),
                "can't find 'label field",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(ADD_LABEL),
                "can't click on label",
                5
        );
        Thread.sleep(2000);
        this.waitForElementPresent(
                By.xpath(LABEL_PRESENT_ON_THE_PAGE),
                "can't confirm that label present on the page",
                5
        );
    }
}
