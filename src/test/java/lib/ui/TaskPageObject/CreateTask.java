package lib.ui.TaskPageObject;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateTask extends MainPageObject {

    private final static String
            CREATE_BUTTON = "//button[@class='add-button_addButton__1w3Jt button_green__zFAs3 button_zgButton__19tY7']",
            CLICK_ON_FORM_FIELD = "(//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedStart'])[1]",
            CHOOSE_FORM = "(//span[@class='MuiIconButton-label'])[10]",
            CLICK_ON_LOCATION_FIELD = "(//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedStart'])[2]",
            CHOOSE_LOCATION = "(//span[@class='MuiIconButton-label'])[11]",
            CLICK_ON_ASSIGNEE_FIELD = "(//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedStart'])[1]",
            CHOOSE_ASSIGNEE = "//div[text()='andrew andrew']",
            COMPLETE_TASK_CREATION = "//span[@class='button_title__3rgHS']";

    public CreateTask(WebDriver driver) {
        super(driver);
    }

    public void createTaskMethod() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CREATE_BUTTON),
                "Can't find 'Create' button",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_FORM_FIELD),
                "can't find 'Form' field",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CHOOSE_FORM),
                "can't choose form",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_LOCATION_FIELD),
                "can't find 'Location' field",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CHOOSE_LOCATION),
                "can't choose location",
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
                By.xpath(COMPLETE_TASK_CREATION),
                "can't click on final 'Create' button",
                5
        );
    }
}