package lib.ui.StaffPageObject;

import lib.ui.MainPageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EditUser extends MainPageObject {

    private final static String
    SIDE_TAB_STAFF = "//span[text()='Staff']",
    LIST_OF_USERS_IS_PRESENT = "//div[@class='scrollable-list_container__2NtNz']/div/div",
    CLICK_ON_FIRST_USER_IN_THE_LIST = "//div[@class='scrollable-list_container__2NtNz']/div/div",
    CLICK_ON_EDIT_BUTTON = "(//span[@class='MuiIconButton-label'])[5]",
    CLEAR_FIRST_NAME_FIELD = "//textarea[@name='firstName']",
    INPUT_FIRST_NAME = "//textarea[@name='firstName']",
    CLEAR_LAST_NAME_FIELD = "//textarea[@name='lastName']",
    INPUT_LAST_NAME = "//textarea[@name='lastName']",
    CLICK_ON_SAVE_BUTTON = "//span[text()='Save']",
    USERNAME_IS_CHANGED = "(//span[text()='11 22'])[2]";

    public List<WebElement> waitForElementsAndClick(By by, String error_message, long timeoutInSeconds) {
        List<WebElement> elements = this.waitForElementsPresent(by, error_message, 5);
        elements.get(0).click();
        return elements;
    }

    public EditUser(WebDriver driver)
    {
        super(driver);
    }

    public void editUserMethod() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(SIDE_TAB_STAFF),
                "can't click 'staff' side tab",
                5
        );
        Thread.sleep(2000);
        this.waitForElementsPresent(
                By.xpath(LIST_OF_USERS_IS_PRESENT),
                "can't find list of users",
                5
        );

        int amount_of_elements = getAmountOfElements(
                By.xpath(LIST_OF_USERS_IS_PRESENT)
        );
        Assert.assertEquals("Incorrect number of users", 30, amount_of_elements);

        Thread.sleep(2000);
        this.waitForElementsAndClick(
                By.xpath(CLICK_ON_FIRST_USER_IN_THE_LIST),
                "can't click on first user in the list",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_EDIT_BUTTON),
                "can't click on edit button",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClear(
                By.xpath(CLEAR_FIRST_NAME_FIELD),
                "can't clear first name field",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndSendKeys(
                By.xpath(INPUT_FIRST_NAME),
                "11",
                "can't input first name",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClear(
                By.xpath(CLEAR_LAST_NAME_FIELD),
                "can't clear last name field",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndSendKeys(
                By.xpath(INPUT_LAST_NAME),
                "22",
                "can't input last name",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_SAVE_BUTTON),
                "can't click on 'save' button",
                5
        );
        Thread.sleep(2000);
        this.assertElementHasText(
                By.xpath(USERNAME_IS_CHANGED),
                "11 22",
                "can't confirm username is changed"
        );
    }
}
