package lib.ui.EpicPageObject.Filter;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainFilterEpic extends MainPageObject {

    private final static String
            CHOOSE_USER_FILTER = "(//span[@class='filter-title_title__2csu7'])[1]",
            ENTER_NAME_USER = "(//input[@placeholder='Search'])[2]",
            CHOOSE_NAME_USER = "//div[@class='css-15l7072-option not-selected']",
            CLICK_ON_ANY_PLACE_ON_THE_PAGE = "(//div[@aria-hidden='true'])[2]",
            ASSIGNEE_PRESENT_ON_THE_PAGE = "(//div[@title='2907'])[1]";

    public MainFilterEpic(WebDriver driver)
    {
        super(driver);
    }

    public void changeFilterCondition() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CHOOSE_USER_FILTER),
                "can't click on 'user' filter",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndSendKeys(
                By.xpath(ENTER_NAME_USER),
                "2907",
                "can't enter user name",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CHOOSE_NAME_USER),
                "can't find user name",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClickOnScreenByNotInteractableElement(
                By.xpath(CLICK_ON_ANY_PLACE_ON_THE_PAGE),
                "can't click on any place on the page",
                5
        );
        Thread.sleep(2000);
        this.assertElementHasText(
                By.xpath(ASSIGNEE_PRESENT_ON_THE_PAGE),
                "2907",
                "can't proof that assignee is chosen"
        );
    }
}
