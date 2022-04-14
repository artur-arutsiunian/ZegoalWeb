package lib.ui.Epic;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EpicPageObject extends MainPageObject {

    private final static String
    MOVE_TO_EPIC = "//a[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary']",
    CREATE_BUTTON = "//button[@class='add-button_addButton__1w3Jt button_green__zFAs3 button_zgButton__19tY7']",
    ENTER_EPIC_NAME = "(//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedStart'])[1]",
    CLICK_ON_ASSIGNEE_FIELD = "(//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedStart'])[2]",
    CHOOSE_ASSIGNEE = "(//span[@class='MuiIconButton-label'])[10]",
    COMPLETE_EPIC_CREATION = "//span[@class='button_title__3rgHS']",
    CLOSE_BUTTON = "(//span[@class='MuiIconButton-label'])[4]",
    NAME_ON_TOP = "//div[text()='Tasks']";


    public EpicPageObject(WebDriver driver)
    {
        super(driver);
    }

    public void createEpicMethod() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(MOVE_TO_EPIC),
                "can't click on 'Epic'",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CREATE_BUTTON),
                "can't click on 'Create' button",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndSendKeys(
                By.xpath(ENTER_EPIC_NAME),
                "Epic for auto test",
                "can't enter epic name",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_ASSIGNEE_FIELD),
                "can't find 'Assignee' field",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CHOOSE_ASSIGNEE),
                "can't choose assignee",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(COMPLETE_EPIC_CREATION),
                "can't click on final 'Create' button",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLOSE_BUTTON),
                "can't click on 'close' button",
                5
        );
        Thread.sleep(2000);
        this.waitForElementPresent(
                By.xpath(NAME_ON_TOP),
                "",
                5
        );
    }
}