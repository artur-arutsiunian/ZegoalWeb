package lib.ui.StaffPageObject;

import lib.ui.MainPageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ActivateUser extends MainPageObject {

    private final static String
    SIDE_TAB_STAFF = "//span[text()='Staff']",
    LIST_OF_USERS_IS_PRESENT = "//div[@class='scrollable-list_container__2NtNz']/div/div",
    CLICK_ON_FIRST_USER_IN_THE_LIST = "//div[@class='scrollable-list_container__2NtNz']/div/div",
    CLICK_ON_ACTIVATE_BUTTON = "//span[text()='Activate']",
    DEACTIVATED_TEXT_IS_NOT_PRESENT = "//div[@class='viewer-header_is-active__2LN3v']";

    public List<WebElement> waitForElementsAndClick(By by, String error_message, long timeoutInSeconds) {
        List<WebElement> elements = this.waitForElementsPresent(by, error_message, 5);
        elements.get(0).click();
        return elements;
    }

    public ActivateUser(WebDriver driver)
    {
        super(driver);
    }

    public void activateUserMethod() throws InterruptedException {
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
                By.xpath(CLICK_ON_ACTIVATE_BUTTON),
                "can't click on 'Activate' button",
                5
        );
        Thread.sleep(4000);
        this.waitForElementNotPresent(
                By.xpath(DEACTIVATED_TEXT_IS_NOT_PRESENT),
                "can't confirm that 'deactivated' is not present",
                5
        );
    }
}
