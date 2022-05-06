package lib.ui.MapsPageObject;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FilterOnMaps extends MainPageObject {

    private final static String
    MOVE_TO_MAP = "//span[text()='Maps']",
    CLICK_ON_FILTER_BUTTON = "(//span[@class='MuiIconButton-label'])[4]",
    CLICK_ON_GROUPS = "(//span[@class='MuiIconButton-label'])[7]",
    CHOOSE_GROUP = "(//span[@class='MuiIconButton-label'])[9]",
    CONFIRM_CHOICE = "(//span[@class='MuiIconButton-label'])[7]",
    CLICK_ON_TIME_OF_COORDINATES_RECEIPT = "(//span[@class='MuiIconButton-label'])[8]",
    CHOOSE_TIME = "(//span[@class='MuiIconButton-label'])[11]",
    CONFIRM_CHOICE_IN_SECOND_FIELD = "(//span[@class='MuiIconButton-label'])[7]",
    CLICK_ON_APPLY_BUTTON = "//span[text()='Apply']",
    USER_PRESENT_IN_THE_LIST = "//span[text()='И Ф']";

    public FilterOnMaps(WebDriver driver)
    {
        super(driver);
    }

    public void changeFilterCondition() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(MOVE_TO_MAP),
                "can't click on 'Maps'",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_FILTER_BUTTON),
                "can't click on filter button",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_GROUPS),
                "can't click on 'groups'",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CHOOSE_GROUP),
                "can't choose group",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CONFIRM_CHOICE),
                "can't click on confirm(check)",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_TIME_OF_COORDINATES_RECEIPT),
                "can't click on 'time of coordinates receipt",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CHOOSE_TIME),
                "can't choose time",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CONFIRM_CHOICE_IN_SECOND_FIELD),
                "can't click on confirm(check) in second field",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_APPLY_BUTTON),
                "can't click on 'Apply' button",
                5
        );
        Thread.sleep(2000);
        this.assertElementHasText(
                By.xpath(USER_PRESENT_IN_THE_LIST),
                "И Ф",
                "can't find user 'и ф' in the list"
        );
    }
}
