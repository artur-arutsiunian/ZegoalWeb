package lib.ui.EpicPageObject;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MoveToEpic extends MainPageObject {

    private final static String
    MOVE_TO_EPIC = "//a[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary']";

    public MoveToEpic(WebDriver driver)
    {
        super(driver);
    }

    public void moveToEpicMethod() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(MOVE_TO_EPIC),
                "can't click on 'Epic' tab",
                5
        );
    }
}