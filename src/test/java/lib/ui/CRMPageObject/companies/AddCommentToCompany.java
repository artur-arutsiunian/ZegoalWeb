package lib.ui.CRMPageObject.companies;

import lib.ui.MainPageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddCommentToCompany extends MainPageObject {

    private final static String
    MOVE_TO_CRM = "//span[text()='CRM']",
    CLICK_ON_FIRST_COMPANY_IN_THE_LIST = "//div[@class='scrollable-list_container__2NtNz']/div/div",
    LIST_OF_SUBTABS_IS_PRESENT = "//div[@class='MuiTabs-scroller MuiTabs-fixed']/div/button",
    TAB_ABOUT_IS_SELECTED = "//button[@aria-selected='true']",
    TAB_ABOUT_HAS_CORRECT_TEXT = "//button[@aria-selected='true']//span[text()='About']",
    CLICK_ON_COMMENTS_SUBTAB = "//span[text()='Comments']",
    ENTER_COMMENT_IN_THE_FIELD = "//textarea[@placeholder='Add comment']",
    CLICK_ON_ADD_BUTTON = "//span[text()='Add']",
    COMMENT_IS_PRESENT_ON_THE_PAGE = "//span[text()='new comment']";

    public List<WebElement> waitForElementsAndClick(By by, String error_message, long timeoutInSeconds) {
        List<WebElement> elements = this.waitForElementsPresent(by, error_message, 5);
        elements.get(0).click();
        return elements;
    }

    public AddCommentToCompany(WebDriver driver)
    {
        super(driver);
    }

    public void addCommentToCompanyMethod() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(MOVE_TO_CRM),
                "can't click on 'CRM'",
                5
        );
        Thread.sleep(2000);
        this.waitForElementsAndClick(
                By.xpath(CLICK_ON_FIRST_COMPANY_IN_THE_LIST),
                "can't click on first company in the list",
                5
        );
        Thread.sleep(2000);
        this.waitForElementsPresent(
                By.xpath(LIST_OF_SUBTABS_IS_PRESENT),
                "can't find list of subtabs on a specific company page",
                5
        );

        int amount_of_elements = getAmountOfElements(
                By.xpath(LIST_OF_SUBTABS_IS_PRESENT)
        );
        Assert.assertEquals("Incorrect number of subtabs on a specific company page", 3, amount_of_elements);

        Thread.sleep(2000);
        this.assertElementHasAttribute(
                By.xpath(TAB_ABOUT_IS_SELECTED),
                "aria-selected",
                "true",
                "can't proof that there is selected tab"
        );
        Thread.sleep(2000);
        this.assertElementHasText(
                By.xpath(TAB_ABOUT_HAS_CORRECT_TEXT),
                "About",
                "can't proof that 'about' tab has correct text"
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_COMMENTS_SUBTAB),
                "can't click on 'comments' subtab",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndSendKeys(
                By.xpath(ENTER_COMMENT_IN_THE_FIELD),
                "new comment",
                "can't enter comment in the field",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_ADD_BUTTON),
                "can't click on 'Add' button",
                5
        );
        Thread.sleep(5000);
        this.assertElementHasText(
                By.xpath(COMMENT_IS_PRESENT_ON_THE_PAGE),
                "new comment",
                "can't confirm that comment present on the page"
        );
    }
}
