package lib.ui.StaffPageObject;

import lib.ui.MainPageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchUser extends MainPageObject {

    private final static String
    SIDE_TAB_STAFF = "//span[text()='Staff']",
    LIST_OF_USERS_IS_PRESENT = "//div[@class='scrollable-list_container__2NtNz']/div/div",
    INPUT_NAME_IN_SEARCH_FIELD = "//input[@placeholder='Search']",
    ONE_USER_IN_THE_LIST_IS_PRESENT = "(//div[@class='scrollable-list_container__2NtNz']/div/div)[1]",
    USER_PRESENT_IN_THE_LIST = "//span[text()='11 22']";

    public SearchUser(WebDriver driver)
    {
        super(driver);
    }

    public void searchUserMethod() throws InterruptedException {
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
        this.waitForElementAndSendKeys(
                By.xpath(INPUT_NAME_IN_SEARCH_FIELD),
                "11 22",
                "can't input username in search field",
                5
        );
        Thread.sleep(2000);
        this.waitForElementsPresent(
                By.xpath(ONE_USER_IN_THE_LIST_IS_PRESENT),
                "can't find list of users",
                5
        );

        int one_element = getAmountOfElements(
                By.xpath(ONE_USER_IN_THE_LIST_IS_PRESENT)
        );
        Assert.assertEquals("Incorrect number of users", 1, one_element);

        Thread.sleep(2000);
        this.assertElementHasText(
                By.xpath(USER_PRESENT_IN_THE_LIST),
                "11 22",
                "can't confirm that user present in the list"
        );
    }
}
