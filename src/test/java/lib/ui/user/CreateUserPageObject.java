package lib.ui.user;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateUserPageObject extends MainPageObject {

    private final static String
    SIDE_TAB_STAFF = "//span[text()='Staff']",
    CREATE_BUTTON = "//span[text()='Create']",
    ENTER_EMAIL = "//input[@name='email']",
    ENTER_PASSWORD = "//input[@name='password']",
    ENTER_FIRST_NAME = "//textarea[@name='firstName']",
    ENTER_LAST_NAME = "//textarea[@name='lastName']",
    SELECT_ROLES = "(//span[@class='MuiIconButton-label'])[5]",
    SELECT_ADMIN_ROLE = "//div[text()='admin']",
    SAVE_BUTTON = "//span[text()='Save']",
    CONFIRM_USER_NAME_FIELD_IS_PRESENT = "//span[text()='Mari Sur']";

    public CreateUserPageObject(WebDriver driver)
    {
        super(driver);
    }

    public void createUserMethod() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(SIDE_TAB_STAFF),
                "can't click 'staff' side tab",5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CREATE_BUTTON),
                "can't click on 'create' button",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndSendKeys(
                By.xpath(ENTER_EMAIL),
                "mari@mail.com",
                "can't enter email",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndSendKeys(
                By.xpath(ENTER_PASSWORD),
                "Wimix1",
                "can't enter password",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndSendKeys(
                By.xpath(ENTER_FIRST_NAME),
                "Mari",
                "can't enter first name",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndSendKeys(
                By.xpath(ENTER_LAST_NAME),
                "Sur",
                "can't enter last name",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(SELECT_ROLES),
                "can't click on 'roles'",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(SELECT_ADMIN_ROLE),
                "can't select 'admin' role",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(SAVE_BUTTON),
                "can't click on 'save' button",
                5
        );
        Thread.sleep(2000);
        this.waitForElementPresent(
                By.xpath(CONFIRM_USER_NAME_FIELD_IS_PRESENT),
                "can't confirm user name field is present",
                5
        );
    }
}
