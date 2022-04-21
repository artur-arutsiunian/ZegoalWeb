package lib.ui.Epic;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteEpicPageObject extends MainPageObject {

    private final static String
    MOVE_TO_EPIC = "//a[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary']",
    CLICK_ON_EPIC = "//span[text()='7']",
    DELETE_EPIC = "(//span[@class='MuiIconButton-label'])[5]",
    CONFIRM_DELETE = "(//span[text()='Yes'])[2]",
    EPIC_IS_NOT_PRESENT_ON_THE_PAGE = "//span[text()='7']";

    public DeleteEpicPageObject(WebDriver driver)
    {
        super(driver);
    }

    public void deleteEpicMethod(){
        this.waitForElementAndClick(
                By.xpath(MOVE_TO_EPIC),
                "can't click on 'Epic' tab",
                5
        );
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_EPIC),
                "can't click on epic",
                5
        );
        this.waitForElementAndClick(
                By.xpath(DELETE_EPIC),
                "can't click on 'delete' epic",
                5
        );
        this.waitForElementAndClick(
                By.xpath(CONFIRM_DELETE),
                "can't click 'yes'",
                5
        );
        this.waitForElementNotPresent(
                By.xpath(EPIC_IS_NOT_PRESENT_ON_THE_PAGE),
                "Can't assure that epic isn't present on the page",
                5
        );
    }
}
