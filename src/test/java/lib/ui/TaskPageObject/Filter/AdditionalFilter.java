package lib.ui.TaskPageObject.Filter;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdditionalFilter extends MainPageObject {

    private final static String
    CUSTOM_BUTTON = "//span[text()='Custom']",
    DUE_TODAY_ELEMENT_OF_LIST = "//span[text()='Due today']",
    DUE_TODAY_CHOSEN_ON_THE_PAGE = "//span[text()='Due today']";

    public AdditionalFilter(WebDriver driver)
    {
        super(driver);
    }

    public void changeAdditionalFilterCondition() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CUSTOM_BUTTON),
                "can't find 'Custom' button",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(DUE_TODAY_ELEMENT_OF_LIST),
                "can't click on 'Due today'",
                5
        );
        Thread.sleep(2000);
        this.assertElementHasText(
                By.xpath(DUE_TODAY_CHOSEN_ON_THE_PAGE),
                "Due today",
                "can't find 'Due today' on the page"
        );
    }
}
