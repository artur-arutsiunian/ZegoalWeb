package PageObjects.Task;

import PageObjects.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateTaskPageObject extends MainPageObject {

    private final static String
            CREATE_BUTTON = "//button[@class='add-button_addButton__1w3Jt button_green__zFAs3 button_zgButton__19tY7']",
            CLICK_ON_FORM_FIELD = "(//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedStart'])[1]",
            CHOOSE_FORM = "(//span[@class='MuiIconButton-label'])[10]",
            CLICK_ON_LOCATION_FIELD = "(//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedStart'])[2]",
            CHOOSE_LOCATION = "(//span[@class='MuiIconButton-label'])[11]",
            CLICK_ON_ASSIGNEE_FIELD = "(//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedStart'])[1]",
            CHOOSE_ASSIGNEE = "(//span[@class='MuiIconButton-label'])[13]",
            COMPLETE_TASK_CREATION = "//span[@class='button_title__3rgHS']",
            NAME_ON_TOP = "//div[text()='Tasks']";

    public CreateTaskPageObject(WebDriver driver) {
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
    // если надо сделать ассерты, то надо на каждый шаг теста в этом классе создать тестовый метод(как ниже createTaskMethod1) и уже потом в taskTest прокидывать ассерты
        public Object createTaskMethod1() throws InterruptedException {
            Thread.sleep(2000);
            this.waitForElementPresent(
                    By.xpath(NAME_ON_TOP),
                    "can't find 'Tasks' title on the top of the main page",
                    5
            );

            WebElement element = driver.findElement(By.xpath("//div[text()='Tasks']"));
            String text = element.getText();
            return text;
        }
    }