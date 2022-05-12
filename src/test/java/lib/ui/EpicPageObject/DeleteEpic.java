package lib.ui.EpicPageObject;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteEpic extends MainPageObject {

    private final static String
    CLICK_ON_EPIC = "(//span[@class='status-cell_link-cell__ihudg'])[1]",
    DELETE_EPIC = "(//span[@class='MuiIconButton-label'])[5]",
    CONFIRM_DELETE = "(//span[text()='Yes'])[2]",
    EPIC_TAB_IS_SELECTED = "//a[@aria-selected='true']",
    EPIC_TAB_HAS_CORRECT_TEXT = "//a[@aria-selected='true']//span[text()='Epics']";

    public DeleteEpic(WebDriver driver)
    {
        super(driver);
    }

    public void deleteEpicMethod() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_EPIC),
                "can't click on epic",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(DELETE_EPIC),
                "can't click on 'delete' epic",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CONFIRM_DELETE),
                "can't click 'yes'",
                5
        );
        Thread.sleep(2000);
        this.assertElementHasAttribute(
                By.xpath(EPIC_TAB_IS_SELECTED),
                "aria-selected",
                "true",
                "can't proof that epic is selected"
        );
        Thread.sleep(2000);
        this.assertElementHasText(
                By.xpath(EPIC_TAB_HAS_CORRECT_TEXT),
                "Epics",
                "can't proof that epic has correct text"
        );
    }
}
