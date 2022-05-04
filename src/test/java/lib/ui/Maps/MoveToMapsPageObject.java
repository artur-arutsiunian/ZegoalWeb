package lib.ui.Maps;

import lib.ui.MainPageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MoveToMapsPageObject extends MainPageObject {

    private final static String
    MOVE_TO_MAP = "//span[text()='Maps']",
    ENTER_USER_NAME_IN_SEARCH_FIELD = "//input[@placeholder='Search']",
    CLICK_ON_USER = "//div[@class='list-item_content__5t3GV list-item_clickable__1ctvR list-item_padded__3YGFx list-item_roundedLeft__15mQL']",
    CONFIRM_USER_NAME = "//div[text()='Имя Фамилия']",
    CLOSE_SIDE_BAR = "(//span[@class='MuiIconButton-label'])[6]",
    DELETE_USER_NAME_FROM_SEARCH_FIELD = "(//span[@class='MuiIconButton-label'])[5]",
    LIST_OF_USERS_PRESENT = "//div[@class='scrollable-list_container__2NtNz']/div/div",
    USER_NAME_FIELD_IS_EMPTY = "//input[@placeholder='Search']";

    public MoveToMapsPageObject(WebDriver driver)
    {
        super(driver);
    }

    public int getAmountOfElements(By by)
    {
        List elements = driver.findElements(by);
        return elements.size();
    }

    public List<WebElement> waitForElementsPresentSize(By by, String error_message, long timeoutInSeconds) {
        List<WebElement> elements = this.waitForElementsPresent(by, error_message, 5);
        elements.size();
        return elements;
    }

    public void chooseUserOnMap() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(MOVE_TO_MAP),
                "can't click on 'Maps'",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndSendKeys(
                By.xpath(ENTER_USER_NAME_IN_SEARCH_FIELD),
                "имя",
                "can't enter user name in search field",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_USER),
                "can't click on user",
                5
        );
        Thread.sleep(2000);
        this.waitForElementPresent(
                By.xpath(CONFIRM_USER_NAME),
                "can't confirm that user name present on the page",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLOSE_SIDE_BAR),
                "can't click on 'x'",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(DELETE_USER_NAME_FROM_SEARCH_FIELD),
                "can't delete user name from search field",
                5
        );
        Thread.sleep(2000);
        this.waitForElementsPresentSize(
                By.xpath(LIST_OF_USERS_PRESENT),
                "can't find list of users",
                5
        );

        int amount_of_elements = getAmountOfElements(
                By.xpath(LIST_OF_USERS_PRESENT)
        );
        Assert.assertEquals("Found too many users", 30, amount_of_elements);

//        Thread.sleep(2000);
//        this.waitForElementPresent(
//                By.xpath(USER_NAME_FIELD_IS_EMPTY),
//                "can't receive determined element",
//                5
//        );
    }
}
