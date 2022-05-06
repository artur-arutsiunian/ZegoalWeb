package lib.ui.TaskPageObject;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddLabelToTask extends MainPageObject {

    private final static String
    CHOOSE_TASK = "(//span[@class='status-cell_link-cell__w93Tz'])[1]",
    CLICK_ON_LABEL_FIELD = "(//div[text()='N/A'])[1]",
    ADD_LABEL2 = "//div[@class='MuiPaper-root MuiMenu-paper MuiPopover-paper MuiPaper-elevation8 MuiPaper-rounded']/ul/li",
    ADD_LABEL = "//li[text()='Фиолетовая метка']",
    LABEL_PRESENT_ON_THE_PAGE = "//div[text()='Фиолетовая метка']";

    public AddLabelToTask(WebDriver driver)
    {
        super(driver);
    }

//    public List<WebElement> waitForElementsAndClick(By by, String error_message, long timeoutInSeconds) {
//        List<WebElement> elements = this.waitForElementsPresent(by, error_message, 5);
//        elements.get(1).click();
//        return elements;
//    }

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
//                Thread.sleep(2000);
//        this.waitForElementsAndClick(
//                By.xpath(ADD_LABEL2),
//                "can't click on label",
//                5
//        );
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
